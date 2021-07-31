package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeDimensionMod {
  
  trait AttributeDimension extends StObject {
    
    /**
      * The type of dimension:
      *
      * INCLUSIVE - Endpoints that match the criteria are included in the segment.
      *
      * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
      */
    var AttributeType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.undefined
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    var Values: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  }
  object AttributeDimension {
    
    @scala.inline
    def apply(): AttributeDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeDimension]
    }
    
    @scala.inline
    implicit class AttributeDimensionMutableBuilder[Self <: AttributeDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeType(value: INCLUSIVE | EXCLUSIVE | String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledAttributeDimension
    extends StObject
       with AttributeDimension {
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    @JSName("Values")
    var Values_UnmarshalledAttributeDimension: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledAttributeDimension {
    
    @scala.inline
    def apply(): UnmarshalledAttributeDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAttributeDimension]
    }
    
    @scala.inline
    implicit class UnmarshalledAttributeDimensionMutableBuilder[Self <: UnmarshalledAttributeDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
    }
  }
}
