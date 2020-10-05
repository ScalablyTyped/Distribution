package typings.d3Force.mod

import typings.d3Force.d3ForceStrings.end
import typings.d3Force.d3ForceStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Simulation[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: js.UndefOr[SimulationLinkDatum[NodeDatum]] */] extends js.Object {
  /**
    * Return the current alpha of the simulation, which defaults to 1.
    */
  def alpha(): Double = js.native
  /**
    * Set the current alpha to the specified number in the range [0,1] and return this simulation.
    * The default is 1.
    *
    * @param alpha Current alpha of simulation.
    */
  def alpha(alpha: Double): this.type = js.native
  /**
    * Return the current alpha decay rate, which defaults to 0.0228… = 1 - pow(0.001, 1 / 300) where 0.001 is the default minimum alpha.
    */
  def alphaDecay(): Double = js.native
  /**
    * Set the alpha decay rate to the specified number in the range [0,1] and return this simulation.
    * The default is 0.0228… = 1 - pow(0.001, 1 / 300) where 0.001 is the default minimum alpha.
    *
    * The alpha decay rate determines how quickly the current alpha interpolates towards the desired target alpha;
    * since the default target alpha is zero, by default this controls how quickly the simulation cools.
    * Higher decay rates cause the simulation to stabilize more quickly, but risk getting stuck in a local minimum;
    * lower values cause the simulation to take longer to run, but typically converge on a better layout.
    * To have the simulation run forever at the current alpha, set the decay rate to zero;
    * alternatively, set a target alpha greater than the minimum alpha.
    *
    * @param decay Alpha decay rate.
    */
  def alphaDecay(decay: Double): this.type = js.native
  /**
    * Return the current minimum alpha value, which defaults to 0.001.
    */
  def alphaMin(): Double = js.native
  /**
    * Set the minimum alpha to the specified number in the range [0,1] and return this simulation.
    * The default is 0.001. The simulation’s internal timer stops when the current alpha is less than the minimum alpha.
    * The default alpha decay rate of ~0.0228 corresponds to 300 iterations.
    *
    * @param min Minimum alpha of simulation.
    */
  def alphaMin(min: Double): this.type = js.native
  /**
    * Returns the current target alpha value, which defaults to 0.
    */
  def alphaTarget(): Double = js.native
  /**
    * Set the current target alpha to the specified number in the range [0,1] and return this simulation.
    * The default is 0.
    *
    * @param target Alpha target value.
    */
  def alphaTarget(target: Double): this.type = js.native
  /**
    * Return the node closest to the position [x,y] with the given search radius.
    * If radius is not specified, it defaults to infinity.
    * If there is no node within the search area, returns undefined.
    *
    * @param x x-coordinate
    * @param y y-coordinate
    * @param radius Optional search radius. Defaults to infinity.
    */
  def find(x: Double, y: Double): js.UndefOr[NodeDatum] = js.native
  def find(x: Double, y: Double, radius: Double): js.UndefOr[NodeDatum] = js.native
  /**
    * Remove a previously registered force.
    *
    * @param name Name of the registered force.
    * @param force Use null to remove force.
    */
  def force(name: String, force: Null): this.type = js.native
  /**
    * Assign the force for the specified name and return this simulation.
    * (By default, new simulations have no forces.)
    *
    * @param name Name to register the force under.
    * @param force A force to use with the simulation.
    */
  def force(name: String, force: Force[NodeDatum, LinkDatum]): this.type = js.native
  /**
    * Return the force with the specified name, or undefined if there is no such force.
    * (By default, new simulations have no forces.)
    *
    * Given that it is in general not known, what type of force has been registered under
    * a specified name, use the generic to cast the result to the appropriate type, if known.
    *
    * @param name Name of the registered force.
    */
  def force[F /* <: Force[NodeDatum, LinkDatum] */](name: String): js.UndefOr[F] = js.native
  /**
    * Returns the simulation’s array of nodes as specified to the constructor.
    */
  def nodes(): js.Array[NodeDatum] = js.native
  /**
    * Set the simulation’s nodes to the specified array of objects, initialize their positions and velocities if necessary,
    * and then re-initialize any bound forces; Returns the simulation.
    *
    * Each node must be an object. The following properties are assigned by the simulation:
    * - index (the node’s zero-based index into nodes)
    * - x (the node’s current x-position)
    * - y (the node’s current y-position)
    * - vx (the node’s current x-velocity)
    * - vy (the node’s current y-velocity)
    *
    * The position [x,y] and velocity [vx,vy] may be subsequently modified by forces and by the simulation.
    * If either vx or vy is NaN, the velocity is initialized to [0,0]. If either x or y is NaN, the position is initialized in a phyllotaxis arrangement,
    * so chosen to ensure a deterministic, uniform distribution around the origin.
    *
    * To fix a node in a given position, you may specify two additional properties:
    * - fx (the node’s fixed x-position)
    * - fy (the node’s fixed y-position)
    *
    * At the end of each tick, after the application of any forces, a node with a defined node.fx has node.x reset to this value and node.vx set to zero;
    * likewise, a node with a defined node.fy has node.y reset to this value and node.vy set to zero.
    * To unfix a node that was previously fixed, set node.fx and node.fy to null, or delete these properties.
    *
    * If the specified array of nodes is modified, such as when nodes are added to or removed from the simulation,
    * this method must be called again with the new (or changed) array to notify the simulation and bound forces of the change;
    * the simulation does not make a defensive copy of the specified array.
    */
  def nodes(nodesData: js.Array[NodeDatum]): this.type = js.native
  def on(typenames: String): this.type = js.native
  def on(typenames: String, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_Union(typenames: String): js.UndefOr[js.ThisFunction0[/* this */ Simulation[NodeDatum, LinkDatum], Unit]] = js.native
  @JSName("on")
  def on_end(typenames: end): this.type = js.native
  @JSName("on")
  def on_end(typenames: end, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_end_Union(typenames: end): js.UndefOr[js.ThisFunction0[/* this */ Simulation[NodeDatum, LinkDatum], Unit]] = js.native
  /**
    * Remove the current event listeners for the specified typenames, if any, return the simulation.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace. Each typename is a type,
    * optionally followed by a period (.) and a name, such as "tick.foo" and "tick.bar"; the name allows multiple listeners to be registered for the same type.
    * The type must be one of the following: "tick" (after each tick of the simulation’s internal timer) or
    * "end" (after the simulation’s timer stops when alpha < alphaMin).
    * @param listener Use null to remove the listener.
    */
  @JSName("on")
  def on_tick(typenames: tick): this.type = js.native
  /**
    * Set the event listener for the specified typenames and return this simulation.
    * If an event listener was already registered for the same type and name,
    * the existing listener is removed before the new listener is added.
    * When a specified event is dispatched, each listener will be invoked with the this context as the simulation.
    *
    * The type must be one of the following:
    * - tick [after each tick of the simulation’s internal timer]
    * - end [after the simulation’s timer stops when alpha < alphaMin]
    *
    * Note that tick events are not dispatched when simulation.tick is called manually;
    * events are only dispatched by the internal timer and are intended for interactive rendering of the simulation.
    * To affect the simulation, register forces instead of modifying nodes’ positions or velocities inside a tick event listener.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace. Each typename is a type,
    * optionally followed by a period (.) and a name, such as "tick.foo" and "tick.bar"; the name allows multiple listeners to be registered for the same type.
    * The type must be one of the following: "tick" (after each tick of the simulation’s internal timer) or
    * "end" (after the simulation’s timer stops when alpha < alphaMin).
    * @param listener An event listener function which is invoked with the this context of the simulation.
    */
  @JSName("on")
  def on_tick(typenames: tick, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  /**
    * Return the first currently-assigned listener matching the specified typenames, if any.
    *
    * @param typenames The typenames is a string containing one or more typename separated by whitespace. Each typename is a type,
    * optionally followed by a period (.) and a name, such as "tick.foo" and "tick.bar"; the name allows multiple listeners to be registered for the same type.
    * The type must be one of the following: "tick" (after each tick of the simulation’s internal timer) or
    * "end" (after the simulation’s timer stops when alpha < alphaMin).
    */
  @JSName("on")
  def on_tick_Union(typenames: tick): js.UndefOr[js.ThisFunction0[/* this */ Simulation[NodeDatum, LinkDatum], Unit]] = js.native
  /**
    * Restart the simulation’s internal timer and return the simulation.
    * In conjunction with simulation.alphaTarget or simulation.alpha, this method can be used to “reheat” the simulation during interaction,
    * such as when dragging a node, or to resume the simulation after temporarily pausing it with simulation.stop.
    */
  def restart(): this.type = js.native
  /**
    * Stop the simulation’s internal timer, if it is running, and return the simulation. If the timer is already stopped, this method does nothing.
    * This method is useful for running the simulation manually; see simulation.tick.
    */
  def stop(): this.type = js.native
  /**
    * Manually steps the simulation by the specified number of *iterations*, and returns the simulation. If *iterations* is not specified, it defaults to 1 (single step).
    *
    * For each iteration, it increments the current alpha by (alphaTarget - alpha) × alphaDecay; then invokes each registered force, passing the new alpha;
    * then decrements each node’s velocity by velocity × velocityDecay; lastly increments each node’s position by velocity.
    *
    * This method does not dispatch events; events are only dispatched by the internal timer when the simulation is started automatically upon
    * creation or by calling simulation.restart. The natural number of ticks when the simulation is started is
    * ⌈log(alphaMin) / log(1 - alphaDecay)⌉; by default, this is 300.
    */
  def tick(): Unit = js.native
  def tick(iterations: Double): Unit = js.native
  /**
    * Return the current target alpha value, which defaults to 0.4.
    */
  def velocityDecay(): Double = js.native
  /**
    * Set the velocity decay factor to the specified number in the range [0,1] and return this simulation.
    * The default is 0.4.
    *
    * The decay factor is akin to atmospheric friction; after the application of any forces during a tick,
    * each node’s velocity is multiplied by 1 - decay. As with lowering the alpha decay rate,
    * less velocity decay may converge on a better solution, but risks numerical instabilities and oscillation.
    *
    * @param decay Velocity Decay.
    */
  def velocityDecay(decay: Double): this.type = js.native
}

