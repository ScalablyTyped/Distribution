package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinesMesh extends Mesh {
  
  var _addClipPlaneDefine: js.Any = js.native
  
  var _colorShader: js.Any = js.native
  
  var _removeClipPlaneDefine: js.Any = js.native
  
  /**
    * Alpha of the line (Default: 1)
    */
  var alpha: Double = js.native
  
  /**
    * Color of the line (Default: White)
    */
  var color: Color3 = js.native
  
  var color4: js.Any = js.native
  
  /**
    * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
    * This margin is expressed in world space coordinates, so its value may vary.
    * Default value is 0.1
    */
  var intersectionThreshold: Double = js.native
  
  /**
    * @hidden
    */
  def material_=(value: Material): Unit = js.native
  
  /**
    * If vertex alpha should be applied to the mesh
    */
  val useVertexAlpha: js.UndefOr[Boolean] = js.native
  
  /**
    * If vertex color should be applied to the mesh
    */
  val useVertexColor: js.UndefOr[Boolean] = js.native
}
