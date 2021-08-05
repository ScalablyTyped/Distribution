package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the app.
    */
  var AppArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppArn] = js.undefined
}
object CreateAppResponse {
  
  inline def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  extension [Self <: CreateAppResponse](x: Self) {
    
    inline def setAppArn(value: AppArn): Self = StObject.set(x, "AppArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "AppArn", js.undefined)
  }
}
