package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayAnimationAction
  extends StObject
     with Action {
  
  /* private */ var _target: Any = js.native
  
  /**
    * Where the animation should start (animation frame)
    */
  var from: Double = js.native
  
  /**
    * Define if the animation should loop or stop after the first play.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Where the animation should stop (animation frame)
    */
  var to: Double = js.native
}
