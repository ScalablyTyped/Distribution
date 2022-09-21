package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeGroupSummary extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group across services.
    */
  var arn: js.UndefOr[AttributeGroupArn] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the attribute group that the user provides.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The globally unique attribute group identifier of the attribute group.
    */
  var id: js.UndefOr[AttributeGroupId] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the creationTime for a newly created attribute group.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the attribute group.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object AttributeGroupSummary {
  
  inline def apply(): AttributeGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeGroupSummary]
  }
  
  extension [Self <: AttributeGroupSummary](x: Self) {
    
    inline def setArn(value: AttributeGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: AttributeGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
