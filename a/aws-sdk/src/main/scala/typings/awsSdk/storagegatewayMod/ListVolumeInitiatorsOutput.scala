package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumeInitiatorsOutput extends js.Object {
  
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typings.awsSdk.storagegatewayMod.Initiators] = js.native
}
object ListVolumeInitiatorsOutput {
  
  @scala.inline
  def apply(): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
  
  @scala.inline
  implicit class ListVolumeInitiatorsOutputOps[Self <: ListVolumeInitiatorsOutput] (val x: Self) extends AnyVal {
    
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
    def setInitiatorsVarargs(value: Initiator*): Self = this.set("Initiators", js.Array(value :_*))
    
    @scala.inline
    def setInitiators(value: Initiators): Self = this.set("Initiators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiators: Self = this.set("Initiators", js.undefined)
  }
}
