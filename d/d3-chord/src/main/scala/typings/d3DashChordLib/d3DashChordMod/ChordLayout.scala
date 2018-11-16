package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChordLayout extends js.Object {
  /**
       * Computes the chord layout for the specified square matrix of size n×n, where the matrix represents the directed flow amongst a network (a complete digraph) of n nodes.
       *
       * @param matrix An (n x n) matrix representing the directed flow amongst a network (a complete digraph) of n nodes.The given matrix must be an array of length n,
       * where each element matrix[i] is an array of n numbers, where each matrix[i][j] represents the flow from the ith node in the network to the jth node.
       * Each number matrix[i][j] must be nonnegative, though it can be zero if there is no flow from node i to node j.
       */
  def apply(matrix: js.Array[js.Array[scala.Double]]): Chords = js.native
  /**
       * Returns the current pad angle in radians, which defaults to zero.
       */
  def padAngle(): scala.Double = js.native
  /**
       * Sets the pad angle between adjacent groups to the specified number in radians and returns this chord layout.
       *
       * The default is zero.
       *
       * @param angle Pad angle between adjacent groups in radians.
       */
  def padAngle(angle: scala.Double): this.type = js.native
  /**
       * Returns the current chord comparator, which defaults to null.
       */
  def sortChords(): (js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]) | scala.Null = js.native
  /**
       * Sets the chord comparator to the specified function and returns this chord layout.
       *
       * If the chord comparator is non-null, it is used to sort the chords by their combined flow; this only affects the z-order of the chords.
       * See also d3.ascending and d3.descending.
       *
       * @param compare A comparator function, e.g. d3.ascending or d3.descending.
       */
  def sortChords(compare: js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]): this.type = js.native
  /**
       * Removes the current chord comparator and returns this chord layout.
       *
       * @param compare Use null to remove the current comparator function, if any.
       */
  @JSName("sortChords")
  def `sortChords_<this>`(): this.type = js.native
  /**
       * Returns the current group comparator, which defaults to null.
       */
  def sortGroups(): (js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]) | scala.Null = js.native
  /**
       * Sets the group comparator to the specified function and returns this chord layout.
       *
       * If the group comparator is non-null, it is used to sort the groups by their total outflow. See also d3.ascending and d3.descending.
       *
       * @param compare A comparator function, e.g. d3.ascending or d3.descending.
       */
  def sortGroups(compare: js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]): this.type = js.native
  /**
       * Removes the current group comparator and returns this chord layout.
       *
       * @param compare Use null to remove the current comparator function, if any.
       */
  @JSName("sortGroups")
  def `sortGroups_<this>`(): this.type = js.native
  /**
       * Returns the current subgroup comparator, which defaults to null.
       */
  def sortSubgroups(): (js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]) | scala.Null = js.native
  /**
       * Sets the subgroup comparator to the specified function and returns this chord layout.
       *
       * If the subgroup comparator is non-null, it is used to sort the subgroups corresponding to matrix[i][0 … n - 1]
       * for a given group i by their total outflow. See also d3.ascending and d3.descending.
       *
       * @param compare A comparator function, e.g. d3.ascending or d3.descending.
       */
  def sortSubgroups(compare: js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]): this.type = js.native
  /**
       * Removes the current subgroup comparator and returns this chord layout.
       *
       * @param compare Use null to remove the current comparator function, if any.
       */
  @JSName("sortSubgroups")
  def `sortSubgroups_<this>`(): this.type = js.native
}

