package typings.cliColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, begin: Double): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, begin: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, begin: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cli-color/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
