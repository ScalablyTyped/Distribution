package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetDimensionMod {
  
  @js.native
  trait SetDimension extends StObject {
    
    /**
      * The type of dimension:
      *
      * INCLUSIVE - Endpoints that match the criteria are included in the segment.
      *
      * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
      */
    var DimensionType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.native
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    var Values: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  }
  object SetDimension {
    
    @scala.inline
    def apply(): SetDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDimension]
    }
    
    @scala.inline
    implicit class SetDimensionMutableBuilder[Self <: SetDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensionType(value: INCLUSIVE | EXCLUSIVE | String): Self = StObject.set(x, "DimensionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionTypeUndefined: Self = StObject.set(x, "DimensionType", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledSetDimension extends SetDimension {
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    @JSName("Values")
    var Values_UnmarshalledSetDimension: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledSetDimension {
    
    @scala.inline
    def apply(): UnmarshalledSetDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSetDimension]
    }
    
    @scala.inline
    implicit class UnmarshalledSetDimensionMutableBuilder[Self <: UnmarshalledSetDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
    }
  }
}
