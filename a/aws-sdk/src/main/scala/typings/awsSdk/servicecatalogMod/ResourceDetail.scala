package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetail extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var ARN: js.UndefOr[ResourceDetailARN] = js.native
  
  /**
    * The creation time of the resource.
    */
  var CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.native
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[ResourceDetailDescription] = js.native
  
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[ResourceDetailId] = js.native
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceDetailName] = js.native
}
object ResourceDetail {
  
  @scala.inline
  def apply(): ResourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetail]
  }
  
  @scala.inline
  implicit class ResourceDetailMutableBuilder[Self <: ResourceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceDetailARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: ResourceDetailCreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDetailDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceDetailId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceDetailName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
