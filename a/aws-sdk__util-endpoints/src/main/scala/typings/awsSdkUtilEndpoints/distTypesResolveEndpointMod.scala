package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesTypesRuleSetObjectMod.RuleSetObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EndpointResolverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveEndpointMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/resolveEndpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpoint(ruleSetObject: RuleSetObject, options: EndpointResolverOptions): EndpointV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpoint")(ruleSetObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointV2]
}
