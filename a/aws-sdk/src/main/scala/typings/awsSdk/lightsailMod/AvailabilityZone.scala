package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZone extends StObject {
  
  /**
    * The state of the Availability Zone.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the Availability Zone. The format is us-east-2a (case-sensitive).
    */
  var zoneName: js.UndefOr[NonEmptyString] = js.native
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
    def setState(value: NonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setZoneName(value: NonEmptyString): Self = StObject.set(x, "zoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneNameUndefined: Self = StObject.set(x, "zoneName", js.undefined)
  }
}
