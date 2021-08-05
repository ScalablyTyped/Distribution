package typings.awsSdkClientPinpointBrowser

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributesResourceMod {
  
  trait AttributesResource extends StObject {
    
    /**
      * The unique ID for the application.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The attribute type for the application.
      */
    var AttributeType: js.UndefOr[String] = js.undefined
    
    /**
      * The attributes for the application.
      */
    var Attributes: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  }
  object AttributesResource {
    
    inline def apply(): AttributesResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributesResource]
    }
    
    extension [Self <: AttributesResource](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setAttributeType(value: String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
      
      inline def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
      
      inline def setAttributes(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledAttributesResource
    extends StObject
       with AttributesResource {
    
    /**
      * The attributes for the application.
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledAttributesResource: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledAttributesResource {
    
    inline def apply(): UnmarshalledAttributesResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAttributesResource]
    }
    
    extension [Self <: UnmarshalledAttributesResource](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    }
  }
}
