package typings.cucumberCucumber

import typings.cucumberCucumber.anon.PartialIRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiTestHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/api/test_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupEnvironment(): js.Promise[PartialIRunEnvironment] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupEnvironment")().asInstanceOf[js.Promise[PartialIRunEnvironment]]
  
  inline def teardownEnvironment(environment: IRunEnvironment): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("teardownEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
