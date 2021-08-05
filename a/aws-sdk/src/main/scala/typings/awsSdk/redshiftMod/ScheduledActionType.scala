package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledActionType extends StObject {
  
  /**
    * An action that runs a PauseCluster API operation. 
    */
  var PauseCluster: js.UndefOr[PauseClusterMessage] = js.undefined
  
  /**
    * An action that runs a ResizeCluster API operation. 
    */
  var ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.undefined
  
  /**
    * An action that runs a ResumeCluster API operation. 
    */
  var ResumeCluster: js.UndefOr[ResumeClusterMessage] = js.undefined
}
object ScheduledActionType {
  
  inline def apply(): ScheduledActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionType]
  }
  
  extension [Self <: ScheduledActionType](x: Self) {
    
    inline def setPauseCluster(value: PauseClusterMessage): Self = StObject.set(x, "PauseCluster", value.asInstanceOf[js.Any])
    
    inline def setPauseClusterUndefined: Self = StObject.set(x, "PauseCluster", js.undefined)
    
    inline def setResizeCluster(value: ResizeClusterMessage): Self = StObject.set(x, "ResizeCluster", value.asInstanceOf[js.Any])
    
    inline def setResizeClusterUndefined: Self = StObject.set(x, "ResizeCluster", js.undefined)
    
    inline def setResumeCluster(value: ResumeClusterMessage): Self = StObject.set(x, "ResumeCluster", value.asInstanceOf[js.Any])
    
    inline def setResumeClusterUndefined: Self = StObject.set(x, "ResumeCluster", js.undefined)
  }
}
