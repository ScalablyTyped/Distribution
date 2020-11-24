package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateActionsMessage extends js.Object {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of update actions
    */
  var UpdateActions: js.UndefOr[UpdateActionList] = js.native
}
object UpdateActionsMessage {
  
  @scala.inline
  def apply(): UpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionsMessage]
  }
  
  @scala.inline
  implicit class UpdateActionsMessageOps[Self <: UpdateActionsMessage] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setUpdateActionsVarargs(value: UpdateAction*): Self = this.set("UpdateActions", js.Array(value :_*))
    
    @scala.inline
    def setUpdateActions(value: UpdateActionList): Self = this.set("UpdateActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateActions: Self = this.set("UpdateActions", js.undefined)
  }
}
