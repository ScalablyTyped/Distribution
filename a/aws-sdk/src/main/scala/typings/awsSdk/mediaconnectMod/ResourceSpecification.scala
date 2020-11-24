package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSpecification extends js.Object {
  
  /**
    * The amount of outbound bandwidth that is discounted in the offering.
    */
  var ReservedBitrate: js.UndefOr[integer] = js.native
  
  /**
    * The type of resource and the unit that is being billed for.
    */
  var ResourceType: typings.awsSdk.mediaconnectMod.ResourceType = js.native
}
object ResourceSpecification {
  
  @scala.inline
  def apply(ResourceType: ResourceType): ResourceSpecification = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpecification]
  }
  
  @scala.inline
  implicit class ResourceSpecificationOps[Self <: ResourceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedBitrate(value: integer): Self = this.set("ReservedBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedBitrate: Self = this.set("ReservedBitrate", js.undefined)
  }
}
