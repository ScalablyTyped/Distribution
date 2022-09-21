package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSuiteDefinitionRequest extends StObject {
  
  /**
    * Creates a Device Advisor test suite with suite definition configuration.
    */
  var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined
  
  /**
    * The tags to be attached to the suite definition.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSuiteDefinitionRequest {
  
  inline def apply(): CreateSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSuiteDefinitionRequest]
  }
  
  extension [Self <: CreateSuiteDefinitionRequest](x: Self) {
    
    inline def setSuiteDefinitionConfiguration(value: SuiteDefinitionConfiguration): Self = StObject.set(x, "suiteDefinitionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionConfigurationUndefined: Self = StObject.set(x, "suiteDefinitionConfiguration", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
