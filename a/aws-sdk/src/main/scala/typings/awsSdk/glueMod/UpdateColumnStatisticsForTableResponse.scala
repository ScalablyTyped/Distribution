package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateColumnStatisticsForTableResponse extends js.Object {
  
  /**
    * List of ColumnStatisticsErrors.
    */
  var Errors: js.UndefOr[ColumnStatisticsErrors] = js.native
}
object UpdateColumnStatisticsForTableResponse {
  
  @scala.inline
  def apply(): UpdateColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateColumnStatisticsForTableResponse]
  }
  
  @scala.inline
  implicit class UpdateColumnStatisticsForTableResponseOps[Self <: UpdateColumnStatisticsForTableResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: ColumnStatisticsError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: ColumnStatisticsErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
