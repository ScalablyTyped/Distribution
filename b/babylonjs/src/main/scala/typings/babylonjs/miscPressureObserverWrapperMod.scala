package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscPressureObserverWrapperMod {
  
  @JSImport("babylonjs/Misc/pressureObserverWrapper", "PressureObserverWrapper")
  @js.native
  /**
    * A pressure observer will call this callback, whenever these thresholds are met.
    * @param options An object containing the thresholds used to decide what value to to return for each update property (average of start and end of a threshold boundary).
    */
  open class PressureObserverWrapper () extends StObject {
    def this(options: PressureObserverOptions) = this()
    
    /* private */ var _currentState: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /**
      * Release the associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Method that must be called to begin observing changes, and triggering callbacks.
      * @param source defines the source to observe
      */
    def observe(source: PressureSource): Unit = js.native
    
    /**
      * An event triggered when the cpu usage/speed meets certain thresholds.
      * Note: pressure is an experimental API.
      */
    var onPressureChanged: Observable[js.Array[PressureRecord]] = js.native
    
    /**
      * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
      * @param source defines the source to unobserve
      */
    def unobserve(source: PressureSource): Unit = js.native
  }
}
