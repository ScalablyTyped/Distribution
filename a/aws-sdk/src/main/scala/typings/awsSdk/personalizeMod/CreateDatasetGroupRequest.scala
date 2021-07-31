package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The name for the new dataset group.
    */
  var name: Name
  
  /**
    * The ARN of the IAM role that has permissions to access the KMS key. Supplying an IAM role is only valid when also specifying a KMS key.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object CreateDatasetGroupRequest {
  
  @scala.inline
  def apply(name: Name): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
  
  @scala.inline
  implicit class CreateDatasetGroupRequestMutableBuilder[Self <: CreateDatasetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
