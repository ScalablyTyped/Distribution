package typings.bufferstream.mod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferStream extends Duplex {
  /*
  		returns Buffer.
  	*/
  var buffer: Buffer = js.native
  /*
  		shortcut for buffer.length
  	*/
  var length: Double = js.native
  /*
  		flushes buffer and disables stream buffering. BufferStream now pipes all data as long as the output accepting data. when the output is draining BufferStream will buffer all input temporary.
  		token[s] buffer splitters (should be String or Buffer)
  		disables given tokens. wont flush until no splitter tokens are left.
  	*/
  def disable(): Unit = js.native
  def disable(token: String, tokens: String*): Unit = js.native
  def disable(tokens: js.Array[Buffer | String]): Unit = js.native
  def disable(token: Buffer, tokens: Buffer*): Unit = js.native
   // can be one of ['none', 'flexible', <number>]
  /*
  		enables stream buffering default
  	*/
  def enable(): Unit = js.native
  /*
  		returns Buffer.
  	*/
  def getBuffer(): Buffer = js.native
  /*
  		different buffer behaviors can be triggered by size:
  		none when output drains, bufferstream drains too
  		flexible buffers everthing that it gets and not piping out
  		<number> TODO buffer has given size. buffers everthing until buffer is full. when buffer is full then the stream will drain
  	*/
  def setSize(size: String): Unit = js.native
  def setSize(size: Double): Unit = js.native
  def split(token: String, tokens: String*): Unit = js.native
  /*
  		each time BufferStream finds a splitter token in the input data it will emit a split event. this also works for binary data.
  		token[s] buffer splitters (should be String or Buffer)
  	*/
  def split(tokens: js.Array[Buffer | String]): Unit = js.native
  def split(token: Buffer, tokens: Buffer*): Unit = js.native
}

