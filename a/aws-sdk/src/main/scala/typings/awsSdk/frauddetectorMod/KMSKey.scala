package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMSKey extends StObject {
  
  /**
    * The encryption key ARN.
    */
  var kmsEncryptionKeyArn: js.UndefOr[KmsEncryptionKeyArn] = js.undefined
}
object KMSKey {
  
  @scala.inline
  def apply(): KMSKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMSKey]
  }
  
  @scala.inline
  implicit class KMSKeyMutableBuilder[Self <: KMSKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsEncryptionKeyArn(value: KmsEncryptionKeyArn): Self = StObject.set(x, "kmsEncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsEncryptionKeyArnUndefined: Self = StObject.set(x, "kmsEncryptionKeyArn", js.undefined)
  }
}
