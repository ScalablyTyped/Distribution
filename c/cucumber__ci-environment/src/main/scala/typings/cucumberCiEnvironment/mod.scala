package typings.cucumberCiEnvironment

import typings.cucumberCiEnvironment.typesMod.CiEnvironment
import typings.cucumberCiEnvironment.typesMod.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/ci-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(env: Env): js.UndefOr[CiEnvironment] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(env.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CiEnvironment]]
}
