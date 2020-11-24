package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends js.Object {
  
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[Date] = js.native
  
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[Date] = js.native
  
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("Fingerprint", js.undefined)
    
    @scala.inline
    def setValidityEndTime(value: Date): Self = this.set("ValidityEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidityEndTime: Self = this.set("ValidityEndTime", js.undefined)
    
    @scala.inline
    def setValidityStartTime(value: Date): Self = this.set("ValidityStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidityStartTime: Self = this.set("ValidityStartTime", js.undefined)
    
    @scala.inline
    def setValue(value: ByteBuffer): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
