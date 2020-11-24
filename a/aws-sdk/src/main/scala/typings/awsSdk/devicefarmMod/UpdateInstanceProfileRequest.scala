package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceProfileRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * The updated description for your instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  
  /**
    * The updated name for your instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The updated choice for whether you want to specify package cleanup. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  
  /**
    * The updated choice for whether you want to reboot the device after use. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}
object UpdateInstanceProfileRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceProfileRequestOps[Self <: UpdateInstanceProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExcludeAppPackagesFromCleanupVarargs(value: String*): Self = this.set("excludeAppPackagesFromCleanup", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAppPackagesFromCleanup(value: PackageIds): Self = this.set("excludeAppPackagesFromCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAppPackagesFromCleanup: Self = this.set("excludeAppPackagesFromCleanup", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPackageCleanup(value: Boolean): Self = this.set("packageCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageCleanup: Self = this.set("packageCleanup", js.undefined)
    
    @scala.inline
    def setRebootAfterUse(value: Boolean): Self = this.set("rebootAfterUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebootAfterUse: Self = this.set("rebootAfterUse", js.undefined)
  }
}
