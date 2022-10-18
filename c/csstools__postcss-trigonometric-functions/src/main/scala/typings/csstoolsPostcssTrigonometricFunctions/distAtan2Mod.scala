package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAtan2Mod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/atan2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/atan2", "atan2FunctionCheck")
  @js.native
  val atan2FunctionCheck: /* "atan2(" */ String = js.native
  
  inline def transformAtan2Function(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAtan2Function")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
