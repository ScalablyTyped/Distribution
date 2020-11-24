package typings.clsx

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(classes: ClassValue*): String = js.native
  
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  
  type ClassValue = js.UndefOr[ClassArray | ClassDictionary | String | Double | Null | Boolean]
}
