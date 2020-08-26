package typings.cytoscapeEdgehandles.mod.cytoscapeAugmentingMod

import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeHandlesOptions extends js.Object {
   // fired when edgehandles interaction is stopped (either complete with added edges or incomplete)
  var cancel: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* cancelledTargets */ js.Any, Unit]] = js.native
   // fired when edgehandles interaction starts (drag on handle)
  var complete: js.UndefOr[
    js.Function3[
      /* sourceNode */ NodeSingular, 
      /* targetNode */ NodeSingular, 
      /* addedEles */ EdgeCollection, 
      Unit
    ]
  ] = js.native
   // set events:no to edges during draws, prevents mouseouts on compounds
  var disableBrowserGestures: js.UndefOr[Boolean] = js.native
   // fired when draw mode enabled
  var drawoff: js.UndefOr[js.Function0[Unit]] = js.native
   // fired when preview is hidden
  var drawon: js.UndefOr[js.Function0[Unit]] = js.native
  var edgeParams: js.UndefOr[
    js.Function3[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double, _]
  ] = js.native
   // whether to show the handle in draw mode
  // can return 'flat' for flat edges between nodes or 'node' for intermediate node between them, returning null/undefined means an edge can't be added between the two nodes
  var edgeType: js.UndefOr[
    js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, js.UndefOr[String]]
  ] = js.native
  var ghostEdgeParams: js.UndefOr[js.Function0[_]] = js.native
   // sets the position of the handle in the format of "X-AXIS Y-AXIS" such as "left top", "middle top"
  var handleInDrawMode: js.UndefOr[Boolean] = js.native
   // time spent hovering over a target node before it is considered selected
  var handleNodes: js.UndefOr[String] = js.native
   // during an edge drawing gesture, disable browser gestures such as two-finger trackpad swipe and pinch-to-zoom
  var handlePosition: js.UndefOr[js.Function1[/* node */ NodeSingular, String]] = js.native
   // fired when handle is shown
  var hide: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.native
   // whether to show added edges preview before releasing selection
  var hoverDelay: js.UndefOr[Double] = js.native
   // fired when a target is hovered
  var hoverout: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, Unit]] = js.native
   // fired when edgehandles are cancelled (incomplete gesture)
  var hoverover: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, Unit]] = js.native
  var loopAllowed: js.UndefOr[js.Function1[/* node */ NodeSingular, Boolean]] = js.native
   // the number of times per second (Hz) that snap checks done (lower is less expensive)
  var noEdgeEventsInDraw: js.UndefOr[Boolean] = js.native
   // for the specified node, return whether edges from itself to itself are allowed
  var nodeLoopOffset: js.UndefOr[Double] = js.native
   // offset for edgeType: 'node' loops
  // for edges between the specified source and target, return element object to be passed to cy.add() for intermediary node
  var nodeParams: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, _]] = js.native
  var preview: js.UndefOr[Boolean] = js.native
   // fired when preview is shown
  var previewoff: js.UndefOr[
    js.Function3[
      /* sourceNode */ NodeSingular, 
      /* targetNode */ NodeSingular, 
      /* previewEles */ EdgeCollection, 
      Unit
    ]
  ] = js.native
   // fired when a target isn't hovered anymore
  var previewon: js.UndefOr[
    js.Function3[
      /* sourceNode */ NodeSingular, 
      /* targetNode */ NodeSingular, 
      /* previewEles */ EdgeCollection, 
      Unit
    ]
  ] = js.native
   // return element object to be passed to cy.add() for the ghost edge
  var show: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.native
   // selector/filter function for whether edges can be made from a given node
  var snap: js.UndefOr[Boolean] = js.native
   // the target node must be less than or equal to this many pixels away from the cursor/finger
  var snapFrequency: js.UndefOr[Double] = js.native
   // when enabled, the edge can be drawn by just moving close to a target node
  var snapThreshold: js.UndefOr[Double] = js.native
   // fired when the handle is hidden
  var start: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.native
   // fired when edgehandles is done and elements are added
  var stop: js.UndefOr[js.Function1[/* sourceNode */ NodeSingular, Unit]] = js.native
}

