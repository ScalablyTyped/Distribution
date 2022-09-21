package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.endpointVariantMod.EndpointVariant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Endpoint extends StObject {
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var regionRegex: String
    
    var regions: js.Array[String]
    
    var variants: js.Array[EndpointVariant]
  }
  object Endpoint {
    
    inline def apply(regionRegex: String, regions: js.Array[String], variants: js.Array[EndpointVariant]): Endpoint = {
      val __obj = js.Dynamic.literal(regionRegex = regionRegex.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setRegionRegex(value: String): Self = StObject.set(x, "regionRegex", value.asInstanceOf[js.Any])
      
      inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
      
      inline def setVariants(value: js.Array[EndpointVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: EndpointVariant*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  trait SigningRegion extends StObject {
    
    var signingRegion: js.UndefOr[String] = js.undefined
    
    var signingService: js.UndefOr[String] = js.undefined
    
    var variants: js.Array[EndpointVariant]
  }
  object SigningRegion {
    
    inline def apply(variants: js.Array[EndpointVariant]): SigningRegion = {
      val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigningRegion]
    }
    
    extension [Self <: SigningRegion](x: Self) {
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setSigningService(value: String): Self = StObject.set(x, "signingService", value.asInstanceOf[js.Any])
      
      inline def setSigningServiceUndefined: Self = StObject.set(x, "signingService", js.undefined)
      
      inline def setVariants(value: js.Array[EndpointVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: EndpointVariant*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
}
