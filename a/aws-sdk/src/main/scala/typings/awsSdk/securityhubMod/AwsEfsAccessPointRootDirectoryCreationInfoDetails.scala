package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEfsAccessPointRootDirectoryCreationInfoDetails extends StObject {
  
  /**
    * Specifies the POSIX group ID to apply to the root directory. 
    */
  var OwnerGid: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the POSIX user ID to apply to the root directory. 
    */
  var OwnerUid: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the POSIX permissions to apply to the root directory, in the format of an octal number representing the file's mode bits. 
    */
  var Permissions: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEfsAccessPointRootDirectoryCreationInfoDetails {
  
  inline def apply(): AwsEfsAccessPointRootDirectoryCreationInfoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEfsAccessPointRootDirectoryCreationInfoDetails]
  }
  
  extension [Self <: AwsEfsAccessPointRootDirectoryCreationInfoDetails](x: Self) {
    
    inline def setOwnerGid(value: NonEmptyString): Self = StObject.set(x, "OwnerGid", value.asInstanceOf[js.Any])
    
    inline def setOwnerGidUndefined: Self = StObject.set(x, "OwnerGid", js.undefined)
    
    inline def setOwnerUid(value: NonEmptyString): Self = StObject.set(x, "OwnerUid", value.asInstanceOf[js.Any])
    
    inline def setOwnerUidUndefined: Self = StObject.set(x, "OwnerUid", js.undefined)
    
    inline def setPermissions(value: NonEmptyString): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
  }
}
