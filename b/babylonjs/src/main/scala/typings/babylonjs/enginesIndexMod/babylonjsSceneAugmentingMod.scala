package typings.babylonjs.enginesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @hidden */
    def _createMultiviewUbo(): Unit = js.native
    
    /** @hidden */
    var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
    
    /** @hidden */
    def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
    
    /** @hidden */
    var _transformMatrixR: Matrix = js.native
    
    /** @hidden */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
  }
}
