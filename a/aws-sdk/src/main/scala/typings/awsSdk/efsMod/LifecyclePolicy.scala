package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicy extends StObject {
  
  /**
    *  Describes the period of time that a file is not accessed, after which it transitions to IA storage. Metadata operations such as listing the contents of a directory don't count as file access events.
    */
  var TransitionToIA: js.UndefOr[TransitionToIARules] = js.undefined
  
  /**
    * Describes when to transition a file from IA storage to primary storage. Metadata operations such as listing the contents of a directory don't count as file access events.
    */
  var TransitionToPrimaryStorageClass: js.UndefOr[TransitionToPrimaryStorageClassRules] = js.undefined
}
object LifecyclePolicy {
  
  inline def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  
  extension [Self <: LifecyclePolicy](x: Self) {
    
    inline def setTransitionToIA(value: TransitionToIARules): Self = StObject.set(x, "TransitionToIA", value.asInstanceOf[js.Any])
    
    inline def setTransitionToIAUndefined: Self = StObject.set(x, "TransitionToIA", js.undefined)
    
    inline def setTransitionToPrimaryStorageClass(value: TransitionToPrimaryStorageClassRules): Self = StObject.set(x, "TransitionToPrimaryStorageClass", value.asInstanceOf[js.Any])
    
    inline def setTransitionToPrimaryStorageClassUndefined: Self = StObject.set(x, "TransitionToPrimaryStorageClass", js.undefined)
  }
}
