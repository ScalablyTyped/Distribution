package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBootstrapActionsOutput extends js.Object {
  
  /**
    * The bootstrap actions associated with the cluster.
    */
  var BootstrapActions: js.UndefOr[CommandList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}
object ListBootstrapActionsOutput {
  
  @scala.inline
  def apply(): ListBootstrapActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBootstrapActionsOutput]
  }
  
  @scala.inline
  implicit class ListBootstrapActionsOutputOps[Self <: ListBootstrapActionsOutput] (val x: Self) extends AnyVal {
    
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
    def setBootstrapActionsVarargs(value: Command*): Self = this.set("BootstrapActions", js.Array(value :_*))
    
    @scala.inline
    def setBootstrapActions(value: CommandList): Self = this.set("BootstrapActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapActions: Self = this.set("BootstrapActions", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
