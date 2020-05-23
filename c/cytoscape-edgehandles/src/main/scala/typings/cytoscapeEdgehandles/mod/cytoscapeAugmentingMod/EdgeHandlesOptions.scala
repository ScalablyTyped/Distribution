package typings.cytoscapeEdgehandles.mod.cytoscapeAugmentingMod

import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeHandlesOptions extends js.Object {
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
    js.Function3[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double, _]
  ] = js.undefined
   // whether to show the handle in draw mode
  // can return 'flat' for flat edges between nodes or 'node' for intermediate node between them, returning null/undefined means an edge can't be added between the two nodes
  var edgeType: js.UndefOr[
    js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, js.UndefOr[String]]
  ] = js.undefined
  var ghostEdgeParams: js.UndefOr[js.Function0[_]] = js.undefined
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
  var nodeParams: js.UndefOr[js.Function2[/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, _]] = js.undefined
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
  def apply(
    cancel: (/* sourceNode */ NodeSingular, /* cancelledTargets */ js.Any) => Unit = null,
    complete: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* addedEles */ EdgeCollection) => Unit = null,
    disableBrowserGestures: js.UndefOr[Boolean] = js.undefined,
    drawoff: () => Unit = null,
    drawon: () => Unit = null,
    edgeParams: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* i */ Double) => _ = null,
    edgeType: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => js.UndefOr[String] = null,
    ghostEdgeParams: () => _ = null,
    handleInDrawMode: js.UndefOr[Boolean] = js.undefined,
    handleNodes: String = null,
    handlePosition: /* node */ NodeSingular => String = null,
    hide: /* sourceNode */ NodeSingular => Unit = null,
    hoverDelay: js.UndefOr[Double] = js.undefined,
    hoverout: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit = null,
    hoverover: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => Unit = null,
    loopAllowed: /* node */ NodeSingular => Boolean = null,
    noEdgeEventsInDraw: js.UndefOr[Boolean] = js.undefined,
    nodeLoopOffset: js.UndefOr[Double] = js.undefined,
    nodeParams: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular) => _ = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    previewoff: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit = null,
    previewon: (/* sourceNode */ NodeSingular, /* targetNode */ NodeSingular, /* previewEles */ EdgeCollection) => Unit = null,
    show: /* sourceNode */ NodeSingular => Unit = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    snapFrequency: js.UndefOr[Double] = js.undefined,
    snapThreshold: js.UndefOr[Double] = js.undefined,
    start: /* sourceNode */ NodeSingular => Unit = null,
    stop: /* sourceNode */ NodeSingular => Unit = null
  ): EdgeHandlesOptions = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction2(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction3(complete))
    if (!js.isUndefined(disableBrowserGestures)) __obj.updateDynamic("disableBrowserGestures")(disableBrowserGestures.get.asInstanceOf[js.Any])
    if (drawoff != null) __obj.updateDynamic("drawoff")(js.Any.fromFunction0(drawoff))
    if (drawon != null) __obj.updateDynamic("drawon")(js.Any.fromFunction0(drawon))
    if (edgeParams != null) __obj.updateDynamic("edgeParams")(js.Any.fromFunction3(edgeParams))
    if (edgeType != null) __obj.updateDynamic("edgeType")(js.Any.fromFunction2(edgeType))
    if (ghostEdgeParams != null) __obj.updateDynamic("ghostEdgeParams")(js.Any.fromFunction0(ghostEdgeParams))
    if (!js.isUndefined(handleInDrawMode)) __obj.updateDynamic("handleInDrawMode")(handleInDrawMode.get.asInstanceOf[js.Any])
    if (handleNodes != null) __obj.updateDynamic("handleNodes")(handleNodes.asInstanceOf[js.Any])
    if (handlePosition != null) __obj.updateDynamic("handlePosition")(js.Any.fromFunction1(handlePosition))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (!js.isUndefined(hoverDelay)) __obj.updateDynamic("hoverDelay")(hoverDelay.get.asInstanceOf[js.Any])
    if (hoverout != null) __obj.updateDynamic("hoverout")(js.Any.fromFunction2(hoverout))
    if (hoverover != null) __obj.updateDynamic("hoverover")(js.Any.fromFunction2(hoverover))
    if (loopAllowed != null) __obj.updateDynamic("loopAllowed")(js.Any.fromFunction1(loopAllowed))
    if (!js.isUndefined(noEdgeEventsInDraw)) __obj.updateDynamic("noEdgeEventsInDraw")(noEdgeEventsInDraw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeLoopOffset)) __obj.updateDynamic("nodeLoopOffset")(nodeLoopOffset.get.asInstanceOf[js.Any])
    if (nodeParams != null) __obj.updateDynamic("nodeParams")(js.Any.fromFunction2(nodeParams))
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (previewoff != null) __obj.updateDynamic("previewoff")(js.Any.fromFunction3(previewoff))
    if (previewon != null) __obj.updateDynamic("previewon")(js.Any.fromFunction3(previewon))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapFrequency)) __obj.updateDynamic("snapFrequency")(snapFrequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapThreshold)) __obj.updateDynamic("snapThreshold")(snapThreshold.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[EdgeHandlesOptions]
  }
}

