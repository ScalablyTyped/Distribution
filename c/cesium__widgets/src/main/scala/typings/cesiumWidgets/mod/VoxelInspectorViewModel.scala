package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Scene
import typings.cesiumEngine.mod.VoxelPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "VoxelInspectorViewModel")
@js.native
open class VoxelInspectorViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  
  /**
    * Compiles the shader in the shader editor.
    */
  def compileShader(): Unit = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the scene
    */
  val scene: Scene = js.native
  
  /**
    * Handles key press events on the shader editor.
    */
  def shaderEditorKeyPress(): Unit = js.native
  
  /**
    * Toggles the visibility of the bounds section
    */
  def toggleBounds(): Unit = js.native
  
  /**
    * Toggles the visibility of the clipping section
    */
  def toggleClipping(): Unit = js.native
  
  /**
    * Toggles the visibility of the display section
    */
  def toggleDisplay(): Unit = js.native
  
  /**
    * Toggles the inspector visibility
    */
  def toggleInspector(): Unit = js.native
  
  /**
    * Toggles the visibility of the shader section
    */
  def toggleShader(): Unit = js.native
  
  /**
    * Toggles the visibility of the transform section
    */
  def toggleTransform(): Unit = js.native
  
  /**
    * Gets or sets the primitive of the view model.
    */
  var voxelPrimitive: VoxelPrimitive = js.native
}
