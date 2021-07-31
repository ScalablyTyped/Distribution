package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThingTypeResponse extends StObject {
  
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
  
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  
  /**
    * The ThingTypeProperties contains information about the thing type including description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
}
object DescribeThingTypeResponse {
  
  @scala.inline
  def apply(): DescribeThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingTypeResponse]
  }
  
  @scala.inline
  implicit class DescribeThingTypeResponseMutableBuilder[Self <: DescribeThingTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingTypeArn(value: ThingTypeArn): Self = StObject.set(x, "thingTypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeArnUndefined: Self = StObject.set(x, "thingTypeArn", js.undefined)
    
    @scala.inline
    def setThingTypeId(value: ThingTypeId): Self = StObject.set(x, "thingTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeIdUndefined: Self = StObject.set(x, "thingTypeId", js.undefined)
    
    @scala.inline
    def setThingTypeMetadata(value: ThingTypeMetadata): Self = StObject.set(x, "thingTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeMetadataUndefined: Self = StObject.set(x, "thingTypeMetadata", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    
    @scala.inline
    def setThingTypeProperties(value: ThingTypeProperties): Self = StObject.set(x, "thingTypeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypePropertiesUndefined: Self = StObject.set(x, "thingTypeProperties", js.undefined)
  }
}
