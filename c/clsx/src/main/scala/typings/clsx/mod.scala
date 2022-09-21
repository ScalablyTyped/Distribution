package typings.clsx

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(inputs: ClassValue*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def clsx(inputs: ClassValue*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clsx")(inputs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  type ClassArray = js.Array[ClassValue]
  
  type ClassDictionary = Record[String, Any]
  
  type ClassValue = js.UndefOr[Any | ClassDictionary | String | Double | Null | Boolean]
}
