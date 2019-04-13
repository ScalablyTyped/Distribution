package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait convict extends js.Object {
  def apply[T](config: Schema[T]): Config[T] = js.native
  def apply[T](config: java.lang.String): Config[T] = js.native
  def addFormat(format: Format): scala.Unit = js.native
  def addFormats(formats: org.scalablytyped.runtime.StringDictionary[Format]): scala.Unit = js.native
  def addParser(parsers: Parser): scala.Unit = js.native
  def addParser(parsers: js.Array[Parser]): scala.Unit = js.native
}

