package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceProfile extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The description of the instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * An array of strings containing the list of app packages that should not be cleaned up from the device after a test run completes. The list of packages is considered only if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * When set to true, Device Farm removes app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to true, Device Farm reboots the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}
object InstanceProfile {
  
  @scala.inline
  def apply(): InstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProfile]
  }
  
  @scala.inline
  implicit class InstanceProfileOps[Self <: InstanceProfile] (val x: Self) extends AnyVal {
    
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
    def deleteArn: Self = this.set("arn", js.undefined)
    
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
