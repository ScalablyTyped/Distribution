package typings.babylonjs.miscIndexMod

import typings.babylonjs.PressureObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "PressureObserverWrapper")
@js.native
/**
  * A pressure observer will call this callback, whenever these thresholds are met.
  * @param options An object containing the thresholds used to decide what value to to return for each update property (average of start and end of a threshold boundary).
  */
open class PressureObserverWrapper ()
  extends typings.babylonjs.miscPressureObserverWrapperMod.PressureObserverWrapper {
  def this(options: PressureObserverOptions) = this()
}
