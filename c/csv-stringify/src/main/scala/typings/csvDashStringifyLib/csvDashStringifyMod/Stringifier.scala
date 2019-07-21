package typings
package csvDashStringifyLib.csvDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stringifier
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def write(
    buffer: java.lang.String,
    cb: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def write(
    buffer: nodeLib.Buffer,
    cb: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  def write(line: js.Any): scala.Boolean = js.native
  def write(line: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    line: js.Any,
    encoding: java.lang.String,
    cb: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  // Stringifier stream takes array of strings or Object, and optional encoding and callback
  def write(line: js.Array[java.lang.String]): scala.Boolean = js.native
  def write(line: js.Array[java.lang.String], encoding: java.lang.String): scala.Boolean = js.native
  def write(
    line: js.Array[java.lang.String],
    encoding: java.lang.String,
    cb: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* output */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
}

