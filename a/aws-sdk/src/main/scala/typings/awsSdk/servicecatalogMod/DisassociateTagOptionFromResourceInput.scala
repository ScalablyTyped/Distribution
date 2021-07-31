package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTagOptionFromResourceInput extends StObject {
  
  /**
    * The resource identifier.
    */
  var ResourceId: typings.awsSdk.servicecatalogMod.ResourceId
  
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsSdk.servicecatalogMod.TagOptionId
}
object DisassociateTagOptionFromResourceInput {
  
  @scala.inline
  def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
  }
  
  @scala.inline
  implicit class DisassociateTagOptionFromResourceInputMutableBuilder[Self <: DisassociateTagOptionFromResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionId(value: TagOptionId): Self = StObject.set(x, "TagOptionId", value.asInstanceOf[js.Any])
  }
}
