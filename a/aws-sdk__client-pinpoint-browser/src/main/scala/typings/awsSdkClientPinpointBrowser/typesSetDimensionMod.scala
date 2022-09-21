package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetDimensionMod {
  
  trait SetDimension extends StObject {
    
    /**
      * The type of dimension:
      *
      * INCLUSIVE - Endpoints that match the criteria are included in the segment.
      *
      * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
      */
    var DimensionType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.undefined
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    var Values: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  }
  object SetDimension {
    
    inline def apply(): SetDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDimension]
    }
    
    extension [Self <: SetDimension](x: Self) {
      
      inline def setDimensionType(value: INCLUSIVE | EXCLUSIVE | String): Self = StObject.set(x, "DimensionType", value.asInstanceOf[js.Any])
      
      inline def setDimensionTypeUndefined: Self = StObject.set(x, "DimensionType", js.undefined)
      
      inline def setValues(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
    }
  }
  
  trait UnmarshalledSetDimension
    extends StObject
       with SetDimension {
    
    /**
      * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
      */
    @JSName("Values")
    var Values_UnmarshalledSetDimension: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledSetDimension {
    
    inline def apply(): UnmarshalledSetDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSetDimension]
    }
    
    extension [Self <: UnmarshalledSetDimension](x: Self) {
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
    }
  }
}
