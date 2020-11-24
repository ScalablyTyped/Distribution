package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteForecastRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast to delete.
    */
  var ForecastArn: Arn = js.native
}
object DeleteForecastRequest {
  
  @scala.inline
  def apply(ForecastArn: Arn): DeleteForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteForecastRequest]
  }
  
  @scala.inline
  implicit class DeleteForecastRequestOps[Self <: DeleteForecastRequest] (val x: Self) extends AnyVal {
    
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
    def setForecastArn(value: Arn): Self = this.set("ForecastArn", value.asInstanceOf[js.Any])
  }
}
