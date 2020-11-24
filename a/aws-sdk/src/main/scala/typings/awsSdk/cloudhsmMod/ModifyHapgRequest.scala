package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyHapgRequest extends js.Object {
  
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
  implicit class ModifyHapgRequestOps[Self <: ModifyHapgRequest] (val x: Self) extends AnyVal {
    
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
    def setHapgArn(value: HapgArn): Self = this.set("HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setPartitionSerialListVarargs(value: PartitionSerial*): Self = this.set("PartitionSerialList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionSerialList(value: PartitionSerialList): Self = this.set("PartitionSerialList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionSerialList: Self = this.set("PartitionSerialList", js.undefined)
  }
}