object EdgeHandlesOptions {
  @scala.inline
  def apply(): EdgeHandlesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeHandlesOptions]
  }
  @scala.inline
  implicit class EdgeHandlesOptionsOps[Self <: EdgeHandlesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: (/* sourceNode */ NodeSingular, /* cancelledTargets */ js.Any) => Unit): Self = this.set("cancel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setComplete(
      value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* addedEles */ EdgeCollection) => Unit
    ): Self = this.set("complete", js.Any.fromFunction3(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDisableBrowserGestures(value: Boolean): Self = this.set("disableBrowserGestures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBrowserGestures: Self = this.set("disableBrowserGestures", js.undefined)
    @scala.inline
    def setDrawoff(value: () => Unit): Self = this.set("drawoff", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDrawoff: Self = this.set("drawoff", js.undefined)
    @scala.inline
    def setDrawon(value: () => Unit): Self = this.set("drawon", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDrawon: Self = this.set("drawon", js.undefined)
    @scala.inline
    def setEdgeParams(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double) => _): Self = this.set("edgeParams", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEdgeParams: Self = this.set("edgeParams", js.undefined)
    @scala.inline
    def setEdgeType(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => js.UndefOr[String]): Self = this.set("edgeType", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEdgeType: Self = this.set("edgeType", js.undefined)
    @scala.inline
    def setGhostEdgeParams(value: () => _): Self = this.set("ghostEdgeParams", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGhostEdgeParams: Self = this.set("ghostEdgeParams", js.undefined)
    @scala.inline
    def setHandleInDrawMode(value: Boolean): Self = this.set("handleInDrawMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleInDrawMode: Self = this.set("handleInDrawMode", js.undefined)
    @scala.inline
    def setHandleNodes(value: String): Self = this.set("handleNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleNodes: Self = this.set("handleNodes", js.undefined)
    @scala.inline
    def setHandlePosition(value: /* node */ NodeSingular => String): Self = this.set("handlePosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandlePosition: Self = this.set("handlePosition", js.undefined)
    @scala.inline
    def setHide(value: /* sourceNode */ NodeSingular => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverDelay: Self = this.set("hoverDelay", js.undefined)
    @scala.inline
    def setHoverout(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit): Self = this.set("hoverout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHoverout: Self = this.set("hoverout", js.undefined)
    @scala.inline
    def setHoverover(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit): Self = this.set("hoverover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHoverover: Self = this.set("hoverover", js.undefined)
    @scala.inline
    def setLoopAllowed(value: /* node */ NodeSingular => Boolean): Self = this.set("loopAllowed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoopAllowed: Self = this.set("loopAllowed", js.undefined)
    @scala.inline
    def setNoEdgeEventsInDraw(value: Boolean): Self = this.set("noEdgeEventsInDraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEdgeEventsInDraw: Self = this.set("noEdgeEventsInDraw", js.undefined)
    @scala.inline
    def setNodeLoopOffset(value: Double): Self = this.set("nodeLoopOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeLoopOffset: Self = this.set("nodeLoopOffset", js.undefined)
    @scala.inline
    def setNodeParams(value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => _): Self = this.set("nodeParams", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNodeParams: Self = this.set("nodeParams", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setPreviewoff(
      value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit
    ): Self = this.set("previewoff", js.Any.fromFunction3(value))
    @scala.inline
    def deletePreviewoff: Self = this.set("previewoff", js.undefined)
    @scala.inline
    def setPreviewon(
      value: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit
    ): Self = this.set("previewon", js.Any.fromFunction3(value))
    @scala.inline
    def deletePreviewon: Self = this.set("previewon", js.undefined)
    @scala.inline
    def setShow(value: /* sourceNode */ NodeSingular => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapFrequency(value: Double): Self = this.set("snapFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapFrequency: Self = this.set("snapFrequency", js.undefined)
    @scala.inline
    def setSnapThreshold(value: Double): Self = this.set("snapThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapThreshold: Self = this.set("snapThreshold", js.undefined)
    @scala.inline
    def setStart(value: /* sourceNode */ NodeSingular => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: /* sourceNode */ NodeSingular => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

