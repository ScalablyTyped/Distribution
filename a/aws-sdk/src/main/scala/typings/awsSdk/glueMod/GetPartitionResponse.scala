package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartitionResponse extends js.Object {
  
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typings.awsSdk.glueMod.Partition] = js.native
}
object GetPartitionResponse {
  
  @scala.inline
  def apply(): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionResponse]
  }
  
  @scala.inline
  implicit class GetPartitionResponseOps[Self <: GetPartitionResponse] (val x: Self) extends AnyVal {
    
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
    def setPartition(value: Partition): Self = this.set("Partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("Partition", js.undefined)
  }
}
