package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atanMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/atan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/atan", "atanFunctionCheck")
  @js.native
  val atanFunctionCheck: /* "atan(" */ String = js.native
  
  inline def transformAtanFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAtanFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
