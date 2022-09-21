package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteRunInformation extends StObject {
  
  /**
    * Date (in Unix epoch time) when the suite run was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Date (in Unix epoch time) when the suite run ended.
    */
  var endAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Number of test cases that failed in the suite run.
    */
  var failed: js.UndefOr[SuiteRunResultCount] = js.undefined
  
  /**
    * Number of test cases that passed in the suite run.
    */
  var passed: js.UndefOr[SuiteRunResultCount] = js.undefined
  
  /**
    * Date (in Unix epoch time) when the suite run was started.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the suite run.
    */
  var status: js.UndefOr[SuiteRunStatus] = js.undefined
  
  /**
    * Suite definition ID of the suite run.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Suite definition name of the suite run.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
  
  /**
    * Suite definition version of the suite run.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
  
  /**
    * Suite run ID of the suite run.
    */
  var suiteRunId: js.UndefOr[UUID] = js.undefined
}
object SuiteRunInformation {
  
  inline def apply(): SuiteRunInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuiteRunInformation]
  }
  
  extension [Self <: SuiteRunInformation](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEndAt(value: js.Date): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setFailed(value: SuiteRunResultCount): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPassed(value: SuiteRunResultCount): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: SuiteRunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
    
    inline def setSuiteRunId(value: UUID): Self = StObject.set(x, "suiteRunId", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunIdUndefined: Self = StObject.set(x, "suiteRunId", js.undefined)
  }
}
