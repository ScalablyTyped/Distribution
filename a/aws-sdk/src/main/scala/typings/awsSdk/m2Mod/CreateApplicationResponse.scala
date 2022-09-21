package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var applicationArn: Arn
  
  /**
    * The unique application identifier.
    */
  var applicationId: Identifier
  
  /**
    * The version number of the application.
    */
  var applicationVersion: Version
}
object CreateApplicationResponse {
  
  inline def apply(applicationArn: Arn, applicationId: Identifier, applicationVersion: Version): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationArn = applicationArn.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  extension [Self <: CreateApplicationResponse](x: Self) {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
  }
}
