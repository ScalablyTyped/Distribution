package typings.cucumberCiEnvironment

import typings.cucumberCiEnvironment.distCjsSrcTypesMod.CiEnvironment
import typings.cucumberCiEnvironment.distCjsSrcTypesMod.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcDetectCiEnvironmentMod {
  
  @JSImport("@cucumber/ci-environment/dist/cjs/src/detectCiEnvironment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(env: Env): js.UndefOr[CiEnvironment] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(env.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CiEnvironment]]
  
  inline def removeUserInfoFromUrl(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUserInfoFromUrl")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
