package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
@js.native
trait NodeSingularPosition extends js.Object {
  /**
    * Get whether the user can grab a node.
    * http://js.cytoscape.org/#node.grabbable
    */
  def grabbable(): Boolean = js.native
  /**
    * Get whether a node is currently grabbed, meaning the user has hold of the node.
    * http://js.cytoscape.org/#node.grabbed
    */
  def grabbed(): Boolean = js.native
  /**
    * Get whether a node is locked, meaning that its position can not be changed.
    * http://js.cytoscape.org/#node.locked
    */
  def locked(): Boolean = js.native
  /**
    * Get the (model) position of a node.
    */
  def modelPosition(): Position = js.native
  /**
    * Get the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def modelPosition(dimension: PositionDimension): Double = js.native
  /**
    * Set the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def modelPosition(dimension: PositionDimension, value: Double): this.type = js.native
  /**
    * Set the position using name-value pairs in the specified object.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def modelPosition(pos: Position): this.type = js.native
  /**
    * Get the (model) position of a node.
    */
  def point(): Position = js.native
  /**
    * Get the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def point(dimension: PositionDimension): Double = js.native
  /**
    * Set the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def point(dimension: PositionDimension, value: Double): this.type = js.native
  /**
    * Set the position using name-value pairs in the specified object.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def point(pos: Position): this.type = js.native
  /**
    * Get the (model) position of a node.
    */
  def position(): Position = js.native
  /**
    * Get the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def position(dimension: PositionDimension): Double = js.native
  /**
    * Set the value of a specified position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    */
  def position(dimension: PositionDimension, value: Double): this.type = js.native
  /**
    * Set the position using name-value pairs in the specified object.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def position(pos: Position): this.type = js.native
  /**
    * Get the value of a specified relative position dimension.
    * @param dimension The position dimension to get.
    * @param value The value to set to the dimension.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def relativePoint(): Position = js.native
  def relativePoint(dimension: PositionDimension): Position = js.native
  def relativePoint(dimension: PositionDimension, value: Position): this.type = js.native
  def relativePoint(pos: StringDictionary[Double]): this.type = js.native
  /**
    *
    * http://js.cytoscape.org/#node.relativePosition
    */
  /**
    * Get the value of a specified relative position dimension.
    * @param dimension The position dimension to get.
    * @param value The value to set to the dimension.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def relativePosition(): Position = js.native
  def relativePosition(dimension: PositionDimension): Position = js.native
  def relativePosition(dimension: PositionDimension, value: Position): this.type = js.native
  def relativePosition(pos: StringDictionary[Double]): this.type = js.native
  /**
    * Set the value of a specified rendered position dimension.
    * @param dimension The position dimension to set.
    * @param value The value to set to the dimension.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def renderedPoint(): Position = js.native
  def renderedPoint(dimension: PositionDimension): Position = js.native
  def renderedPoint(dimension: PositionDimension, value: Position): this.type = js.native
  def renderedPoint(pos: StringDictionary[Double]): this.type = js.native
  /**
    * Get or set the rendered (on-screen) position of a node.
    * http://js.cytoscape.org/#node.renderedPosition
    */
  /**
    * Get the value of a specified rendered position dimension.
    * @param dimension The position dimension to get.
    * @param value The value to set to the dimension.
    * @param pos An object specifying name-value pairs representing dimensions to set.
    */
  def renderedPosition(): Position = js.native
  def renderedPosition(dimension: PositionDimension): Position = js.native
  def renderedPosition(dimension: PositionDimension, value: Position): this.type = js.native
  def renderedPosition(pos: StringDictionary[Double]): this.type = js.native
}

