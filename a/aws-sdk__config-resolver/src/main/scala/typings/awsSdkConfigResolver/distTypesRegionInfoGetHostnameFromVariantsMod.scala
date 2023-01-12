package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesRegionInfoEndpointVariantMod.EndpointVariant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionInfoGetHostnameFromVariantsMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionInfo/getHostnameFromVariants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHostnameFromVariants(variants: js.Array[EndpointVariant], param1: GetHostnameFromVariantsOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostnameFromVariants")(variants.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getHostnameFromVariants(variants: Unit, param1: GetHostnameFromVariantsOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostnameFromVariants")(variants.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait GetHostnameFromVariantsOptions extends StObject {
    
    var useDualstackEndpoint: Boolean
    
    var useFipsEndpoint: Boolean
  }
  object GetHostnameFromVariantsOptions {
    
    inline def apply(useDualstackEndpoint: Boolean, useFipsEndpoint: Boolean): GetHostnameFromVariantsOptions = {
      val __obj = js.Dynamic.literal(useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHostnameFromVariantsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetHostnameFromVariantsOptions] (val x: Self) extends AnyVal {
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
