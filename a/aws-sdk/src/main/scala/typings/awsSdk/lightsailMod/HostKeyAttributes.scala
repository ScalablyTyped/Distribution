package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostKeyAttributes extends js.Object {
  
  /**
    * The SSH host key algorithm or the RDP certificate format. For SSH host keys, the algorithm may be ssh-rsa, ecdsa-sha2-nistp256, ssh-ed25519, etc. For RDP certificates, the algorithm is always x509-cert.
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-1 SSH fingerprint:  SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0    Example of an SHA-1 RDP fingerprint:  af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45   
    */
  var fingerprintSHA1: js.UndefOr[String] = js.native
  
  /**
    * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-256 SSH fingerprint:  SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o    Example of an SHA-256 RDP fingerprint:  03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68   
    */
  var fingerprintSHA256: js.UndefOr[String] = js.native
  
  /**
    * The returned RDP certificate is not valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidAfter: js.UndefOr[IsoDate] = js.native
  
  /**
    * The returned RDP certificate is valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidBefore: js.UndefOr[IsoDate] = js.native
  
  /**
    * The public SSH host key or the RDP certificate.
    */
  var publicKey: js.UndefOr[String] = js.native
  
  /**
    * The time that the SSH host key or RDP certificate was recorded by Lightsail.
    */
  var witnessedAt: js.UndefOr[IsoDate] = js.native
}
object HostKeyAttributes {
  
  @scala.inline
  def apply(): HostKeyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostKeyAttributes]
  }
  
  @scala.inline
  implicit class HostKeyAttributesOps[Self <: HostKeyAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setFingerprintSHA1(value: String): Self = this.set("fingerprintSHA1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprintSHA1: Self = this.set("fingerprintSHA1", js.undefined)
    
    @scala.inline
    def setFingerprintSHA256(value: String): Self = this.set("fingerprintSHA256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprintSHA256: Self = this.set("fingerprintSHA256", js.undefined)
    
    @scala.inline
    def setNotValidAfter(value: IsoDate): Self = this.set("notValidAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotValidAfter: Self = this.set("notValidAfter", js.undefined)
    
    @scala.inline
    def setNotValidBefore(value: IsoDate): Self = this.set("notValidBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotValidBefore: Self = this.set("notValidBefore", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setWitnessedAt(value: IsoDate): Self = this.set("witnessedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWitnessedAt: Self = this.set("witnessedAt", js.undefined)
  }
}
