package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityCollection extends Layer {
  /**
    * Gets the item at a specified index.
    * @param index Index of the item to get.
    * @returns The item at a specified index.
    */
  def get(index: Double): IPrimitive = js.native
  /**
    * Gets the number of items in this collection.
    * @returns The count of the items.
    */
  def getLength(): Double = js.native
  /**
    * Gets the index of the item in the list.
    * @param primitive The item to get the index of.
    * @returns The index of the item in the list.
    */
  def indexOf(primitive: IPrimitive): Double = js.native
  /**
    * Inserts the item into the list at a specific index.
    * @param primitive The item to insert.
    * @param index Index of the item to be inserted.
    */
  def insert(primitive: IPrimitive, index: Double): Unit = js.native
  /**
    * Returns the last element in the list after removing it.
    * @returns The last element in the list after removing it.
    */
  def pop(): IPrimitive = js.native
  def push(primitive: js.Array[IPrimitive]): Unit = js.native
  /**
    * Adds the item to the end of the list.
    * @param primitive Item to be added.
    */
  def push(primitive: IPrimitive): Unit = js.native
}

