package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RiskExceptionConfigurationType extends js.Object {
  
  /**
    * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a compact representation of an IP address and its associated routing prefix.
    */
  var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.native
  
  /**
    * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
    */
  var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.native
}
object RiskExceptionConfigurationType {
  
  @scala.inline
  def apply(): RiskExceptionConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskExceptionConfigurationType]
  }
  
  @scala.inline
  implicit class RiskExceptionConfigurationTypeOps[Self <: RiskExceptionConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setBlockedIPRangeListVarargs(value: StringType*): Self = this.set("BlockedIPRangeList", js.Array(value :_*))
    
    @scala.inline
    def setBlockedIPRangeList(value: BlockedIPRangeListType): Self = this.set("BlockedIPRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedIPRangeList: Self = this.set("BlockedIPRangeList", js.undefined)
    
    @scala.inline
    def setSkippedIPRangeListVarargs(value: StringType*): Self = this.set("SkippedIPRangeList", js.Array(value :_*))
    
    @scala.inline
    def setSkippedIPRangeList(value: SkippedIPRangeListType): Self = this.set("SkippedIPRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedIPRangeList: Self = this.set("SkippedIPRangeList", js.undefined)
  }
}
