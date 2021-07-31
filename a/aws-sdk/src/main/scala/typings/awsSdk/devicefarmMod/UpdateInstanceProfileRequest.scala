package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: AmazonResourceName
  
  /**
    * The updated description for your instance profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined
  
  /**
    * The updated name for your instance profile.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The updated choice for whether you want to specify package cleanup. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated choice for whether you want to reboot the device after use. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.undefined
}
object UpdateInstanceProfileRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceProfileRequestMutableBuilder[Self <: UpdateInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExcludeAppPackagesFromCleanup(value: PackageIds): Self = StObject.set(x, "excludeAppPackagesFromCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAppPackagesFromCleanupUndefined: Self = StObject.set(x, "excludeAppPackagesFromCleanup", js.undefined)
    
    @scala.inline
    def setExcludeAppPackagesFromCleanupVarargs(value: String*): Self = StObject.set(x, "excludeAppPackagesFromCleanup", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPackageCleanup(value: Boolean): Self = StObject.set(x, "packageCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageCleanupUndefined: Self = StObject.set(x, "packageCleanup", js.undefined)
    
    @scala.inline
    def setRebootAfterUse(value: Boolean): Self = StObject.set(x, "rebootAfterUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootAfterUseUndefined: Self = StObject.set(x, "rebootAfterUse", js.undefined)
  }
}
