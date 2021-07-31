package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEKMS extends StObject {
  
  /**
    * Specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) to use for encrypting inventory reports.
    */
  var KeyId: SSEKMSKeyId
}
object SSEKMS {
  
  @scala.inline
  def apply(KeyId: SSEKMSKeyId): SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEKMS]
  }
  
  @scala.inline
  implicit class SSEKMSMutableBuilder[Self <: SSEKMS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
