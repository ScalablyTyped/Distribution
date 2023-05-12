package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.Queue.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Queue")
@js.native
open class Queue () extends StObject {
  
  /**
    * Remove all items from the queue.
    */
  def clear(): Unit = js.native
  
  /**
    * Check whether this queue contains the specified item.
    * @param item - The item to search for.
    */
  def contains(item: Any): Unit = js.native
  
  /**
    * Dequeues an item.  Returns undefined if the queue is empty.
    * @returns The the dequeued item.
    */
  def dequeue(): Any = js.native
  
  /**
    * Enqueues the specified item.
    * @param item - The item to enqueue.
    */
  def enqueue(item: Any): Unit = js.native
  
  /**
    * The length of the queue.
    */
  val length: Double = js.native
  
  /**
    * Returns the item at the front of the queue.  Returns undefined if the queue is empty.
    * @returns The item at the front of the queue.
    */
  def peek(): Any = js.native
  
  /**
    * Sort the items in the queue in-place.
    * @param compareFunction - A function that defines the sort order.
    */
  def sort(compareFunction: Comparator): Unit = js.native
}
object Queue {
  
  /**
    * A function used to compare two items while sorting a queue.
    * @example
    * function compareNumbers(a, b) {
    *     return a - b;
    * }
    * @param a - An item in the array.
    * @param b - An item in the array.
    */
  type Comparator = js.Function2[/* a */ Any, /* b */ Any, Double]
}
