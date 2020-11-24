package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateValidity extends js.Object {
  
  /**
    * The certificate is not valid after this date.
    */
  var notAfter: js.UndefOr[DateType] = js.native
  
  /**
    * The certificate is not valid before this date.
    */
  var notBefore: js.UndefOr[DateType] = js.native
}
object CertificateValidity {
  
  @scala.inline
  def apply(): CertificateValidity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidity]
  }
  
  @scala.inline
  implicit class CertificateValidityOps[Self <: CertificateValidity] (val x: Self) extends AnyVal {
    
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
    def setNotAfter(value: DateType): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: DateType): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
}
