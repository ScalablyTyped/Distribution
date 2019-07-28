package typings.csvDashStringify.csvDashStringifyMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadWriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stringifier extends ReadWriteStream {
  def write(buffer: String, cb: js.Function2[/* error */ js.UndefOr[Error], /* output */ String, Unit]): Boolean = js.native
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function2[/* error */ js.UndefOr[Error], /* output */ String, Unit]): Boolean = js.native
  def write(line: js.Any): Boolean = js.native
  def write(line: js.Any, encoding: String): Boolean = js.native
  def write(
    line: js.Any,
    encoding: String,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* output */ String, Unit]
  ): Boolean = js.native
  // Stringifier stream takes array of strings or Object, and optional encoding and callback
  def write(line: js.Array[String]): Boolean = js.native
  def write(line: js.Array[String], encoding: String): Boolean = js.native
  def write(
    line: js.Array[String],
    encoding: String,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* output */ String, Unit]
  ): Boolean = js.native
}

