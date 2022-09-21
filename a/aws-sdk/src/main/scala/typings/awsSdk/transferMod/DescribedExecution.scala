package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedExecution extends StObject {
  
  /**
    * A unique identifier for the execution of a workflow.
    */
  var ExecutionId: js.UndefOr[typings.awsSdk.transferMod.ExecutionId] = js.undefined
  
  /**
    * The IAM role associated with the execution.
    */
  var ExecutionRole: js.UndefOr[Role] = js.undefined
  
  /**
    * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution begins: if the file is being copied, this is the initial (as opposed to destination) file location.
    */
  var InitialFileLocation: js.UndefOr[FileLocation] = js.undefined
  
  /**
    * The IAM logging role associated with the execution.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.transferMod.LoggingConfiguration] = js.undefined
  
  var PosixProfile: js.UndefOr[typings.awsSdk.transferMod.PosixProfile] = js.undefined
  
  /**
    * A structure that describes the execution results. This includes a list of the steps along with the details of each step, error type and message (if any), and the OnExceptionSteps structure.
    */
  var Results: js.UndefOr[ExecutionResults] = js.undefined
  
  /**
    * A container object for the session details that are associated with a workflow.
    */
  var ServiceMetadata: js.UndefOr[typings.awsSdk.transferMod.ServiceMetadata] = js.undefined
  
  /**
    * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the exception. 
    */
  var Status: js.UndefOr[ExecutionStatus] = js.undefined
}
object DescribedExecution {
  
  inline def apply(): DescribedExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribedExecution]
  }
  
  extension [Self <: DescribedExecution](x: Self) {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setExecutionRole(value: Role): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    inline def setInitialFileLocation(value: FileLocation): Self = StObject.set(x, "InitialFileLocation", value.asInstanceOf[js.Any])
    
    inline def setInitialFileLocationUndefined: Self = StObject.set(x, "InitialFileLocation", js.undefined)
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
    
    inline def setPosixProfile(value: PosixProfile): Self = StObject.set(x, "PosixProfile", value.asInstanceOf[js.Any])
    
    inline def setPosixProfileUndefined: Self = StObject.set(x, "PosixProfile", js.undefined)
    
    inline def setResults(value: ExecutionResults): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setServiceMetadata(value: ServiceMetadata): Self = StObject.set(x, "ServiceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "ServiceMetadata", js.undefined)
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
