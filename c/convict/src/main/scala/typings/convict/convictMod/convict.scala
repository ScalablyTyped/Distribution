package typings.convict.convictMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait convict extends js.Object {
  def apply[T](config: String): Config[T] = js.native
  def apply[T](config: Schema[T]): Config[T] = js.native
  def addFormat(format: Format): Unit = js.native
  def addFormats(formats: StringDictionary[Format]): Unit = js.native
  def addParser(parsers: js.Array[Parser]): Unit = js.native
  def addParser(parsers: Parser): Unit = js.native
}

