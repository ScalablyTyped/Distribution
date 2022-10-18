package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSinMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/sin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/sin", "sinFunctionCheck")
  @js.native
  val sinFunctionCheck: /* "sin(" */ String = js.native
  
  inline def transformSinFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSinFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
