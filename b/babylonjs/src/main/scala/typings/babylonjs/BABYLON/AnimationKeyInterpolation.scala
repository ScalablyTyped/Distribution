package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationKeyInterpolation extends StObject
@JSGlobal("BABYLON.AnimationKeyInterpolation")
@js.native
object AnimationKeyInterpolation extends StObject {
  
  /**
    * Use tangents to interpolate between start and end values.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with AnimationKeyInterpolation
  
  /**
    * Do not interpolate between keys and use the start key value only. Tangents are ignored
    */
  @js.native
  sealed trait STEP
    extends StObject
       with AnimationKeyInterpolation
}
