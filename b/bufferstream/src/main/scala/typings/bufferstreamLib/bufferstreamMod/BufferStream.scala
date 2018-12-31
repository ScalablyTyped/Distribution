package typings
package bufferstreamLib.bufferstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferStream
  extends nodeLib.streamMod.Duplex {
  /*
  		returns Buffer.
  	*/
  var buffer: nodeLib.Buffer = js.native
  /*
  		shortcut for buffer.length
  	*/
  var length: scala.Double = js.native
  /*
  		flushes buffer and disables stream buffering. BufferStream now pipes all data as long as the output accepting data. when the output is draining BufferStream will buffer all input temporary.
  		token[s] buffer splitters (should be String or Buffer)
  		disables given tokens. wont flush until no splitter tokens are left.
  	*/
  def disable(): scala.Unit = js.native
  def disable(token: java.lang.String, tokens: java.lang.String*): scala.Unit = js.native
  def disable(token: nodeLib.Buffer, tokens: nodeLib.Buffer*): scala.Unit = js.native
  def disable(tokens: js.Array[nodeLib.Buffer | java.lang.String]): scala.Unit = js.native
   // can be one of ['none', 'flexible', <number>]
  /*
  		enables stream buffering default
  	*/
  def enable(): scala.Unit = js.native
  /*
  		returns Buffer.
  	*/
  def getBuffer(): nodeLib.Buffer = js.native
  /*
  		different buffer behaviors can be triggered by size:
  		none when output drains, bufferstream drains too
  		flexible buffers everthing that it gets and not piping out
  		<number> TODO buffer has given size. buffers everthing until buffer is full. when buffer is full then the stream will drain
  	*/
  def setSize(size: java.lang.String): scala.Unit = js.native
  def setSize(size: scala.Double): scala.Unit = js.native
  def split(token: java.lang.String, tokens: java.lang.String*): scala.Unit = js.native
  def split(token: nodeLib.Buffer, tokens: nodeLib.Buffer*): scala.Unit = js.native
  /*
  		each time BufferStream finds a splitter token in the input data it will emit a split event. this also works for binary data.
  		token[s] buffer splitters (should be String or Buffer)
  	*/
  def split(tokens: js.Array[nodeLib.Buffer | java.lang.String]): scala.Unit = js.native
}

