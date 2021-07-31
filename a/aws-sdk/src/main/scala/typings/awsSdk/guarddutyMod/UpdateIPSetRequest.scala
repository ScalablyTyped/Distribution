package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIPSetRequest extends StObject {
  
  /**
    * The updated Boolean value that specifies whether the IPSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var IpSetId: String
  
  /**
    * The updated URI of the file that contains the IPSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: js.UndefOr[typings.awsSdk.guarddutyMod.Location] = js.undefined
  
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.guarddutyMod.Name] = js.undefined
}
object UpdateIPSetRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
  
  @scala.inline
  implicit class UpdateIPSetRequestMutableBuilder[Self <: UpdateIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "Activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "Activate", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
