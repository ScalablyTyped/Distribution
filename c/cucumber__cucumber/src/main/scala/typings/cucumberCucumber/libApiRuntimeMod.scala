package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Cwd
import typings.cucumberCucumber.libRuntimeMod.IRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiRuntimeMod {
  
  @JSImport("@cucumber/cucumber/lib/api/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRuntime(param0: Cwd): IRuntime = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRuntime")(param0.asInstanceOf[js.Any]).asInstanceOf[IRuntime]
}
