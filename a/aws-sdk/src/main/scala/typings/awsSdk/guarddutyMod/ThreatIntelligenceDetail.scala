package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatIntelligenceDetail extends js.Object {
  
  /**
    * The name of the threat intelligence list that triggered the finding.
    */
  var ThreatListName: js.UndefOr[String] = js.native
  
  /**
    * A list of names of the threats in the threat intelligence list that triggered the finding.
    */
  var ThreatNames: js.UndefOr[typings.awsSdk.guarddutyMod.ThreatNames] = js.native
}
object ThreatIntelligenceDetail {
  
  @scala.inline
  def apply(): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
  
  @scala.inline
  implicit class ThreatIntelligenceDetailOps[Self <: ThreatIntelligenceDetail] (val x: Self) extends AnyVal {
    
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
    def setThreatListName(value: String): Self = this.set("ThreatListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatListName: Self = this.set("ThreatListName", js.undefined)
    
    @scala.inline
    def setThreatNamesVarargs(value: String*): Self = this.set("ThreatNames", js.Array(value :_*))
    
    @scala.inline
    def setThreatNames(value: ThreatNames): Self = this.set("ThreatNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatNames: Self = this.set("ThreatNames", js.undefined)
  }
}
