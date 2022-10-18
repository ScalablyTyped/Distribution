package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCosMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/cos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/cos", "cosFunctionCheck")
  @js.native
  val cosFunctionCheck: /* "cos(" */ String = js.native
  
  inline def transformCosFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCosFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
