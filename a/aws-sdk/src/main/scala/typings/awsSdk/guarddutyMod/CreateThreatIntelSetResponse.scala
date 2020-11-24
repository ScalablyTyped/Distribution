package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThreatIntelSetResponse extends js.Object {
  
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String = js.native
}
object CreateThreatIntelSetResponse {
  
  @scala.inline
  def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
  
  @scala.inline
  implicit class CreateThreatIntelSetResponseOps[Self <: CreateThreatIntelSetResponse] (val x: Self) extends AnyVal {
    
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
    def setThreatIntelSetId(value: String): Self = this.set("ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
