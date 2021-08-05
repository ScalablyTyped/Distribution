package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProgressUpdateStreamRequest extends StObject {
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.undefined
  
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: ProgressUpdateStream
}
object CreateProgressUpdateStreamRequest {
  
  inline def apply(ProgressUpdateStreamName: ProgressUpdateStream): CreateProgressUpdateStreamRequest = {
    val __obj = js.Dynamic.literal(ProgressUpdateStreamName = ProgressUpdateStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgressUpdateStreamRequest]
  }
  
  extension [Self <: CreateProgressUpdateStreamRequest](x: Self) {
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setProgressUpdateStreamName(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStreamName", value.asInstanceOf[js.Any])
  }
}
