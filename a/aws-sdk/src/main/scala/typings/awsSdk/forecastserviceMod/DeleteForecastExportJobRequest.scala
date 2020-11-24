package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteForecastExportJobRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast export job to delete.
    */
  var ForecastExportJobArn: Arn = js.native
}
object DeleteForecastExportJobRequest {
  
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DeleteForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteForecastExportJobRequest]
  }
  
  @scala.inline
  implicit class DeleteForecastExportJobRequestOps[Self <: DeleteForecastExportJobRequest] (val x: Self) extends AnyVal {
    
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
    def setForecastExportJobArn(value: Arn): Self = this.set("ForecastExportJobArn", value.asInstanceOf[js.Any])
  }
}
