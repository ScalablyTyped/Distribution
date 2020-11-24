package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLocation extends js.Object {
  
  /**
    * The Availability Zone. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The AWS Region name.
    */
  var regionName: js.UndefOr[RegionName] = js.native
}
object ResourceLocation {
  
  @scala.inline
  def apply(): ResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLocation]
  }
  
  @scala.inline
  implicit class ResourceLocationOps[Self <: ResourceLocation] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = this.set("regionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionName: Self = this.set("regionName", js.undefined)
  }
}
