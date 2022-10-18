package typings.cucumberCiEnvironment

import typings.cucumberCiEnvironment.distCjsSrcTypesMod.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcEvaluateVariableExpressionMod {
  
  @JSImport("@cucumber/ci-environment/dist/cjs/src/evaluateVariableExpression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(expression: String, env: Env): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def default(expression: Unit, env: Env): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
