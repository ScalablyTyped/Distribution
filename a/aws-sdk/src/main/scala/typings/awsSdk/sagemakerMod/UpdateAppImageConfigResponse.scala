package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppImageConfigArn] = js.undefined
}
object UpdateAppImageConfigResponse {
  
  @scala.inline
  def apply(): UpdateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppImageConfigResponse]
  }
  
  @scala.inline
  implicit class UpdateAppImageConfigResponseMutableBuilder[Self <: UpdateAppImageConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
  }
}
