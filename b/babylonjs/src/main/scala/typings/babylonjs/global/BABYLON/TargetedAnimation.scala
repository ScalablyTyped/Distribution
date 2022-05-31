package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TargetedAnimation")
@js.native
class TargetedAnimation ()
  extends StObject
     with typings.babylonjs.BABYLON.TargetedAnimation {
  
  /**
    * Animation to perform
    */
  /* CompleteClass */
  var animation: typings.babylonjs.BABYLON.Animation = js.native
  
  /**
    * Returns the string "TargetedAnimation"
    * @returns "TargetedAnimation"
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  
  /**
    * Target to animate
    */
  /* CompleteClass */
  var target: js.Any = js.native
}
