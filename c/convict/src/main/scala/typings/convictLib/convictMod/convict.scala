package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait convict extends js.Object {
  def apply[T](config: convictLib.convictMod.convictNs.Schema[T]): convictLib.convictMod.convictNs.Config[T] = js.native
  def apply[T](config: java.lang.String): convictLib.convictMod.convictNs.Config[T] = js.native
  def addFormat(format: convictLib.convictMod.convictNs.Format): scala.Unit = js.native
  def addFormats(formats: ScalablyTyped.runtime.StringDictionary[convictLib.convictMod.convictNs.Format]): scala.Unit = js.native
  def addParser(parsers: convictLib.convictMod.convictNs.Parser): scala.Unit = js.native
  def addParser(parsers: js.Array[convictLib.convictMod.convictNs.Parser]): scala.Unit = js.native
}

