package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFolderRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the folder.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the folder.
    */
  var FolderId: RestrictiveResourceId
}
object DescribeFolderRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, FolderId: RestrictiveResourceId): DescribeFolderRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFolderRequest]
  }
  
  extension [Self <: DescribeFolderRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
  }
}
