package typings.clsx

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(classes: ClassValue*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait ClassArray
    extends StObject
       with Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  
  type ClassValue = js.UndefOr[ClassArray | ClassDictionary | String | Double | Null | Boolean]
}
