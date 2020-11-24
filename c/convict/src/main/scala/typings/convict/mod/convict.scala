package typings.convict.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait convict extends js.Object {
  
  def apply[T](config: String): Config[T] = js.native
  def apply[T](config: String, opts: Options): Config[T] = js.native
  def apply[T](config: Schema[T]): Config[T] = js.native
  def apply[T](config: Schema[T], opts: Options): Config[T] = js.native
  
  def addFormat(format: Format): Unit = js.native
  
  def addFormats(formats: StringDictionary[Format]): Unit = js.native
  
  def addParser(parsers: js.Array[Parser]): Unit = js.native
  def addParser(parsers: Parser): Unit = js.native
}
