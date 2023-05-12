package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailMesh
  extends StObject
     with Mesh {
  
  /* private */ var _autoStart: Any = js.native
  
  /* private */ var _beforeRenderObserver: Any = js.native
  
  /* private */ var _createMesh: Any = js.native
  
  /* private */ var _generator: Any = js.native
  
  /* private */ var _length: Any = js.native
  
  /* private */ var _running: Any = js.native
  
  /* private */ var _sectionNormalVectors: Any = js.native
  
  /* private */ var _sectionPolygonPointsCount: Any = js.native
  
  /* private */ var _sectionVectors: Any = js.native
  
  /**
    * Returns a new TrailMesh object.
    * @param name is a string, the name given to the new mesh
    * @param newGenerator use new generator object for cloned trail mesh
    * @returns a new mesh
    */
  def clone(name: String, newGenerator: TransformNode): TrailMesh = js.native
  def clone(name: Unit, newGenerator: TransformNode): TrailMesh = js.native
  
  /**
    * The diameter of the trail, i.e. the width of the ribbon.
    */
  var diameter: Double = js.native
  
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
