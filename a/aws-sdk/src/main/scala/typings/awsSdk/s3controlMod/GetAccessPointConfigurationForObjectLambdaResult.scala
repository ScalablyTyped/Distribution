package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointConfigurationForObjectLambdaResult extends StObject {
  
  /**
    * Object Lambda Access Point configuration document.
    */
  var Configuration: js.UndefOr[ObjectLambdaConfiguration] = js.undefined
}
object GetAccessPointConfigurationForObjectLambdaResult {
  
  inline def apply(): GetAccessPointConfigurationForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointConfigurationForObjectLambdaResult]
  }
  
  extension [Self <: GetAccessPointConfigurationForObjectLambdaResult](x: Self) {
    
    inline def setConfiguration(value: ObjectLambdaConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
  }
}
