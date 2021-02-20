package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalLimit extends StObject {
  
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
  implicit class AdditionalLimitMutableBuilder[Self <: AdditionalLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitName(value: LimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    @scala.inline
    def setLimitValues(value: LimitValueList): Self = StObject.set(x, "LimitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitValuesUndefined: Self = StObject.set(x, "LimitValues", js.undefined)
    
    @scala.inline
    def setLimitValuesVarargs(value: LimitValue*): Self = StObject.set(x, "LimitValues", js.Array(value :_*))
  }
}
