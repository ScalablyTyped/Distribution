package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneOptimization")
@js.native
/**
  * Creates the SceneOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  */
open class SceneOptimization ()
  extends StObject
     with typings.babylonjs.BABYLON.SceneOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
  
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(scene: typings.babylonjs.BABYLON.Scene, optimizer: typings.babylonjs.BABYLON.SceneOptimizer): Boolean = js.native
  
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
  
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  var priority: Double = js.native
}
