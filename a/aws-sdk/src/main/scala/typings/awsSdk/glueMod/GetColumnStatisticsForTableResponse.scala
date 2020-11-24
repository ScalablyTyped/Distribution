package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetColumnStatisticsForTableResponse extends js.Object {
  
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var ColumnStatisticsList: js.UndefOr[typings.awsSdk.glueMod.ColumnStatisticsList] = js.native
  
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.native
}
object GetColumnStatisticsForTableResponse {
  
  @scala.inline
  def apply(): GetColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetColumnStatisticsForTableResponse]
  }
  
  @scala.inline
  implicit class GetColumnStatisticsForTableResponseOps[Self <: GetColumnStatisticsForTableResponse] (val x: Self) extends AnyVal {
    
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
    def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = this.set("ColumnStatisticsList", js.Array(value :_*))
    
    @scala.inline
    def setColumnStatisticsList(value: ColumnStatisticsList): Self = this.set("ColumnStatisticsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnStatisticsList: Self = this.set("ColumnStatisticsList", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ColumnError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: ColumnErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
