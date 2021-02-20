package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteForecastRequest extends StObject {
  
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
  implicit class DeleteForecastRequestMutableBuilder[Self <: DeleteForecastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
  }
}
