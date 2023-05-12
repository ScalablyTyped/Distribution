package typings.cucumberCucumber

import typings.cucumberCucumber.anon.RequiredIRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiEnvironmentMod {
  
  @JSImport("@cucumber/cucumber/lib/api/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeEnvironment(provided: IRunEnvironment): RequiredIRunEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeEnvironment")(provided.asInstanceOf[js.Any]).asInstanceOf[RequiredIRunEnvironment]
}
