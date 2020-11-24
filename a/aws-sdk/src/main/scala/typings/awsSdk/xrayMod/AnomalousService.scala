package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalousService extends js.Object {
  
  var ServiceId: js.UndefOr[typings.awsSdk.xrayMod.ServiceId] = js.native
}
object AnomalousService {
  
  @scala.inline
  def apply(): AnomalousService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalousService]
  }
  
  @scala.inline
  implicit class AnomalousServiceOps[Self <: AnomalousService] (val x: Self) extends AnyVal {
    
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
    def setServiceId(value: ServiceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("ServiceId", js.undefined)
  }
}
