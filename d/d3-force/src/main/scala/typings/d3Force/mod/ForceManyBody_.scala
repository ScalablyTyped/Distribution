package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceManyBody_[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  
  /**
    * Returns the current maximum distance over which this force is considered, which defaults to infinity.
    */
  def distanceMax(): Double = js.native
  /**
    * Sets the maximum distance between nodes over which this force is considered.
    *
    * Specifying a finite maximum distance improves performance and produces a more localized layout.
    *
    * The default value is infinity.
    *
    * @param distance The maximum distance between nodes over which this force is considered.
    */
  def distanceMax(distance: Double): this.type = js.native
  
  /**
    * Returns the current minimum distance over which this force is considered, which defaults to 1.
    */
  def distanceMin(): Double = js.native
  /**
    * Sets the minimum distance between nodes over which this force is considered.
    *
    * A minimum distance establishes an upper bound on the strength of the force between two nearby nodes, avoiding instability.
    * In particular, it avoids an infinitely-strong force if two nodes are exactly coincident; in this case, the direction of the force is random.
    *
    * The default value is 1.
    *
    * @param distance The minimum distance between nodes over which this force is considered.
    */
  def distanceMin(distance: Double): this.type = js.native
  
  /**
    * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceManyBody_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
  
  /**
    * Return the current strength accessor.
    *
    * For details regarding the default behavior see: {@link https://github.com/d3/d3-force#manyBody_strength}
    */
  def strength(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the strength accessor to the specified function, re-evaluates the strength accessor for each node, and
    * returns this force.
    *
    * A positive value causes nodes to attract each other, similar to gravity, while a negative value causes nodes to repel each other,
    * similar to electrostatic charge.
    *
    * The default represents a constant value of -30.
    *
    * The strength accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the strength of each node is only recomputed when the force is initialized or
    * when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength A strength accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the strength.
    */
  def strength(strength: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the strength accessor to the specified constant strength for all nodes, re-evaluates the strength accessor for each node, and
    * returns this force.
    *
    * A positive value causes nodes to attract each other, similar to gravity, while a negative value causes nodes to repel each other,
    * similar to electrostatic charge.
    *
    * The default represents a constant value of -30.
    *
    * The constant is internally wrapped into a strength accessor function.
    *
    * The strength accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the strength of each node is only recomputed when the force is initialized or
    * when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength The constant strength to be used for all nodes.
    */
  def strength(strength: Double): this.type = js.native
  
  /**
    * Return the current value of the Barnes–Hut approximation criterion , which defaults to 0.9
    */
  def theta(): Double = js.native
  /**
    * Set the Barnes–Hut approximation criterion to the specified number and returns this force.
    *
    * To accelerate computation, this force implements the Barnes–Hut approximation which takes O(n log n) per application
    * where n is the number of nodes. For each application, a quadtree stores the current node positions;
    * then for each node, the combined force of all other nodes on the given node is computed.
    * For a cluster of nodes that is far away, the charge force can be approximated by treating the cluster as a single, larger node.
    * The theta parameter determines the accuracy of the approximation:
    * if the ratio w / l of the width w of the quadtree cell to the distance l from the node to the cell’s center of mass is less than theta,
    * all nodes in the given cell are treated as a single node rather than individually.
    *
    * The default value is 0.9.
    *
    * @param theta Value for the theta parameter.
    */
  def theta(theta: Double): this.type = js.native
}
