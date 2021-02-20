package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIPSetResponse extends StObject {
  
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  
  /**
    * The URI of the file that contains the IPSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: typings.awsSdk.guarddutyMod.Location = js.native
  
  /**
    * The user-friendly name for the IPSet.
    */
  var Name: typings.awsSdk.guarddutyMod.Name = js.native
  
  /**
    * The status of IPSet file that was uploaded.
    */
  var Status: IpSetStatus = js.native
  
  /**
    * The tags of the IPSet resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object GetIPSetResponse {
  
  @scala.inline
  def apply(Format: IpSetFormat, Location: Location, Name: Name, Status: IpSetStatus): GetIPSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
  
  @scala.inline
  implicit class GetIPSetResponseMutableBuilder[Self <: GetIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: IpSetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: IpSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
