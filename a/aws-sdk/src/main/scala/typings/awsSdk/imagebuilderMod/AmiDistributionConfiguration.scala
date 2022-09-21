package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmiDistributionConfiguration extends StObject {
  
  /**
    * The tags to apply to AMIs distributed to this Region.
    */
  var amiTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The description of the AMI distribution configuration. Minimum and maximum length are in characters.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The KMS key identifier used to encrypt the distributed image.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Launch permissions can be used to configure which Amazon Web Services accounts can use the AMI to launch instances.
    */
  var launchPermission: js.UndefOr[LaunchPermissionConfiguration] = js.undefined
  
  /**
    * The name of the output AMI.
    */
  var name: js.UndefOr[AmiNameString] = js.undefined
  
  /**
    * The ID of an account to which you want to distribute an image.
    */
  var targetAccountIds: js.UndefOr[AccountList] = js.undefined
}
object AmiDistributionConfiguration {
  
  inline def apply(): AmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiDistributionConfiguration]
  }
  
  extension [Self <: AmiDistributionConfiguration](x: Self) {
    
    inline def setAmiTags(value: TagMap): Self = StObject.set(x, "amiTags", value.asInstanceOf[js.Any])
    
    inline def setAmiTagsUndefined: Self = StObject.set(x, "amiTags", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLaunchPermission(value: LaunchPermissionConfiguration): Self = StObject.set(x, "launchPermission", value.asInstanceOf[js.Any])
    
    inline def setLaunchPermissionUndefined: Self = StObject.set(x, "launchPermission", js.undefined)
    
    inline def setName(value: AmiNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetAccountIds(value: AccountList): Self = StObject.set(x, "targetAccountIds", value.asInstanceOf[js.Any])
    
    inline def setTargetAccountIdsUndefined: Self = StObject.set(x, "targetAccountIds", js.undefined)
    
    inline def setTargetAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "targetAccountIds", js.Array(value*))
  }
}
