package typings.clsx

import org.scalablytyped.runtime.StringDictionary
import typings.clsx.clsxMod.ClassArray
import typings.clsx.clsxMod.ClassDictionary
import typings.clsx.clsxMod.ClassValue
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clsx", JSImport.Namespace)
@js.native
object clsxMod extends js.Object {
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  def default(classes: ClassValue*): String = js.native
  type ClassDictionary = StringDictionary[js.Any]
  type ClassValue = js.UndefOr[ClassArray | ClassDictionary | String | Double | Null | Boolean]
}

