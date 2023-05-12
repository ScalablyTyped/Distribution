package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsMassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BodyPluginData")
@js.native
open class BodyPluginData protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BodyPluginData {
  def this(bodyId: Any) = this()
  
  /* CompleteClass */
  var hpBodyId: Any = js.native
  
  /* CompleteClass */
  var userMassProps: PhysicsMassProperties = js.native
  
  /* CompleteClass */
  var worldTransformOffset: Double = js.native
}
