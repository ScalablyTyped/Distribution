package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyHapgRequest extends StObject {
  
  /**
    * The ARN of the high-availability partition group to modify.
    */
  var HapgArn: typings.awsSdk.cloudhsmMod.HapgArn = js.native
  
  /**
    * The new label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsSdk.cloudhsmMod.Label] = js.native
  
  /**
    * The list of partition serial numbers to make members of the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsSdk.cloudhsmMod.PartitionSerialList] = js.native
}
object ModifyHapgRequest {
  
  @scala.inline
  def apply(HapgArn: HapgArn): ModifyHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHapgRequest]
  }
  
  @scala.inline
  implicit class ModifyHapgRequestMutableBuilder[Self <: ModifyHapgRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setPartitionSerialList(value: PartitionSerialList): Self = StObject.set(x, "PartitionSerialList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionSerialListUndefined: Self = StObject.set(x, "PartitionSerialList", js.undefined)
    
    @scala.inline
    def setPartitionSerialListVarargs(value: PartitionSerial*): Self = StObject.set(x, "PartitionSerialList", js.Array(value :_*))
  }
}
