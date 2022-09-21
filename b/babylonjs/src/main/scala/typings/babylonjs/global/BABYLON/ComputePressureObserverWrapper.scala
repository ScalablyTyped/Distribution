package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IComputePressureData
import typings.babylonjs.BABYLON.IComputePressureSource
import typings.babylonjs.BABYLON.IComputePressureThresholds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ComputePressureObserverWrapper")
@js.native
open class ComputePressureObserverWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ComputePressureObserverWrapper {
  /**
    * A compute pressure observer will call this callback, whenever these thresholds are met.
    * @param callback The callback that is called whenever thresholds are met.
    * @param thresholds An object containing the thresholds used to decide what value to to return for each update property (average of start and end of a threshold boundary).
    */
  def this(
    callback: js.Function1[/* update */ IComputePressureData, Unit],
    thresholds: IComputePressureThresholds
  ) = this()
  
  /* private */ /* CompleteClass */
  var _observer: Any = js.native
  
  /**
    * Method that must be called to begin observing changes, and triggering callbacks.
    * @param source defines the source to observe
    */
  /* CompleteClass */
  override def observe(source: IComputePressureSource): Unit = js.native
  
  /**
    * Method that must be called to stop observing changes and triggering callbacks (cleanup function).
    * @param source defines the source to unobserve
    */
  /* CompleteClass */
  override def unobserve(source: IComputePressureSource): Unit = js.native
}
