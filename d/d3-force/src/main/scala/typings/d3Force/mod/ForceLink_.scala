package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceLink_[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: SimulationLinkDatum[NodeDatum] */] extends Force[NodeDatum, LinkDatum] {
  /**
    * Return the current distance accessor, which defaults to implying a default distance of 30.
    */
  def distance(): js.Function3[/* link */ LinkDatum, /* i */ Double, /* links */ js.Array[LinkDatum], Double] = js.native
  /**
    * Set the distance accessor to use the specified function,
    * re-evaluates the distance accessor for each link, and returns this force.
    *
    * The distance accessor is invoked for each link, being passed the link, its zero-based index and the complete array of links.
    * The resulting number is then stored internally, such that the distance of each link is only recomputed when the force is initialized or
    * when this method is called with a new distance, and not on every application of the force.
    *
    * @param distance A distance accessor function which is invoked for each link being passed the link,
    * its zero-based index and the complete array of links. It returns the distance.
    */
  def distance(
    distance: js.Function3[/* link */ LinkDatum, /* i */ Double, /* links */ js.Array[LinkDatum], Double]
  ): this.type = js.native
  /**
    * Set the distance accessor to use the specified constant number for all links,
    * re-evaluates the distance accessor for each link, and returns this force.
    *
    * The constant is internally wrapped into a distance accessor function.
    *
    * The distance accessor is invoked for each link, being passed the link, its zero-based index and the complete array of links.
    * The resulting number is then stored internally, such that the distance of each link is only recomputed when the force is initialized or
    * when this method is called with a new distance, and not on every application of the force.
    *
    * @param distance The constant distance to be used for all links.
    */
  def distance(distance: Double): this.type = js.native
  /**
    * Return the current node id accessor, which defaults to the numeric node.index.
    */
  def id(): js.Function3[
    /* node */ NodeDatum, 
    /* i */ Double, 
    /* nodesData */ js.Array[NodeDatum], 
    String | Double
  ] = js.native
  /**
    * Set the node id accessor to the specified function and return this force.
    *
    * The default id accessor allows each link’s source and target to be specified as a zero-based index
    * into the nodes array.
    *
    * The id accessor is invoked for each node whenever the force is initialized,
    * as when the nodes or links change, being passed the node, the zero-based index of the node in the node array, and the node array.
    *
    * @param id A node id accessor function which is invoked for each node in the simulation,
    * being passed the node, the zero-based index of the node in the node array, and the node array. It returns a string to represent the node id which can be used
    * for matching link source and link target strings during the ForceLink initialization.
    */
  def id(
    id: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodesData */ js.Array[NodeDatum], String]
  ): this.type = js.native
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceLink_(nodes: js.Array[NodeDatum]): Unit = js.native
  /**
    * Return the current iteration count which defaults to 1.
    */
  def iterations(): Double = js.native
  /**
    * Sets the number of iterations per application to the specified number and return this force.
    *
    * Increasing the number of iterations greatly increases the rigidity of the constraint and is useful for complex structures such as lattices,
    * but also increases the runtime cost to evaluate the force.
    *
    * @param iterations Number of iterations.
    */
  def iterations(iterations: Double): this.type = js.native
  /**
    * Return the current array of links, which defaults to the empty array.
    *
    */
  def links(): js.Array[LinkDatum] = js.native
  /**
    * Set the array of links associated with this force, recompute the distance and strength parameters for each link, and return this force.
    *
    * Each link is an object with the following properties:
    * * source - the link’s source node; see simulation.nodes
    * * target - the link’s target node; see simulation.nodes
    * * index - the zero-based index into links, assigned by this method
    *
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * If the specified array of links is modified, such as when links are added to or removed from the simulation,
    * this method must be called again with the new (or changed) array to notify the force of the change;
    * the force does not make a defensive copy of the specified array.
    *
    * @param links An array of link data.
    */
  def links(links: js.Array[LinkDatum]): this.type = js.native
  /**
    * Return the current strength accessor.
    * For details regarding the default behavior see: {@link https://github.com/d3/d3-force#link_strength}
    */
  def strength(): js.Function3[/* link */ LinkDatum, /* i */ Double, /* links */ js.Array[LinkDatum], Double] = js.native
  /**
    * Set the strength accessor to use the specified function,
    * re-evaluates the strength accessor for each link, and returns this force.
    *
    * The strength accessor is invoked for each link, being passed the link, its zero-based index and the complete array of links.
    * The resulting number is then stored internally, such that the strength of each link is only recomputed
    * when the force is initialized or when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength A distance accessor function which is invoked for each link being passed the link,
    * its zero-based index and the complete array of links. It returns the strength.
    */
  def strength(
    strength: js.Function3[/* link */ LinkDatum, /* i */ Double, /* links */ js.Array[LinkDatum], Double]
  ): this.type = js.native
  /**
    * Set the strength accessor to use the specified constant number for all links,
    * re-evaluates the strength accessor for each link, and returns this force.
    *
    * The constant is internally wrapped into a strength accessor function.
    *
    * The strength accessor is invoked for each link, being passed the link, its zero-based index and the complete array of links.
    * The resulting number is then stored internally, such that the strength of each link is only recomputed
    * when the force is initialized or when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength The constant strength to be used for all links.
    */
  def strength(strength: Double): this.type = js.native
}

