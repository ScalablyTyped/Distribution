package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
@js.native
trait NodeCollectionPosition extends StObject {
  
  /**
    * Allow the user to grab the nodes.
    * http://js.cytoscape.org/#nodes.grabify
    */
  def grabify(): this.type = js.native
  
  /**
    * Lock the nodes such that their positions can not be changed.
    * http://js.cytoscape.org/#nodes.lock
    */
  def lock(): this.type = js.native
  
  def modelPositions(handler: ElementPositionFunction): this.type = js.native
  def modelPositions(handler: Position): this.type = js.native
  
  def points(handler: ElementPositionFunction): this.type = js.native
  def points(handler: Position): this.type = js.native
  
  /**
    * Set the positions via a function.
    * @param handler A callback function that returns the position to set for each element.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    * http://js.cytoscape.org/#nodes.positions
    */
  def positions(handler: ElementPositionFunction): this.type = js.native
  def positions(handler: Position): this.type = js.native
  
  /**
    * Shift the positions of the nodes by a given model position vector.
    * @param dimension The position dimension to shift.
    * @param value The value to shift the dimension.
    */
  def shift(dimension: PositionDimension): this.type = js.native
  def shift(dimension: PositionDimension, value: Double): this.type = js.native
  /**
    * Shift the positions of the nodes by a given model position vector.
    * @param pos An object specifying name-value pairs representing dimensions to shift.
    */
  def shift(pos: Position): this.type = js.native
  
  /**
    * Disallow the user to grab the nodes.
    * http://js.cytoscape.org/#nodes.ungrabify
    */
  def ungrabify(): this.type = js.native
  
  /**
    * Unlock the nodes such that their positions can be changed.
    * http://js.cytoscape.org/#nodes.unlock
    */
  def unlock(): this.type = js.native
}
