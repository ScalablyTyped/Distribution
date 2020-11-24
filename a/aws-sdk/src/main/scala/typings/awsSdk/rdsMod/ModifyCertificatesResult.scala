package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCertificatesResult extends js.Object {
  
  var Certificate: js.UndefOr[typings.awsSdk.rdsMod.Certificate] = js.native
}
object ModifyCertificatesResult {
  
  @scala.inline
  def apply(): ModifyCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesResult]
  }
  
  @scala.inline
  implicit class ModifyCertificatesResultOps[Self <: ModifyCertificatesResult] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
  }
}
