package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotdebuggingMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @internal */
      def _debugFlushPendingCommands(): Unit = js.native
      
      /** @internal */
      def _debugInsertMarker(text: String): Unit = js.native
      def _debugInsertMarker(text: String, targetObject: Double): Unit = js.native
      
      /** @internal */
      def _debugPopGroup(): Unit = js.native
      def _debugPopGroup(targetObject: Double): Unit = js.native
      
      /** @internal */
      def _debugPushGroup(groupName: String): Unit = js.native
      def _debugPushGroup(groupName: String, targetObject: Double): Unit = js.native
    }
  }
}
