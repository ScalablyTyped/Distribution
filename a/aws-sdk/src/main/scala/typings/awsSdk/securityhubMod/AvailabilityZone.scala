package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZone extends StObject {
  
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[NonEmptyString] = js.native
}
object AvailabilityZone {
  
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  @scala.inline
  implicit class AvailabilityZoneMutableBuilder[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setZoneName(value: NonEmptyString): Self = StObject.set(x, "ZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneNameUndefined: Self = StObject.set(x, "ZoneName", js.undefined)
  }
}
