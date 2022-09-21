package typings.azureCoreHttp

import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndJsonPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/ndJsonPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ndJsonPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("ndJsonPolicy")().asInstanceOf[RequestPolicyFactory]
}
