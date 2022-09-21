package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.undefined
  
  /**
    * The date the dimension was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the dimension was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.undefined
  
  /**
    * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used to match the MQTT topic name.
    */
  var stringValues: js.UndefOr[DimensionStringValues] = js.undefined
  
  /**
    * The type of the dimension.
    */
  var `type`: js.UndefOr[DimensionType] = js.undefined
}
object DescribeDimensionResponse {
  
  inline def apply(): DescribeDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDimensionResponse]
  }
  
  extension [Self <: DescribeDimensionResponse](x: Self) {
    
    inline def setArn(value: DimensionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStringValues(value: DimensionStringValues): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: DimensionStringValue*): Self = StObject.set(x, "stringValues", js.Array(value*))
    
    inline def setType(value: DimensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
