package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSuiteDefinitionResponse extends StObject {
  
  /**
    * Creates a Device Advisor test suite with TimeStamp of when it was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Creates a Device Advisor test suite with Amazon Resource Name (ARN).
    */
  var suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Creates a Device Advisor test suite with suite UUID.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Creates a Device Advisor test suite with suite definition name.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
}
object CreateSuiteDefinitionResponse {
  
  inline def apply(): CreateSuiteDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSuiteDefinitionResponse]
  }
  
  extension [Self <: CreateSuiteDefinitionResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setSuiteDefinitionArn(value: AmazonResourceName): Self = StObject.set(x, "suiteDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionArnUndefined: Self = StObject.set(x, "suiteDefinitionArn", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
  }
}
