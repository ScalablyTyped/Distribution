package typings.clientSessions.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeHmacOptions extends js.Object {
  
  var signatureAlgorithm: String = js.native
  
  var signatureKey: Buffer = js.native
}
object ComputeHmacOptions {
  
  @scala.inline
  def apply(signatureAlgorithm: String, signatureKey: Buffer): ComputeHmacOptions = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureKey = signatureKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeHmacOptions]
  }
  
  @scala.inline
  implicit class ComputeHmacOptionsOps[Self <: ComputeHmacOptions] (val x: Self) extends AnyVal {
    
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
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureKey(value: Buffer): Self = this.set("signatureKey", value.asInstanceOf[js.Any])
  }
}
