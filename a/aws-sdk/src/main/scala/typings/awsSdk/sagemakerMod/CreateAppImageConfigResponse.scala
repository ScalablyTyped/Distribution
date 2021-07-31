package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigArn] = js.undefined
}
object CreateAppImageConfigResponse {
  
  @scala.inline
  def apply(): CreateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppImageConfigResponse]
  }
  
  @scala.inline
  implicit class CreateAppImageConfigResponseMutableBuilder[Self <: CreateAppImageConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
  }
}
