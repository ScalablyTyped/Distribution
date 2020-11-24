package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseKpiResult extends js.Object {
  
  /**
    * An array of objects that provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  var Rows: ListOfResultRow = js.native
}
object BaseKpiResult {
  
  @scala.inline
  def apply(Rows: ListOfResultRow): BaseKpiResult = {
    val __obj = js.Dynamic.literal(Rows = Rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseKpiResult]
  }
  
  @scala.inline
  implicit class BaseKpiResultOps[Self <: BaseKpiResult] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: ResultRow*): Self = this.set("Rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: ListOfResultRow): Self = this.set("Rows", value.asInstanceOf[js.Any])
  }
}
