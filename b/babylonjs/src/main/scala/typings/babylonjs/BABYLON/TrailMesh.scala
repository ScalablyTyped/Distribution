package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailMesh
  extends StObject
     with Mesh {
  
  /* private */ var _autoStart: js.Any = js.native
  
  /* private */ var _beforeRenderObserver: js.Any = js.native
  
  /* private */ var _createMesh: js.Any = js.native
  
  /* private */ var _diameter: js.Any = js.native
  
  /* private */ var _generator: js.Any = js.native
  
  /* private */ var _length: js.Any = js.native
  
  /* private */ var _running: js.Any = js.native
  
  /* private */ var _sectionNormalVectors: js.Any = js.native
  
  /* private */ var _sectionPolygonPointsCount: js.Any = js.native
  
  /* private */ var _sectionVectors: js.Any = js.native
  
  /**
    * Returns a new TrailMesh object.
    * @param name is a string, the name given to the new mesh
    * @param newGenerator use new generator object for cloned trail mesh
    * @returns a new mesh
    */
  def clone(name: String, newGenerator: TransformNode): TrailMesh = js.native
  def clone(name: Unit, newGenerator: TransformNode): TrailMesh = js.native
  
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
