package typings.d3Force

import typings.d3Force.d3ForceStrings.end
import typings.d3Force.d3ForceStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-force", "forceCenter")
  @js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](): ForceCenter_[NodeDatum] = js.native
  @JSImport("d3-force", "forceCenter")
  @js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](x: js.UndefOr[scala.Nothing], y: Double): ForceCenter_[NodeDatum] = js.native
  @JSImport("d3-force", "forceCenter")
  @js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](x: Double): ForceCenter_[NodeDatum] = js.native
  @JSImport("d3-force", "forceCenter")
  @js.native
  def forceCenter[NodeDatum /* <: SimulationNodeDatum */](x: Double, y: Double): ForceCenter_[NodeDatum] = js.native
  
  @JSImport("d3-force", "forceCollide")
  @js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](): ForceCollide_[NodeDatum] = js.native
  @JSImport("d3-force", "forceCollide")
  @js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double]
  ): ForceCollide_[NodeDatum] = js.native
  @JSImport("d3-force", "forceCollide")
  @js.native
  def forceCollide[NodeDatum /* <: SimulationNodeDatum */](radius: Double): ForceCollide_[NodeDatum] = js.native
  
  @JSImport("d3-force", "forceLink")
  @js.native
  def forceLink[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](): ForceLink_[NodeDatum, LinksDatum] = js.native
  @JSImport("d3-force", "forceLink")
  @js.native
  def forceLink[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): ForceLink_[NodeDatum, LinksDatum] = js.native
  
  @JSImport("d3-force", "forceManyBody")
  @js.native
  def forceManyBody[NodeDatum /* <: SimulationNodeDatum */](): ForceManyBody_[NodeDatum] = js.native
  
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.UndefOr[scala.Nothing],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.UndefOr[scala.Nothing],
    y: Double
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: Double
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    x: Double,
    y: Double
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: Double): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.UndefOr[scala.Nothing],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: Double, x: js.UndefOr[scala.Nothing], y: Double): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double],
    y: Double
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: Double, x: Double): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](
    radius: Double,
    x: Double,
    y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]
  ): ForceRadial_[NodeDatum] = js.native
  @JSImport("d3-force", "forceRadial")
  @js.native
  def forceRadial[NodeDatum /* <: SimulationNodeDatum */](radius: Double, x: Double, y: Double): ForceRadial_[NodeDatum] = js.native
  
  @JSImport("d3-force", "forceSimulation")
  @js.native
  def forceSimulation[NodeDatum /* <: SimulationNodeDatum */](): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-force", "forceSimulation")
  @js.native
  def forceSimulation[NodeDatum /* <: SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("d3-force", "forceSimulation")
  @js.native
  def forceSimulation_NodeDatum_SimulationNodeDatumLinkDatum_SimulationLinkDatumNodeDatum[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: SimulationLinkDatum[NodeDatum] */](): Simulation[NodeDatum, LinkDatum] = js.native
  @JSImport("d3-force", "forceSimulation")
  @js.native
  def forceSimulation_NodeDatum_SimulationNodeDatumLinkDatum_SimulationLinkDatumNodeDatum[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: SimulationLinkDatum[NodeDatum] */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, LinkDatum] = js.native
  
  @JSImport("d3-force", "forceX")
  @js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](): ForceX_[NodeDatum] = js.native
  @JSImport("d3-force", "forceX")
  @js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceX_[NodeDatum] = js.native
  @JSImport("d3-force", "forceX")
  @js.native
  def forceX[NodeDatum /* <: SimulationNodeDatum */](x: Double): ForceX_[NodeDatum] = js.native
  
  @JSImport("d3-force", "forceY")
  @js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](): ForceY_[NodeDatum] = js.native
  @JSImport("d3-force", "forceY")
  @js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceY_[NodeDatum] = js.native
  @JSImport("d3-force", "forceY")
  @js.native
  def forceY[NodeDatum /* <: SimulationNodeDatum */](y: Double): ForceY_[NodeDatum] = js.native
  
  @js.native
  trait Force[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: js.UndefOr[SimulationLinkDatum[NodeDatum]] */] extends StObject {
    
    /**
      * Apply this force, optionally observing the specified alpha.
      * Typically, the force is applied to the array of nodes previously passed to force.initialize,
      * however, some forces may apply to a subset of nodes, or behave differently.
      * For example, d3.forceLink applies to the source and target of each link.
      */
    def apply(alpha: Double): Unit = js.native
    
    /**
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    var initialize: js.UndefOr[
        js.Function2[/* nodes */ js.Array[NodeDatum], /* random */ js.Function0[Double], Unit]
      ] = js.native
  }
  
  @js.native
  trait ForceCenter_[NodeDatum /* <: SimulationNodeDatum */]
    extends Force[NodeDatum, js.Any] {
    
    /**
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceCenter_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
    /**
      * Returns the force’s current strength, which defaults to 1.
      */
    def strength(): Double = js.native
    /**
      * Sets the centering force’s strength.
      * A reduced strength of e.g. 0.05 softens the movements on interactive graphs in which new nodes enter or exit the graph.
      * @param strength The centering force's strength.
      */
    def strength(strength: Double): this.type = js.native
    
    /**
      * Return the current x-coordinate of the centering position, which defaults to zero.
      */
    def x(): Double = js.native
    /**
      * Set the x-coordinate of the centering position.
      *
      * @param x x-coordinate.
      */
    def x(x: Double): this.type = js.native
    
    /**
      * Return the current y-coordinate of the centering position, which defaults to zero.
      */
    def y(): Double = js.native
    /**
      * Set the y-coordinate of the centering position.
      *
      * @param y y-coordinate.
      */
    def y(y: Double): this.type = js.native
  }
  
  @js.native
  trait ForceCollide_[NodeDatum /* <: SimulationNodeDatum */]
    extends Force[NodeDatum, js.Any] {
    
    /**
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceCollide_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
    /**
      * Return the current iteration count which defaults to 1.
      */
    def iterations(): Double = js.native
    /**
      * Sets the number of iterations per application to the specified number and return this force.
      *
      * Increasing the number of iterations greatly increases the rigidity of the constraint and avoids partial overlap of nodes,
      * but also increases the runtime cost to evaluate the force.
      *
      * @param iterations Number of iterations.
      */
    def iterations(iterations: Double): this.type = js.native
    
    /**
      * Returns the current radius accessor function.
      */
    def radius(): js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double] = js.native
    /**
      * Set the radius accessor function determining the radius for each node in collision detection.
      *
      * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the radius of each node is only recomputed
      * when the force is initialized or when this method is called with a new radius, and not on every application of the force.
      *
      * @param radius A radius accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The function returns a radius.
      */
    def radius(
      radius: js.Function3[/* node */ NodeDatum, /* i */ Double, /* nodes */ js.Array[NodeDatum], Double]
    ): this.type = js.native
    /**
      * Set the radius used in collision detection to a constant number for each node.
      *
      * The constant is internally wrapped into a radius accessor function.
      *
      * The radius accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the radius of each node is only recomputed
      * when the force is initialized or when this method is called with a new radius, and not on every application of the force.
      *
      * @param radius A constant radius for each node.
      */
    def radius(radius: Double): this.type = js.native
    
    /**
      * Return the current strength, which defaults to 1.
      */
    def strength(): Double = js.native
    /**
      * Set the force strength to the specified number in the range [0,1] and return this force.
      * The default strength is 0.7.
      *
      * Overlapping nodes are resolved through iterative relaxation.
      * For each node, the other nodes that are anticipated to overlap at the next tick (using the anticipated positions [x + vx,y + vy]) are determined;
      * the node’s velocity is then modified to push the node out of each overlapping node.
      * The change in velocity is dampened by the force’s strength such that the resolution of simultaneous overlaps can be blended together to find a stable solution.
      *
      * @param strength Strength.
      */
    def strength(strength: Double): this.type = js.native
  }
  
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
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceLink_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
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
  
  @js.native
  trait ForceRadial_[NodeDatum /* <: SimulationNodeDatum */]
    extends Force[NodeDatum, js.Any] {
    
    /**
      * Assigns the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceRadial_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
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
  
  @js.native
  trait ForceX_[NodeDatum /* <: SimulationNodeDatum */]
    extends Force[NodeDatum, js.Any] {
    
    /**
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceX_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
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
      * Return the current x-accessor, which defaults to a function returning 0 for all nodes.
      */
    def x(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
    /**
      * Set the x-coordinate accessor to the specified function, re-evaluates the x-accessor for each node,
      * and returns this force.
      *
      * The x-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the target x-coordinate of each node is only recomputed when the force is initialized or
      * when this method is called with a new x, and not on every application of the force.
      *
      * @param x A x-coordinate accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The function returns the x-coordinate.
      */
    def x(x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
    /**
      * Set the x-coordinate accessor to the specified number, re-evaluates the x-accessor for each node,
      * and returns this force.
      *
      * The constant is internally wrapped into an x-coordinate accessor function.
      *
      * The x-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the target x-coordinate of each node is only recomputed when the force is initialized or
      * when this method is called with a new x, and not on every application of the force.
      *
      * @param x Constant x-coordinate to be used for all nodes.
      */
    def x(x: Double): this.type = js.native
  }
  
  @js.native
  trait ForceY_[NodeDatum /* <: SimulationNodeDatum */]
    extends Force[NodeDatum, js.Any] {
    
    /**
      * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
      * and when the simulation’s nodes change via simulation.nodes.
      *
      * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
      */
    @JSName("initialize")
    def initialize_MForceY_(nodes: js.Array[NodeDatum], random: js.Function0[Double]): Unit = js.native
    
    /**
      *  Returns the current strength accessor, which defaults to a constant strength for all nodes of 0.1.
      */
    def strength(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
    /**
      * Set the strength accessor to the specified function, re-evaluates the strength accessor for each node, and returns this force.
      *
      * The strength determines how much to increment the node’s y-velocity: (y - node.y) × strength.
      *
      * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current y-position to the target y-position with each application.
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
      * The strength determines how much to increment the node’s y-velocity: (y - node.y) × strength.
      *
      * For example, a value of 0.1 indicates that the node should move a tenth of the way from its current y-position to the target y-position with each application.
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
      * Return the current y-accessor, which defaults to a function returning 0 for all nodes.
      */
    def y(): js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double] = js.native
    /**
      * Set the y-coordinate accessor to the specified function, re-evaluates the y-accessor for each node,
      * and returns this force.
      *
      * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the target y-coordinate of each node is only recomputed when the force is initialized or
      * when this method is called with a new y, and not on every application of the force.
      *
      * @param y A y-coordinate accessor function which is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The function returns the y-coordinate.
      */
    def y(y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): this.type = js.native
    /**
      * Set the y-coordinate accessor to the specified number, re-evaluates the y-accessor for each node,
      * and returns this force.
      *
      * The constant is internally wrapped into a y-coordinate accessor function.
      *
      * The y-accessor is invoked for each node in the simulation, being passed the node, its zero-based index and the complete array of nodes.
      * The resulting number is then stored internally, such that the target y-coordinate of each node is only recomputed when the force is initialized or
      * when this method is called with a new y, and not on every application of the force.
      *
      * @param y Constant y-coordinate to be used for all nodes.
      */
    def y(y: Double): this.type = js.native
  }
  
  @js.native
  trait Simulation[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: js.UndefOr[SimulationLinkDatum[NodeDatum]] */] extends StObject {
    
    /**
      * Return the current alpha of the simulation, which defaults to 1.
      *
      * alpha is roughly analogous to temperature in simulated annealing.
      * It decreases over time as the simulation “cools down”.
      * When alpha reaches alphaMin, the simulation stops; see simulation.restart.
      */
    def alpha(): Double = js.native
    /**
      * Set the current alpha to the specified number in the range [0,1] and return this simulation.
      * The default is 1.
      *
      * alpha is roughly analogous to temperature in simulated annealing.
      * It decreases over time as the simulation “cools down”.
      * When alpha reaches alphaMin, the simulation stops; see simulation.restart.
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
      * so chosen to ensure a deterministic, uniform distribution.
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
      * Returns this simulation’s current random source which defaults to a fixed-seed linear congruential generator.
      * See also random.source.
      */
    def randomSource(): js.Function0[Double] = js.native
    /**
      * Sets the function used to generate random numbers; this should be a function that returns a number between 0 (inclusive) and 1 (exclusive).
      *
      * @param source The function used to generate random numbers.
      */
    def randomSource(source: js.Function0[Double]): this.type = js.native
    
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
  
  @js.native
  trait SimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */] extends StObject {
    
    /**
      * The zero-based index into the links array. Internally generated when calling ForceLink.links(...)
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Link’s source node.
      * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
      * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
      * is replaced by an object reference to the corresponding node with the given identifier.
      * After initialization, the source property represents the source node object.
      */
    var source: NodeDatum | String | Double = js.native
    
    /**
      * Link’s source link
      * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
      * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
      * is replaced by an object reference to the corresponding node with the given identifier.
      * After initialization, the target property represents the target node object.
      */
    var target: NodeDatum | String | Double = js.native
  }
  object SimulationLinkDatum {
    
    @scala.inline
    def apply[NodeDatum /* <: SimulationNodeDatum */](source: NodeDatum | String | Double, target: NodeDatum | String | Double): SimulationLinkDatum[NodeDatum] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimulationLinkDatum[NodeDatum]]
    }
    
    @scala.inline
    implicit class SimulationLinkDatumMutableBuilder[Self <: SimulationLinkDatum[_], NodeDatum /* <: SimulationNodeDatum */] (val x: Self with SimulationLinkDatum[NodeDatum]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSource(value: NodeDatum | String | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: NodeDatum | String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimulationNodeDatum extends StObject {
    
    /**
      * Node’s fixed x-position (if position was fixed)
      */
    var fx: js.UndefOr[Double | Null] = js.native
    
    /**
      * Node’s fixed y-position (if position was fixed)
      */
    var fy: js.UndefOr[Double | Null] = js.native
    
    /**
      * Node’s zero-based index into nodes array. This property is set during the initialization process of a simulation.
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Node’s current x-velocity
      */
    var vx: js.UndefOr[Double] = js.native
    
    /**
      * Node’s current y-velocity
      */
    var vy: js.UndefOr[Double] = js.native
    
    /**
      * Node’s current x-position
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * Node’s current y-position
      */
    var y: js.UndefOr[Double] = js.native
  }
  object SimulationNodeDatum {
    
    @scala.inline
    def apply(): SimulationNodeDatum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimulationNodeDatum]
    }
    
    @scala.inline
    implicit class SimulationNodeDatumMutableBuilder[Self <: SimulationNodeDatum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFx(value: Double): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxNull: Self = StObject.set(x, "fx", null)
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyNull: Self = StObject.set(x, "fy", null)
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVxUndefined: Self = StObject.set(x, "vx", js.undefined)
      
      @scala.inline
      def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVyUndefined: Self = StObject.set(x, "vy", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
