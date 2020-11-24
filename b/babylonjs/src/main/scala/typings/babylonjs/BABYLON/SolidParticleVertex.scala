package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolidParticleVertex extends js.Object {
  
  /**
    * Vertex color
    */
  var color: Color4 = js.native
  
  /**
    * Vertex position
    */
  var position: Vector3 = js.native
  
  /**
    * Vertex UV
    */
  var uv: Vector2 = js.native
  
  /** Vertex x coordinate */
  def x: Double = js.native
  def x_=(`val`: Double): Unit = js.native
  
  /** Vertex y coordinate */
  def y: Double = js.native
  def y_=(`val`: Double): Unit = js.native
  
  /** Vertex z coordinate */
  def z: Double = js.native
  def z_=(`val`: Double): Unit = js.native
}
