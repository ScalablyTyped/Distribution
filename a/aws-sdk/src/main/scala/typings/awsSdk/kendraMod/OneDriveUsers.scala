package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneDriveUsers extends StObject {
  
  /**
    * A list of users whose documents should be indexed. Specify the user names in email format, for example, username@tenantdomain. If you need to index the documents of more than 100 users, use the OneDriveUserS3Path field to specify the location of a file containing a list of users.
    */
  var OneDriveUserList: js.UndefOr[typings.awsSdk.kendraMod.OneDriveUserList] = js.undefined
  
  /**
    * The S3 bucket location of a file containing a list of users whose documents should be indexed.
    */
  var OneDriveUserS3Path: js.UndefOr[S3Path] = js.undefined
}
object OneDriveUsers {
  
  inline def apply(): OneDriveUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneDriveUsers]
  }
  
  extension [Self <: OneDriveUsers](x: Self) {
    
    inline def setOneDriveUserList(value: OneDriveUserList): Self = StObject.set(x, "OneDriveUserList", value.asInstanceOf[js.Any])
    
    inline def setOneDriveUserListUndefined: Self = StObject.set(x, "OneDriveUserList", js.undefined)
    
    inline def setOneDriveUserListVarargs(value: OneDriveUser*): Self = StObject.set(x, "OneDriveUserList", js.Array(value :_*))
    
    inline def setOneDriveUserS3Path(value: S3Path): Self = StObject.set(x, "OneDriveUserS3Path", value.asInstanceOf[js.Any])
    
    inline def setOneDriveUserS3PathUndefined: Self = StObject.set(x, "OneDriveUserS3Path", js.undefined)
  }
}
