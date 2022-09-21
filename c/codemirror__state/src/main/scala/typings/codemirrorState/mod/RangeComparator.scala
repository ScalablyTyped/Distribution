package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Collection of methods used when comparing range sets.
*/
@js.native
trait RangeComparator[T /* <: RangeValue */] extends StObject {
  
  /**
    Notification for a changed (or inserted, or deleted) point range.
    */
  def comparePoint(from: Double, to: Double): Unit = js.native
  def comparePoint(from: Double, to: Double, pointA: T): Unit = js.native
  def comparePoint(from: Double, to: Double, pointA: T, pointB: T): Unit = js.native
  def comparePoint(from: Double, to: Double, pointA: Null, pointB: T): Unit = js.native
  
  /**
    Notifies the comparator that a range (in positions in the new
    document) has the given sets of values associated with it, which
    are different in the old (A) and new (B) sets.
    */
  def compareRange(from: Double, to: Double, activeA: js.Array[T], activeB: js.Array[T]): Unit = js.native
}
