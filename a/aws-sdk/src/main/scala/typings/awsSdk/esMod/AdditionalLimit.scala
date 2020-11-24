package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalLimit extends js.Object {
  
  /**
    *  Name of Additional Limit is specific to a given InstanceType and for each of it's  InstanceRole  etc.  Attributes and their details:   MaximumNumberOfDataNodesSupported This attribute will be present in Master node only to specify how much data nodes upto which given  ESPartitionInstanceType  can support as master node. MaximumNumberOfDataNodesWithoutMasterNode This attribute will be present in Data node only to specify how much data nodes of given  ESPartitionInstanceType  upto which you don't need any master nodes to govern them.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.esMod.LimitName] = js.native
  
  /**
    *  Value for given  AdditionalLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.native
}
object AdditionalLimit {
  
  @scala.inline
  def apply(): AdditionalLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalLimit]
  }
  
  @scala.inline
  implicit class AdditionalLimitOps[Self <: AdditionalLimit] (val x: Self) extends AnyVal {
    
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
    def setLimitName(value: LimitName): Self = this.set("LimitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitName: Self = this.set("LimitName", js.undefined)
    
    @scala.inline
    def setLimitValuesVarargs(value: LimitValue*): Self = this.set("LimitValues", js.Array(value :_*))
    
    @scala.inline
    def setLimitValues(value: LimitValueList): Self = this.set("LimitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitValues: Self = this.set("LimitValues", js.undefined)
  }
}
