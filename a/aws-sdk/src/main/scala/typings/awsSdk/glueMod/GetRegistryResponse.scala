package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistryResponse extends StObject {
  
  /**
    * The date and time the registry was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * A description of the registry.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The status of the registry.
    */
  var Status: js.UndefOr[RegistryStatus] = js.undefined
  
  /**
    * The date and time the registry was updated.
    */
  var UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.undefined
}
object GetRegistryResponse {
  
  @scala.inline
  def apply(): GetRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistryResponse]
  }
  
  @scala.inline
  implicit class GetRegistryResponseMutableBuilder[Self <: GetRegistryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setStatus(value: RegistryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTimestamp): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
