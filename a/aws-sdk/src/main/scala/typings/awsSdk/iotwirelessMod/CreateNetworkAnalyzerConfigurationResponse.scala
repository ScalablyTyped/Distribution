package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkAnalyzerConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[NetworkAnalyzerConfigurationArn] = js.undefined
  
  var Name: js.UndefOr[NetworkAnalyzerConfigurationName] = js.undefined
}
object CreateNetworkAnalyzerConfigurationResponse {
  
  inline def apply(): CreateNetworkAnalyzerConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkAnalyzerConfigurationResponse]
  }
  
  extension [Self <: CreateNetworkAnalyzerConfigurationResponse](x: Self) {
    
    inline def setArn(value: NetworkAnalyzerConfigurationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
