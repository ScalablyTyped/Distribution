package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFpgaImageRequest extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
    */
  var InputStorageLocation: StorageLocation = js.native
  
  /**
    * The location in Amazon S3 for the output logs.
    */
  var LogsStorageLocation: js.UndefOr[StorageLocation] = js.native
  
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The tags to apply to the FPGA image during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateFpgaImageRequest {
  
  @scala.inline
  def apply(InputStorageLocation: StorageLocation): CreateFpgaImageRequest = {
    val __obj = js.Dynamic.literal(InputStorageLocation = InputStorageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFpgaImageRequest]
  }
  
  @scala.inline
  implicit class CreateFpgaImageRequestOps[Self <: CreateFpgaImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputStorageLocation(value: StorageLocation): Self = this.set("InputStorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setLogsStorageLocation(value: StorageLocation): Self = this.set("LogsStorageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogsStorageLocation: Self = this.set("LogsStorageLocation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
