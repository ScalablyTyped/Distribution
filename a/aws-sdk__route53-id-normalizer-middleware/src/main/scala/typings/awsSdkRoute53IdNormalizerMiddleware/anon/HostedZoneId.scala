package typings.awsSdkRoute53IdNormalizerMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedZoneId extends js.Object {
  
  var HostedZoneId: String = js.native
}
object HostedZoneId {
  
  @scala.inline
  def apply(HostedZoneId: String): HostedZoneId = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZoneId]
  }
  
  @scala.inline
  implicit class HostedZoneIdOps[Self <: HostedZoneId] (val x: Self) extends AnyVal {
    
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
    def setHostedZoneId(value: String): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
  }
}
