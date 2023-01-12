package typings.cytoscapeEdgehandles

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.ElementDefinition
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-edgehandles", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait EdgeHandlesInstance extends StObject {
    
    def destroy(): Unit
    
    /**
      * Disables edgehandles behaviour
      */
    def disable(): Unit
    
    /**
      * Turn off draw mode
      */
    def disableDrawMode(): Unit
    
    /**
      * Enables edgehandles behaviour
      */
    def enable(): Unit
    
    /**
      * Turn on draw mode (the entire node body acts like the handle)
      */
    def enableDrawMode(): Unit
    
    /**
      * Remove the handle node from the graph
      */
    def hide(): Unit
    
    /**
      * Manually start the gesture (as if the handle were already held)
      */
    def start(sourceNode: String): Unit
    
    /**
      * Manually completes or cancels the gesture
      */
    def stop(): Unit
  }
  object EdgeHandlesInstance {
    
    inline def apply(
      destroy: () => Unit,
      disable: () => Unit,
      disableDrawMode: () => Unit,
      enable: () => Unit,
      enableDrawMode: () => Unit,
      hide: () => Unit,
      start: String => Unit,
      stop: () => Unit
    ): EdgeHandlesInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), disableDrawMode = js.Any.fromFunction0(disableDrawMode), enable = js.Any.fromFunction0(enable), enableDrawMode = js.Any.fromFunction0(enableDrawMode), hide = js.Any.fromFunction0(hide), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[EdgeHandlesInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EdgeHandlesInstance] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setDisableDrawMode(value: () => Unit): Self = StObject.set(x, "disableDrawMode", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnableDrawMode(value: () => Unit): Self = StObject.set(x, "enableDrawMode", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setStart(value: String => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait EdgeHandlesOptions extends StObject {
    
    /**
      * Check, if the source and target node can be connected with each other.
      *
      * Default: Disable self loops
      */
    var canConnect: js.UndefOr[js.Function2[/* source */ NodeSingular, /* target */ NodeSingular, Boolean]] = js.undefined
    
    /**
      * During an edge drawing gesture, disable browser gestures such as two-finger trackpad swipe and pinch-to-zoom.
      *
      * Default: true
      */
    var disableBrowserGestures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * for edges between the specified source and target
      * return element object to be passed to cy.add() for edge
      */
    var edgeParams: js.UndefOr[
        js.Function2[/* source */ NodeSingular, /* target */ NodeSingular, ElementDefinition]
      ] = js.undefined
    
    /**
      * Time spent hovering over a target node before it is considered selected.
      *
      * Default: 150
      */
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Set events:no to edges during draws, prevents mouseouts on compounds.
      *
      * Default: true
      */
    var noEdgeEventsInDraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, the edge can be drawn by just moving close to a target node (can be confusing on compound graphs).
      *
      * Default: true
      */
    var snap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of times per second (Hz) that snap checks done (lower is less expensive).
      *
      * Default: 15
      */
    var snapFrequency: js.UndefOr[Double] = js.undefined
    
    /**
      * The target node must be less than or equal to this many pixels away from the cursor/finger.
      *
      * Default: 50
      */
    var snapThreshold: js.UndefOr[Double] = js.undefined
  }
  object EdgeHandlesOptions {
    
    inline def apply(): EdgeHandlesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeHandlesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EdgeHandlesOptions] (val x: Self) extends AnyVal {
      
      inline def setCanConnect(value: (/* source */ NodeSingular, /* target */ NodeSingular) => Boolean): Self = StObject.set(x, "canConnect", js.Any.fromFunction2(value))
      
      inline def setCanConnectUndefined: Self = StObject.set(x, "canConnect", js.undefined)
      
      inline def setDisableBrowserGestures(value: Boolean): Self = StObject.set(x, "disableBrowserGestures", value.asInstanceOf[js.Any])
      
      inline def setDisableBrowserGesturesUndefined: Self = StObject.set(x, "disableBrowserGestures", js.undefined)
      
      inline def setEdgeParams(value: (/* source */ NodeSingular, /* target */ NodeSingular) => ElementDefinition): Self = StObject.set(x, "edgeParams", js.Any.fromFunction2(value))
      
      inline def setEdgeParamsUndefined: Self = StObject.set(x, "edgeParams", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setNoEdgeEventsInDraw(value: Boolean): Self = StObject.set(x, "noEdgeEventsInDraw", value.asInstanceOf[js.Any])
      
      inline def setNoEdgeEventsInDrawUndefined: Self = StObject.set(x, "noEdgeEventsInDraw", js.undefined)
      
      inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapFrequency(value: Double): Self = StObject.set(x, "snapFrequency", value.asInstanceOf[js.Any])
      
      inline def setSnapFrequencyUndefined: Self = StObject.set(x, "snapFrequency", js.undefined)
      
      inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
      
      inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  object global {
    
    object cytoscape {
      
      @js.native
      trait Core extends StObject {
        
        def edgehandles(): EdgeHandlesInstance = js.native
        def edgehandles(options: EdgeHandlesOptions): EdgeHandlesInstance = js.native
      }
    }
  }
}
