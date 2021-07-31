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
    
    @scala.inline
    def apply(): AttributesResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributesResource]
    }
    
    @scala.inline
    implicit class AttributesResourceMutableBuilder[Self <: AttributesResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setAttributeType(value: String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
      
      @scala.inline
      def setAttributes(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): UnmarshalledAttributesResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAttributesResource]
    }
    
    @scala.inline
    implicit class UnmarshalledAttributesResourceMutableBuilder[Self <: UnmarshalledAttributesResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    }
  }
}
