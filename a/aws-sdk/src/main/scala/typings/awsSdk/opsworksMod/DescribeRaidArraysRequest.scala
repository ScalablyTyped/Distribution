package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRaidArraysRequest extends StObject {
  
  /**
    * The instance ID. If you use this parameter, DescribeRaidArrays returns descriptions of the RAID arrays associated with the specified instance. 
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of RAID array IDs. If you use this parameter, DescribeRaidArrays returns descriptions of the specified arrays. Otherwise, it returns a description of every array.
    */
  var RaidArrayIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeRaidArraysRequest {
  
  @scala.inline
  def apply(): DescribeRaidArraysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysRequest]
  }
  
  @scala.inline
  implicit class DescribeRaidArraysRequestMutableBuilder[Self <: DescribeRaidArraysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setRaidArrayIds(value: Strings): Self = StObject.set(x, "RaidArrayIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidArrayIdsUndefined: Self = StObject.set(x, "RaidArrayIds", js.undefined)
    
    @scala.inline
    def setRaidArrayIdsVarargs(value: String*): Self = StObject.set(x, "RaidArrayIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
