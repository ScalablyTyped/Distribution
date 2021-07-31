package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFpgaImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The description for the new AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name for the new AFI. The default is the name of the source AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the source AFI.
    */
  var SourceFpgaImageId: String
  
  /**
    * The Region that contains the source AFI.
    */
  var SourceRegion: String
}
object CopyFpgaImageRequest {
  
  @scala.inline
  def apply(SourceFpgaImageId: String, SourceRegion: String): CopyFpgaImageRequest = {
    val __obj = js.Dynamic.literal(SourceFpgaImageId = SourceFpgaImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFpgaImageRequest]
  }
  
  @scala.inline
  implicit class CopyFpgaImageRequestMutableBuilder[Self <: CopyFpgaImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSourceFpgaImageId(value: String): Self = StObject.set(x, "SourceFpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
  }
}
