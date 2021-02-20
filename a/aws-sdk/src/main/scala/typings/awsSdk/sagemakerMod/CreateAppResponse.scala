package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the app.
    */
  var AppArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppArn] = js.native
}
object CreateAppResponse {
  
  @scala.inline
  def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  @scala.inline
  implicit class CreateAppResponseMutableBuilder[Self <: CreateAppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppArn(value: AppArn): Self = StObject.set(x, "AppArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArnUndefined: Self = StObject.set(x, "AppArn", js.undefined)
  }
}
