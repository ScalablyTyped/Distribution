package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Cartesian2
import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.Scene
import typings.cesiumWidgets.mod.SelectionIndicatorViewModel.ComputeScreenSpacePosition
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "SelectionIndicatorViewModel")
@js.native
open class SelectionIndicatorViewModel protected () extends StObject {
  def this(scene: Scene, selectionIndicatorElement: Element, container: Element) = this()
  
  /**
    * Animate the indicator to draw attention to the selection.
    */
  def animateAppear(): Unit = js.native
  
  /**
    * Animate the indicator to release the selection.
    */
  def animateDepart(): Unit = js.native
  
  /**
    * Gets or sets the function for converting the world position of the object to the screen space position.
    * @example
    * selectionIndicatorViewModel.computeScreenSpacePosition = function(position, result) {
    *     return Cesium.SceneTransforms.wgs84ToWindowCoordinates(scene, position, result);
    * };
    */
  def computeScreenSpacePosition(position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  /**
    * Gets or sets the function for converting the world position of the object to the screen space position.
    * @example
    * selectionIndicatorViewModel.computeScreenSpacePosition = function(position, result) {
    *     return Cesium.SceneTransforms.wgs84ToWindowCoordinates(scene, position, result);
    * };
    */
  @JSName("computeScreenSpacePosition")
  var computeScreenSpacePosition_Original: ComputeScreenSpacePosition = js.native
  
  /**
    * Gets the HTML element containing the selection indicator.
    */
  var container: Element = js.native
  
  /**
    * Gets the visibility of the position indicator.  This can be false even if an
    * object is selected, when the selected object has no position.
    */
  var isVisible: Boolean = js.native
  
  /**
    * Gets or sets the world position of the object for which to display the selection indicator.
    */
  var position: Cartesian3 = js.native
  
  /**
    * Gets the scene being used.
    */
  var scene: Scene = js.native
  
  /**
    * Gets the HTML element that holds the selection indicator.
    */
  var selectionIndicatorElement: Element = js.native
  
  /**
    * Gets or sets the visibility of the selection indicator.
    */
  var showSelection: Boolean = js.native
  
  /**
    * Updates the view of the selection indicator to match the position and content properties of the view model.
    * This function should be called as part of the render loop.
    */
  def update(): Unit = js.native
}
object SelectionIndicatorViewModel {
  
  /**
    * A function that converts the world position of an object to a screen space position.
    * @param position - The position in WGS84 (world) coordinates.
    * @param result - An object to return the input position transformed to window coordinates.
    */
  type ComputeScreenSpacePosition = js.Function2[/* position */ Cartesian3, /* result */ Cartesian2, Cartesian2]
}
