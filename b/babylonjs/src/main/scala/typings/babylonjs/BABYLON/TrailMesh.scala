package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailMesh extends Mesh {
  
  var _autoStart: js.Any = js.native
  
  var _beforeRenderObserver: js.Any = js.native
  
  var _createMesh: js.Any = js.native
  
  var _diameter: js.Any = js.native
  
  var _generator: js.Any = js.native
  
  var _length: js.Any = js.native
  
  var _running: js.Any = js.native
  
  var _sectionNormalVectors: js.Any = js.native
  
  var _sectionPolygonPointsCount: js.Any = js.native
  
  var _sectionVectors: js.Any = js.native
  
  def clone(name: js.UndefOr[scala.Nothing], newGenerator: TransformNode): TrailMesh = js.native
  /**
    * Returns a new TrailMesh object.
    * @param name is a string, the name given to the new mesh
    * @param newGenerator use new generator object for cloned trail mesh
    * @returns a new mesh
    */
  def clone(name: String, newGenerator: TransformNode): TrailMesh = js.native
  
  /**
    * Start trailing mesh.
    */
  def start(): Unit = js.native
  
  /**
    * Stop trailing mesh.
    */
  def stop(): Unit = js.native
  
  /**
    * Update trailing mesh geometry.
    */
  def update(): Unit = js.native
}
