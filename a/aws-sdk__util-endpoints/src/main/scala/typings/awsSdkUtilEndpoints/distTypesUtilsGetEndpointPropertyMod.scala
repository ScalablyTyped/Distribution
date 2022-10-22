package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointObjectProperty
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGetEndpointPropertyMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/getEndpointProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointProperty(property: EndpointObjectProperty, options: EvaluateOptions): EndpointObjectProperty = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointProperty")(property.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointObjectProperty]
}
