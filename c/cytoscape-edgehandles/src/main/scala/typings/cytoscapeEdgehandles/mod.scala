package typings.cytoscapeEdgehandles

import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cytoscape-edgehandles", "ext")
  @js.native
  val ext: Ext = js.native
  
  /* augmented module */
  object cytoscapeAugmentingMod {
    
    @js.native
    trait Core extends StObject {
      
      def edgehandles(): EdgeHandlesApi = js.native
      def edgehandles(options: EdgeHandlesOptions): EdgeHandlesApi = js.native
    }
    
    trait EdgeHandlesApi extends StObject {
      
      // turn off draw mode
      def destroy(): Unit
      
      // remove the handle node from the graph
      def disable(): Unit
      
      // turn on draw mode (the entire node body acts like the handle)
      def disableDrawMode(): Unit
      
      // disables edgehandles behaviour
      def enable(): Unit
      
      // enables edgehandles behaviour
      def enableDrawMode(): Unit
      
      // manually completes or cancels the gesture
      def hide(): Unit
      
      def start(sourceNode: String): Unit
      
      // manually start the gesture (as if the handle were already held)
      def stop(): Unit
    }
    object EdgeHandlesApi {
      
      @scala.inline
      def apply(
        destroy: () => Unit,
        disable: () => Unit,
        disableDrawMode: () => Unit,
        enable: () => Unit,
        enableDrawMode: () => Unit,
        hide: () => Unit,
        start: String => Unit,
        stop: () => Unit
      ): EdgeHandlesApi = {
        val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), disableDrawMode = js.Any.fromFunction0(disableDrawMode), enable = js.Any.fromFunction0(enable), enableDrawMode = js.Any.fromFunction0(enableDrawMode), hide = js.Any.fromFunction0(hide), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[EdgeHandlesApi]
      }
      
      @scala.inline
      implicit class EdgeHandlesApiMutableBuilder[Self <: EdgeHandlesApi] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisableDrawMode(value: () => Unit): Self = StObject.set(x, "disableDrawMode", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnableDrawMode(value: () => Unit): Self = StObject.set(x, "enableDrawMode", js.Any.fromFunction0(value))
        
        @scala.inline
        def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStart(value: String => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    trait EdgeHandlesOptions extends StObject {
      
      // fired when edgehandles interaction is stopped (either complete with added edges or incomplete)
      var cancel: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* cancelledTargets */ js.Any, Unit]] = js.undefined
      
      // fired when edgehandles interaction starts (drag on handle)
      var complete: js.UndefOr[
            js.Function3[
              /* sourceNode */ NodeSingular, 
              /* targetNode */ NodeSingular, 
              /* addedEles */ EdgeCollection, 
              Unit
            ]
          ] = js.undefined
      
      // set events:no to edges during draws, prevents mouseouts on compounds
      var disableBrowserGestures: js.UndefOr[Boolean] = js.undefined
      
      // fired when draw mode enabled
      var drawoff: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      // fired when preview is hidden
      var drawon: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var edgeParams: js.UndefOr[
            js.Function3[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double, js.Any]
          ] = js.undefined
      
      // whether to show the handle in draw mode
      // can return 'flat' for flat edges between nodes or 'node' for intermediate node between them, returning null/undefined means an edge can't be added between the two nodes
      var edgeType: js.UndefOr[
            js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, js.UndefOr[String]]
          ] = js.undefined
      
      var ghostEdgeParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      // sets the position of the handle in the format of "X-AXIS Y-AXIS" such as "left top", "middle top"
      var handleInDrawMode: js.UndefOr[Boolean] = js.undefined
      
      // time spent hovering over a target node before it is considered selected
      var handleNodes: js.UndefOr[String] = js.undefined
      
      // during an edge drawing gesture, disable browser gestures such as two-finger trackpad swipe and pinch-to-zoom
      var handlePosition: js.UndefOr[js.Function1[/* node */ NodeSingular, String]] = js.undefined
      
      // fired when handle is shown
      var hide: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.undefined
      
      // whether to show added edges preview before releasing selection
      var hoverDelay: js.UndefOr[Double] = js.undefined
      
      // fired when a target is hovered
      var hoverout: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, Unit]] = js.undefined
      
      // fired when edgehandles are cancelled (incomplete gesture)
      var hoverover: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, Unit]] = js.undefined
      
      var loopAllowed: js.UndefOr[js.Function1[/* node */ NodeSingular, Boolean]] = js.undefined
      
      // the number of times per second (Hz) that snap checks done (lower is less expensive)
      var noEdgeEventsInDraw: js.UndefOr[Boolean] = js.undefined
      
      // for the specified node, return whether edges from itself to itself are allowed
      var nodeLoopOffset: js.UndefOr[Double] = js.undefined
      
      // offset for edgeType: 'node' loops
      // for edges between the specified source and target, return element object to be passed to cy.add() for intermediary node
      var nodeParams: js.UndefOr[
            js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, js.Any]
          ] = js.undefined
      
      var preview: js.UndefOr[Boolean] = js.undefined
      
      // fired when preview is shown
      var previewoff: js.UndefOr[
            js.Function3[
              /* sourceNode */ NodeSingular, 
              /* targetNode */ NodeSingular, 
              /* previewEles */ EdgeCollection, 
              Unit
            ]
          ] = js.undefined
      
      // fired when a target isn't hovered anymore
      var previewon: js.UndefOr[
            js.Function3[
              /* sourceNode */ NodeSingular, 
              /* targetNode */ NodeSingular, 
              /* previewEles */ EdgeCollection, 
              Unit
            ]
          ] = js.undefined
      
      // return element object to be passed to cy.add() for the ghost edge
      var show: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.undefined
      
      // selector/filter function for whether edges can be made from a given node
      var snap: js.UndefOr[Boolean] = js.undefined
      
      // the target node must be less than or equal to this many pixels away from the cursor/finger
      var snapFrequency: js.UndefOr[Double] = js.undefined
      
      // when enabled, the edge can be drawn by just moving close to a target node
      var snapThreshold: js.UndefOr[Double] = js.undefined
      
      // fired when the handle is hidden
      var start: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.undefined
      
      // fired when edgehandles is done and elements are added
      var stop: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.undefined
    }
    object EdgeHandlesOptions {
      
      @scala.inline
      def apply(): EdgeHandlesOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EdgeHandlesOptions]
      }
      
      @scala.inline
      implicit class EdgeHandlesOptionsMutableBuilder[Self <: EdgeHandlesOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCancel(value: (/* sourceNode */ NodeSingular, /* cancelledTargets */ js.Any) => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
        
        @scala.inline
        def setComplete(
          value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* addedEles */ EdgeCollection) => Unit
        ): Self = StObject.set(x, "complete", js.Any.fromFunction3(value))
        
        @scala.inline
        def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
        
        @scala.inline
        def setDisableBrowserGestures(value: Boolean): Self = StObject.set(x, "disableBrowserGestures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableBrowserGesturesUndefined: Self = StObject.set(x, "disableBrowserGestures", js.undefined)
        
        @scala.inline
        def setDrawoff(value: () => Unit): Self = StObject.set(x, "drawoff", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDrawoffUndefined: Self = StObject.set(x, "drawoff", js.undefined)
        
        @scala.inline
        def setDrawon(value: () => Unit): Self = StObject.set(x, "drawon", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDrawonUndefined: Self = StObject.set(x, "drawon", js.undefined)
        
        @scala.inline
        def setEdgeParams(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double) => js.Any): Self = StObject.set(x, "edgeParams", js.Any.fromFunction3(value))
        
        @scala.inline
        def setEdgeParamsUndefined: Self = StObject.set(x, "edgeParams", js.undefined)
        
        @scala.inline
        def setEdgeType(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => js.UndefOr[String]): Self = StObject.set(x, "edgeType", js.Any.fromFunction2(value))
        
        @scala.inline
        def setEdgeTypeUndefined: Self = StObject.set(x, "edgeType", js.undefined)
        
        @scala.inline
        def setGhostEdgeParams(value: () => js.Any): Self = StObject.set(x, "ghostEdgeParams", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGhostEdgeParamsUndefined: Self = StObject.set(x, "ghostEdgeParams", js.undefined)
        
        @scala.inline
        def setHandleInDrawMode(value: Boolean): Self = StObject.set(x, "handleInDrawMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleInDrawModeUndefined: Self = StObject.set(x, "handleInDrawMode", js.undefined)
        
        @scala.inline
        def setHandleNodes(value: String): Self = StObject.set(x, "handleNodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleNodesUndefined: Self = StObject.set(x, "handleNodes", js.undefined)
        
        @scala.inline
        def setHandlePosition(value: /* node */ NodeSingular => String): Self = StObject.set(x, "handlePosition", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHandlePositionUndefined: Self = StObject.set(x, "handlePosition", js.undefined)
        
        @scala.inline
        def setHide(value: /* sourceNode */ NodeSingular => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
        
        @scala.inline
        def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
        
        @scala.inline
        def setHoverout(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit): Self = StObject.set(x, "hoverout", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHoveroutUndefined: Self = StObject.set(x, "hoverout", js.undefined)
        
        @scala.inline
        def setHoverover(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit): Self = StObject.set(x, "hoverover", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHoveroverUndefined: Self = StObject.set(x, "hoverover", js.undefined)
        
        @scala.inline
        def setLoopAllowed(value: /* node */ NodeSingular => Boolean): Self = StObject.set(x, "loopAllowed", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLoopAllowedUndefined: Self = StObject.set(x, "loopAllowed", js.undefined)
        
        @scala.inline
        def setNoEdgeEventsInDraw(value: Boolean): Self = StObject.set(x, "noEdgeEventsInDraw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoEdgeEventsInDrawUndefined: Self = StObject.set(x, "noEdgeEventsInDraw", js.undefined)
        
        @scala.inline
        def setNodeLoopOffset(value: Double): Self = StObject.set(x, "nodeLoopOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeLoopOffsetUndefined: Self = StObject.set(x, "nodeLoopOffset", js.undefined)
        
        @scala.inline
        def setNodeParams(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => js.Any): Self = StObject.set(x, "nodeParams", js.Any.fromFunction2(value))
        
        @scala.inline
        def setNodeParamsUndefined: Self = StObject.set(x, "nodeParams", js.undefined)
        
        @scala.inline
        def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
        
        @scala.inline
        def setPreviewoff(
          value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit
        ): Self = StObject.set(x, "previewoff", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPreviewoffUndefined: Self = StObject.set(x, "previewoff", js.undefined)
        
        @scala.inline
        def setPreviewon(
          value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit
        ): Self = StObject.set(x, "previewon", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPreviewonUndefined: Self = StObject.set(x, "previewon", js.undefined)
        
        @scala.inline
        def setShow(value: /* sourceNode */ NodeSingular => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
        
        @scala.inline
        def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
        
        @scala.inline
        def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapFrequency(value: Double): Self = StObject.set(x, "snapFrequency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapFrequencyUndefined: Self = StObject.set(x, "snapFrequency", js.undefined)
        
        @scala.inline
        def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
        
        @scala.inline
        def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
        
        @scala.inline
        def setStart(value: /* sourceNode */ NodeSingular => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStop(value: /* sourceNode */ NodeSingular => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      }
    }
  }
}
