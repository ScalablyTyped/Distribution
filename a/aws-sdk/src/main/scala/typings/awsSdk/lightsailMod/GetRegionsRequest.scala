package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegionsRequest extends js.Object {
  
  /**
    * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability Zones are indicated with a letter: e.g., us-east-2a.
    */
  var includeAvailabilityZones: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value indicating whether to also include Availability Zones for databases in your get regions request. Availability Zones are indicated with a letter (e.g., us-east-2a).
    */
  var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.native
}
object GetRegionsRequest {
  
  @scala.inline
  def apply(): GetRegionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsRequest]
  }
  
  @scala.inline
  implicit class GetRegionsRequestOps[Self <: GetRegionsRequest] (val x: Self) extends AnyVal {
    
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
    def setIncludeAvailabilityZones(value: Boolean): Self = this.set("includeAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAvailabilityZones: Self = this.set("includeAvailabilityZones", js.undefined)
    
    @scala.inline
    def setIncludeRelationalDatabaseAvailabilityZones(value: Boolean): Self = this.set("includeRelationalDatabaseAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRelationalDatabaseAvailabilityZones: Self = this.set("includeRelationalDatabaseAvailabilityZones", js.undefined)
  }
}
