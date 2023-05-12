package typings.bson

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidateUtf8Mod {
  
  @JSImport("bson/lib/validate_utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateUtf8(bytes: NumberDictionary[Double], start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUtf8")(bytes.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
