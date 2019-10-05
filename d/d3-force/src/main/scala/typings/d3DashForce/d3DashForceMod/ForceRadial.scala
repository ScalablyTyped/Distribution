package typings.d3DashForce.d3DashForceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceRadial[NodeDatum /* <: SimulationNodeDatum */]
  extends Force[NodeDatum, js.Any] {
  /**
    * Assign the array of nodes to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  @JSName("initialize")
  def initialize_MForceRadial(nodes: js.Array[NodeDatum]): Unit = js.native
  /**
    * Return the current radius accessor for the circle.
    */
  def radius(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the radius accessor for the circle to the specified function, re-evaluates the radius accessor for each node,
    * and returns this force.
    *
    * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that radius of the circle for each node is only recomputed when the force is initialized or
    * when this method is called with a new radius, and not on every application of the force.
    *
    * @param radius A radius accessor function for the circle which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the radius of the circle.
    */
  def radius(radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the radius accessor for the circle to the specified number, re-evaluates the radius accessor for each node,
    * and returns this force.
    *
    * The constant is internally wrapped into a radius accessor function.
    *
    * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that radius of the circle for each node is only recomputed when the force is initialized or
    * when this method is called with a new radius, and not on every application of the force.
    *
    * @param radius Constant radius of the circle to be used for all nodes.
    */
  def radius(radius: Double): this.type = js.native
  /**
    *  Returns the current strength accessor, which defaults to a constant strength for all nodes of 0.1.
    */
  def strength(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the strength accessor to the specified function, re-evaluates the strength accessor for each node, and returns this force.
    *
    * The strength determines how much to increment the node’s x-velocity: (x - node.x) × strength.
    *
    * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current x-position to the target x-position with each application.
    * Higher values moves nodes more quickly to the target position, often at the expense of other forces or constraints.
    *
    * A value outside the range [0,1] is not recommended.
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
    * Set the strength accessor to the specified constant strength for all nodes, re-evaluates the strength accessor for each node, and returns this force.
    *
    * The strength determines how much to increment the node’s x-velocity: (x - node.x) × strength.
    *
    * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current x-position to the target x-position with each application.
    * Higher values moves nodes more quickly to the target position, often at the expense of other forces or constraints.
    *
    * A value outside the range [0,1] is not recommended.
    *
    * The constant is internally wrapped into a strength accessor function.
    *
    * The strength accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the strength of each node is only recomputed when the force is initialized or
    * when this method is called with a new strength, and not on every application of the force.
    *
    * @param strength Constant value of strength to be used for all nodes.
    */
  def strength(strength: Double): this.type = js.native
  /**
    * Return the current x-accessor for the circle center, which defaults to a function returning 0 for all nodes.
    */
  def x(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the x-coordinate accessor to the specified function, re-evaluates the x-accessor for each node,
    * and returns this force.
    *
    * The x-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the x-coordinate of the circle center for each node is only recomputed when the force is initialized or
    * when this method is called with a new x, and not on every application of the force.
    *
    * @param x A x-coordinate accessor function for the circle center which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the x-coordinate of the circle center.
    */
  def x(x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the x-coordinate accessor for the circle center to the specified number, re-evaluates the x-accessor for each node,
    * and returns this force.
    *
    * The constant is internally wrapped into an x-coordinate accessor function.
    *
    * The x-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the x-coordinate of the circle center for each node is only recomputed when the force is initialized or
    * when this method is called with a new x, and not on every application of the force.
    *
    * @param x Constant x-coordinate of the circle center to be used for all nodes.
    */
  def x(x: Double): this.type = js.native
  /**
    * Return the current y-accessor for the circle center, which defaults to a function returning 0 for all nodes.
    */
  def y(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
  /**
    * Set the y-coordinate accessor to the specified function, re-evaluates the y-accessor for each node,
    * and returns this force.
    *
    * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the y-coordinate of the circle center for each node is only recomputed when the force is initialized or
    * when this method is called with a new y, and not on every application of the force.
    *
    * @param y A y-coordinate accessor function for the circle center which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The function returns the y-coordinate of the circle center.
    */
  def y(y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
  /**
    * Set the y-coordinate accessor for the circle center to the specified number, re-evaluates the y-accessor for each node,
    * and returns this force.
    *
    * The constant is internally wrapped into an y-coordinate accessor function.
    *
    * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
    * The resulting number is then stored internally, such that the y-coordinate of the circle center for each node is only recomputed when the force is initialized or
    * when this method is called with a new y, and not on every application of the force.
    *
    * @param y Constant y-coordinate of the circle center to be used for all nodes.
    */
  def y(y: Double): this.type = js.native
}

@JSImport("d3-force", "forceRadial")
@js.native
object forceRadial extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: Double
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double,
    y: Double
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: Double): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: Double
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: Double, x: Double): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](radius: Double, x: Double, y: Double): ForceRadial[NodeDatum] = js.native
}

