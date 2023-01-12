package typings.cytoscapeEuler

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.BaseLayoutOptions
import typings.cytoscape.mod.BoundingBox12
import typings.cytoscape.mod.BoundingBoxWH
import typings.cytoscape.mod.Css.TransitionTimingFunction
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.NodeSingular
import typings.cytoscapeEuler.cytoscapeEulerStrings.end
import typings.cytoscapeEuler.cytoscapeEulerStrings.euler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-euler", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  /**
    * The layout options for the Cytoscape Euler layout.
    * @see {@link https://github.com/cytoscape/cytoscape.js-euler}
    */
  trait EulerLayoutOptions
    extends StObject
       with BaseLayoutOptions {
    
    /**
      * Whether to animate the layout
      * - true : Animate while the layout is running
      * - false : Just show the end result
      * - 'end' : Animate directly to the end result
      * @default true
      */
    var animate: js.UndefOr[Boolean | end] = js.undefined
    
    /**
      * Animation duration used for animate:'end'
      * @default undefined
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Easing for animate:'end'
      * @default undefined
      */
    var animationEasing: js.UndefOr[TransitionTimingFunction] = js.undefined
    
    /**
      * Constrain layout bounds with one of
      * - { x1, y1, x2, y2 }
      * - { x1, y1, w, h }
      * - undefined / null : Unconstrained
      * @default undefined
      */
    var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH | Null] = js.undefined
    
    /**
      * Friction / drag coefficient to make the system stabilise over time
      * @default 0.02
      */
    var dragCoeff: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to fit the viewport to the repositioned graph
      * true : Fits at end of layout for animate:false or animate:'end'; fits on each frame for animate:true
      * @default true
      */
    var fit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Coulomb's law coefficient
      * - Makes the nodes repel each other for negative values
      * - Makes the nodes attract each other for positive values
      * @default -1.2
      */
    var gravity: js.UndefOr[Double] = js.undefined
    
    /**
      * The mass of the node in the physics simulation
      * - The mass affects the gravity node repulsion/attraction
      * @default 4
      */
    var mass: js.UndefOr[js.Function1[/* _node */ NodeSingular, Double]] = js.undefined
    
    /**
      * Maximum iterations before the layout will bail out
      * - A large value may allow for a better result
      * - A small value may make the layout end prematurely
      * - The layout may stop before this if it has settled
      * @default 1000
      */
    var maxIterations: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum time (in ms) before the layout will bail out
      * - A large value may allow for a better result
      * - A small value may make the layout end prematurely
      * - The layout may stop before this if it has settled
      * @default 4000
      */
    var maxSimulationTime: js.UndefOr[Double] = js.undefined
    
    /**
      * When the total of the squared position deltas is less than this value, the simulation ends
      * @default 1
      */
    var movementThreshold: js.UndefOr[Double] = js.undefined
    
    @JSName("name")
    var name_EulerLayoutOptions: euler
    
    /**
      * Padding in rendered co-ordinates around the layout
      * @default 30
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * A force that pulls nodes towards the origin (0, 0)
      * Higher values keep the components less spread out
      * @default 0.001
      */
    var pull: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to randomize the initial positions of the nodes
      * true : Use random positions within the bounding box
      * false : Use the current node positions as the initial positions
      * @default false
      */
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of ticks per frame for animate:true
      * - A larger value reduces rendering cost but can be jerky
      * - A smaller value increases rendering cost but is smoother
      * @default 10
      */
    var refresh: js.UndefOr[Double] = js.undefined
    
    /**
      * Hooke's law coefficient
      * - The value ranges on [0, 1]
      * - Lower values give looser springs
      * - Higher values give tighter springs
      * @default 0.0008
      */
    var springCoeff: js.UndefOr[js.Function1[/* _edge */ EdgeSingular, Double]] = js.undefined
    
    /**
      * The ideal length of a spring
      * - This acts as a hint for the edge length
      * - The edge length can be longer or shorter if the forces are set to extreme values
      *
      * @default 80
      */
    var springLength: js.UndefOr[js.Function1[/* _edge */ EdgeSingular, Double]] = js.undefined
    
    /**
      * Theta coefficient from Barnes-Hut simulation
      * - Value ranges on [0, 1]
      * - Performance is better with smaller values
      * - Very small values may not create enough force to give a good result
      * @default 0.666
      */
    var theta: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time passed per tick
      * - Larger values result in faster runtimes but might spread things out too far
      * - Smaller values produce more accurate results
      * @default 20
      */
    var timeStep: js.UndefOr[Double] = js.undefined
    
    /**
      * Prevent the user grabbing nodes during the layout (usually with animate:true)
      * @default false
      */
    var ungrabifyWhileSimulating: js.UndefOr[Boolean] = js.undefined
  }
  object EulerLayoutOptions {
    
    inline def apply(): EulerLayoutOptions = {
      val __obj = js.Dynamic.literal(name = "euler")
      __obj.asInstanceOf[EulerLayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EulerLayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean | end): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: TransitionTimingFunction): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setBoundingBoxNull: Self = StObject.set(x, "boundingBox", null)
      
      inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
      
      inline def setDragCoeff(value: Double): Self = StObject.set(x, "dragCoeff", value.asInstanceOf[js.Any])
      
      inline def setDragCoeffUndefined: Self = StObject.set(x, "dragCoeff", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setMass(value: /* _node */ NodeSingular => Double): Self = StObject.set(x, "mass", js.Any.fromFunction1(value))
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      
      inline def setMaxSimulationTime(value: Double): Self = StObject.set(x, "maxSimulationTime", value.asInstanceOf[js.Any])
      
      inline def setMaxSimulationTimeUndefined: Self = StObject.set(x, "maxSimulationTime", js.undefined)
      
      inline def setMovementThreshold(value: Double): Self = StObject.set(x, "movementThreshold", value.asInstanceOf[js.Any])
      
      inline def setMovementThresholdUndefined: Self = StObject.set(x, "movementThreshold", js.undefined)
      
      inline def setName(value: euler): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPull(value: Double): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setSpringCoeff(value: /* _edge */ EdgeSingular => Double): Self = StObject.set(x, "springCoeff", js.Any.fromFunction1(value))
      
      inline def setSpringCoeffUndefined: Self = StObject.set(x, "springCoeff", js.undefined)
      
      inline def setSpringLength(value: /* _edge */ EdgeSingular => Double): Self = StObject.set(x, "springLength", js.Any.fromFunction1(value))
      
      inline def setSpringLengthUndefined: Self = StObject.set(x, "springLength", js.undefined)
      
      inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
      
      inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
      
      inline def setUngrabifyWhileSimulating(value: Boolean): Self = StObject.set(x, "ungrabifyWhileSimulating", value.asInstanceOf[js.Any])
      
      inline def setUngrabifyWhileSimulatingUndefined: Self = StObject.set(x, "ungrabifyWhileSimulating", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
}
