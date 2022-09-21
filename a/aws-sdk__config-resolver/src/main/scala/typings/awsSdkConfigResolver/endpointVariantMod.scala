package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.endpointVariantTagMod.EndpointVariantTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointVariantMod {
  
  trait EndpointVariant extends StObject {
    
    var hostname: String
    
    var tags: js.Array[EndpointVariantTag]
  }
  object EndpointVariant {
    
    inline def apply(hostname: String, tags: js.Array[EndpointVariantTag]): EndpointVariant = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointVariant]
    }
    
    extension [Self <: EndpointVariant](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[EndpointVariantTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: EndpointVariantTag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
