package typings.dashjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in std.MediaKeyMessageType ]: string} */
@js.native
trait PinMediaKeyMessageTypestr extends js.Object {
  
  var `individualization-request`: String = js.native
  
  var `license-release`: String = js.native
  
  var `license-renewal`: String = js.native
  
  var `license-request`: String = js.native
}
object PinMediaKeyMessageTypestr {
  
  @scala.inline
  def apply(
    `individualization-request`: String,
    `license-release`: String,
    `license-renewal`: String,
    `license-request`: String
  ): PinMediaKeyMessageTypestr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("individualization-request")(`individualization-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-release")(`license-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-renewal")(`license-renewal`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-request")(`license-request`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinMediaKeyMessageTypestr]
  }
  
  @scala.inline
  implicit class PinMediaKeyMessageTypestrOps[Self <: PinMediaKeyMessageTypestr] (val x: Self) extends AnyVal {
    
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
    def `setIndividualization-request`(value: String): Self = this.set("individualization-request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLicense-release`(value: String): Self = this.set("license-release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLicense-renewal`(value: String): Self = this.set("license-renewal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLicense-request`(value: String): Self = this.set("license-request", value.asInstanceOf[js.Any])
  }
}
