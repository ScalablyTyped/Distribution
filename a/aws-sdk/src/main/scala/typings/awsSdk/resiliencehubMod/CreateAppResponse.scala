package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResponse extends StObject {
  
  /**
    * The created application returned as an object with details including compliance status, creation time, description, resiliency score, and more.
    */
  var app: App
}
object CreateAppResponse {
  
  inline def apply(app: App): CreateAppResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  extension [Self <: CreateAppResponse](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
