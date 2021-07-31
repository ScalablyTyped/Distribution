package typings.classnames

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ClassArray
    extends StObject
       with Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  
  @js.native
  trait ClassNamesExport
    extends StObject
       with ClassNamesFn {
    
    def default(classes: ClassValue*): String = js.native
    @JSName("default")
    var default_Original: ClassNamesFn = js.native
  }
  
  @js.native
  trait ClassNamesFn extends StObject {
    
    def apply(classes: ClassValue*): String = js.native
  }
  
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}
