package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatabaseRequest extends StObject {
  
  /**
    *  The name of the database. 
    */
  var DatabaseName: ResourceName
  
  /**
    *  The identifier of the new KMS key (KmsKeyId) to be used to encrypt the data stored in the database. If the KmsKeyId currently registered with the database is the same as the KmsKeyId in the request, there will not be any update.  You can specify the KmsKeyId using any of the following:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias   
    */
  var KmsKeyId: StringValue2048
}
object UpdateDatabaseRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, KmsKeyId: StringValue2048): UpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatabaseRequest]
  }
  
  @scala.inline
  implicit class UpdateDatabaseRequestMutableBuilder[Self <: UpdateDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
  }
}
