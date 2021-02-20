package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: Boolean = js.native
  
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.native
  
  /**
    * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  
  /**
    * The URI of the file that contains the IPSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: typings.awsSdk.guarddutyMod.Location = js.native
  
  /**
    * The user-friendly name to identify the IPSet.  Allowed characters are alphanumerics, spaces, hyphens (-), and underscores (_).
    */
  var Name: typings.awsSdk.guarddutyMod.Name = js.native
  
  /**
    * The tags to be added to a new IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateIPSetRequest {
  
  @scala.inline
  def apply(Activate: Boolean, DetectorId: DetectorId, Format: IpSetFormat, Location: Location, Name: Name): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
  
  @scala.inline
  implicit class CreateIPSetRequestMutableBuilder[Self <: CreateIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "Activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IpSetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
