package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManager extends StObject {
  
  def add(data: js.Array[IPrimitive]): Unit = js.native
  def add(data: js.Array[IPrimitive], index: Double): Unit = js.native
  /**
    * Adds a shapes to the layer, at the specified index if specified.
    • @param data The shape(s) to be added to the layer.
    • @param index The index at which to insert the shape into the layer.
    */
  def add(data: IPrimitive): Unit = js.native
  def add(data: IPrimitive, index: Double): Unit = js.native
  
  /**
    * Resets the drawing manager and clears all shapes in the drawing layer.
    */
  def clear(): Unit = js.native
  
  /**
    * Disposes the drawing manager instance.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the current drawing mode of the drawing manager.
    * @returns The current drawing mode of the drawing manager.
    */
  def getDrawingMode(): DrawingMode = js.native
  
  /**
    * Gets an array of shapes that are in the layer. This can be used to iterate over the individual shapes.
    * @returns An array of shapes that are in the layer. This can be used to iterate over the individual shapes.
    */
  def getPrimitives(): js.Array[IPrimitive] = js.native
  
  /**
    * Returns the index of the shape in the drawing layer.
    * @param primitive The shape to find the index of.
    * @param fromIndex The index to start the search from.
    * @returns The index of the shape in the drawing layer. Returns -1 if shape is not found.
    */
  def indexOf(primitive: IPrimitive): Double = js.native
  def indexOf(primitive: IPrimitive, fromIndex: Double): Double = js.native
  
  /**
    * Removes a shape from the layer and returns it.
    * @param primitive The shape to remove from the layer.
    * @returns The shape that was removed from the layer.
    */
  def remove(primitive: IPrimitive): IPrimitive = js.native
  
  /**
    * Removes a shape from the layer at the specified index.
    * @param index The index of the shape to remove from the layer.
    * @returns The shape that was removed from the layer.
    */
  def removeAt(index: Double): IPrimitive = js.native
  
  /**
    * Sets the drawing mode of the drawing manager.
    * @param mode The drawing mode to set the DrawingManager to.
    */
  def setDrawingMode(mode: DrawingMode): Unit = js.native
  
  /**
  		* Sets the drawing tool options.
  		* @param options The options to use with the drawing manager. 
  		*/
  def setOptions(options: IDrawingManagerOptions): Unit = js.native
  
  /**
    * Replaces all shapes in the layer with the new array of shapes that have been provided.
    * @param primitives An array of shapes to add to the drawing layer.
    */
  def setPrimitives(primitives: js.Array[IPrimitive]): Unit = js.native
}
