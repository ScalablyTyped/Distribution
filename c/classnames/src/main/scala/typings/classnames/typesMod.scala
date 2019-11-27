package typings.classnames

import org.scalablytyped.runtime.StringDictionary
import typings.classnames.typesMod.ClassArray
import typings.classnames.typesMod.ClassDictionary
import typings.classnames.typesMod.ClassNamesFn
import typings.classnames.typesMod.ClassValue
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("classnames/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  type ClassNamesExport = ClassNamesFn with Anon_Default
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, String]
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}

