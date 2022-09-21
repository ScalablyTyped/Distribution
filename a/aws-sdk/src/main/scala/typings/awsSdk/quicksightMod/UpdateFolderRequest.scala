package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFolderRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the folder to update.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the folder.
    */
  var FolderId: RestrictiveResourceId
  
  /**
    * The name of the folder.
    */
  var Name: FolderName
}
object UpdateFolderRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, FolderId: RestrictiveResourceId, Name: FolderName): UpdateFolderRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], FolderId = FolderId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFolderRequest]
  }
  
  extension [Self <: UpdateFolderRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
