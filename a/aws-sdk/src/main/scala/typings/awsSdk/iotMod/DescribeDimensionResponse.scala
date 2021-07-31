package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionResponse extends StObject {
  
  /**
    * The ARN (Amazon resource name) for the dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.undefined
  
  /**
    * The date the dimension was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The date the dimension was last modified.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
  
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
  
  @scala.inline
  def apply(): DescribeDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDimensionResponse]
  }
  
  @scala.inline
  implicit class DescribeDimensionResponseMutableBuilder[Self <: DescribeDimensionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: DimensionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStringValues(value: DimensionStringValues): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: DimensionStringValue*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DimensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
