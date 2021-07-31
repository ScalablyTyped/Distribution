package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskExceptionConfigurationType extends StObject {
  
  /**
    * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a compact representation of an IP address and its associated routing prefix.
    */
  var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined
  
  /**
    * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
    */
  var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined
}
object RiskExceptionConfigurationType {
  
  @scala.inline
  def apply(): RiskExceptionConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskExceptionConfigurationType]
  }
  
  @scala.inline
  implicit class RiskExceptionConfigurationTypeMutableBuilder[Self <: RiskExceptionConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedIPRangeList(value: BlockedIPRangeListType): Self = StObject.set(x, "BlockedIPRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedIPRangeListUndefined: Self = StObject.set(x, "BlockedIPRangeList", js.undefined)
    
    @scala.inline
    def setBlockedIPRangeListVarargs(value: StringType*): Self = StObject.set(x, "BlockedIPRangeList", js.Array(value :_*))
    
    @scala.inline
    def setSkippedIPRangeList(value: SkippedIPRangeListType): Self = StObject.set(x, "SkippedIPRangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedIPRangeListUndefined: Self = StObject.set(x, "SkippedIPRangeList", js.undefined)
    
    @scala.inline
    def setSkippedIPRangeListVarargs(value: StringType*): Self = StObject.set(x, "SkippedIPRangeList", js.Array(value :_*))
  }
}
