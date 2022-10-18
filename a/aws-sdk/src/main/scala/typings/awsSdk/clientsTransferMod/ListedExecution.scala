package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedExecution extends StObject {
  
  /**
    * A unique identifier for the execution of a workflow.
    */
  var ExecutionId: js.UndefOr[typings.awsSdk.clientsTransferMod.ExecutionId] = js.undefined
  
  /**
    * A structure that describes the Amazon S3 or EFS file location. This is the file location when the execution begins: if the file is being copied, this is the initial (as opposed to destination) file location.
    */
  var InitialFileLocation: js.UndefOr[FileLocation] = js.undefined
  
  /**
    * A container object for the session details that are associated with a workflow.
    */
  var ServiceMetadata: js.UndefOr[typings.awsSdk.clientsTransferMod.ServiceMetadata] = js.undefined
  
  /**
    * The status is one of the execution. Can be in progress, completed, exception encountered, or handling the exception.
    */
  var Status: js.UndefOr[ExecutionStatus] = js.undefined
}
object ListedExecution {
  
  inline def apply(): ListedExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedExecution]
  }
  
  extension [Self <: ListedExecution](x: Self) {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setInitialFileLocation(value: FileLocation): Self = StObject.set(x, "InitialFileLocation", value.asInstanceOf[js.Any])
    
    inline def setInitialFileLocationUndefined: Self = StObject.set(x, "InitialFileLocation", js.undefined)
    
    inline def setServiceMetadata(value: ServiceMetadata): Self = StObject.set(x, "ServiceMetadata", value.asInstanceOf[js.Any])
    
    inline def setServiceMetadataUndefined: Self = StObject.set(x, "ServiceMetadata", js.undefined)
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
