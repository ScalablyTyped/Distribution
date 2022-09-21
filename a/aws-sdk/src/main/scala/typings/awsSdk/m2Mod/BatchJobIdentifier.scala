package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchJobIdentifier extends StObject {
  
  /**
    * Specifies a file associated with a specific batch job.
    */
  var fileBatchJobIdentifier: js.UndefOr[FileBatchJobIdentifier] = js.undefined
  
  /**
    * A batch job identifier in which the batch job to run is identified by the script name.
    */
  var scriptBatchJobIdentifier: js.UndefOr[ScriptBatchJobIdentifier] = js.undefined
}
object BatchJobIdentifier {
  
  inline def apply(): BatchJobIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchJobIdentifier]
  }
  
  extension [Self <: BatchJobIdentifier](x: Self) {
    
    inline def setFileBatchJobIdentifier(value: FileBatchJobIdentifier): Self = StObject.set(x, "fileBatchJobIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFileBatchJobIdentifierUndefined: Self = StObject.set(x, "fileBatchJobIdentifier", js.undefined)
    
    inline def setScriptBatchJobIdentifier(value: ScriptBatchJobIdentifier): Self = StObject.set(x, "scriptBatchJobIdentifier", value.asInstanceOf[js.Any])
    
    inline def setScriptBatchJobIdentifierUndefined: Self = StObject.set(x, "scriptBatchJobIdentifier", js.undefined)
  }
}
