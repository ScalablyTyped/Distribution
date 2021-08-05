package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationOutput extends StObject {
  
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.undefined
}
object CreateApplicationOutput {
  
  inline def apply(): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationOutput]
  }
  
  extension [Self <: CreateApplicationOutput](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
  }
}
