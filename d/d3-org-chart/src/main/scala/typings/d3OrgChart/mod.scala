package typings.d3OrgChart

import org.scalablytyped.runtime.StringDictionary
import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3OrgChart.anon.CenterX
import typings.d3OrgChart.anon.CenterY
import typings.d3OrgChart.anon.ChildrenMargin
import typings.d3OrgChart.anon.Ctx
import typings.d3OrgChart.anon.ExpandNodesFirst
import typings.d3OrgChart.anon.Full
import typings.d3OrgChart.anon.IsSvg
import typings.d3OrgChart.anon.Node
import typings.d3OrgChart.anon.Nodes
import typings.d3OrgChart.anon.Params
import typings.d3OrgChart.anon.Reverse
import typings.d3OrgChart.anon.widthnumberheightnumberPo
import typings.d3OrgChart.anon.x0numbery0numberwidthnumb
import typings.d3Selection.mod.ArrayLike
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.ValueFn
import typings.d3Shape.mod.DefaultLinkObject
import typings.d3Shape.mod.Link_
import typings.d3Zoom.mod.ZoomBehavior
import typings.d3Zoom.mod.ZoomTransform_
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.Record
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-org-chart", "OrgChart")
  @js.native
  open class OrgChart[Datum] ()
    extends StObject
       with StateGetSet[Datum, OrgChart[Datum]] {
    
    def addNode(node: Datum): this.type = js.native
    
    /* CompleteClass */
    override def backgroundColor(): String = js.native
    /* CompleteClass */
    override def backgroundColor(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("backgroundColor")
    var backgroundColor_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def buttonContent(): js.Function1[/* params */ typings.d3OrgChart.anon.State[Datum], String] = js.native
    /* CompleteClass */
    override def buttonContent(value: js.Function1[/* params */ typings.d3OrgChart.anon.State[Datum], String]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("buttonContent")
    var buttonContent_Original: js.Function0[js.Function1[/* params */ typings.d3OrgChart.anon.State[Datum], String]] = js.native
    
    def calculateCompactFlexDimensions(root: HierarchyNode[Datum]): Unit = js.native
    
    def calculateCompactFlexPositions(root: HierarchyNode[Datum]): Unit = js.native
    
    /* CompleteClass */
    override def childrenMargin(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def childrenMargin(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("childrenMargin")
    var childrenMargin_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    def clearHighlighting(): Unit = js.native
    
    def collapse(node: HierarchyNode[Datum]): Unit = js.native
    
    def collapseAll(): this.type = js.native
    
    /* CompleteClass */
    override def compact(): Boolean = js.native
    /* CompleteClass */
    override def compact(value: Boolean): OrgChart[Datum] = js.native
    
    /* CompleteClass */
    override def compactMarginBetween(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def compactMarginBetween(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("compactMarginBetween")
    var compactMarginBetween_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    /* CompleteClass */
    override def compactMarginPair(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def compactMarginPair(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("compactMarginPair")
    var compactMarginPair_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    /* CompleteClass */
    @JSName("compact")
    var compact_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def connections(): js.Array[Connection] = js.native
    /* CompleteClass */
    override def connections(value: js.Array[Connection]): OrgChart[Datum] = js.native
    
    /* CompleteClass */
    override def connectionsUpdate(): ValueFn[BaseType, Datum, Unit] = js.native
    /* CompleteClass */
    override def connectionsUpdate(value: ValueFn[BaseType, Datum, Unit]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("connectionsUpdate")
    var connectionsUpdate_Original: js.Function0[ValueFn[BaseType, Datum, Unit]] = js.native
    
    /* CompleteClass */
    @JSName("connections")
    var connections_Original: js.Function0[js.Array[Connection]] = js.native
    
    /* CompleteClass */
    override def container(): String = js.native
    /* CompleteClass */
    override def container(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("container")
    var container_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def ctx(): CanvasRenderingContext2D = js.native
    /* CompleteClass */
    override def ctx(value: CanvasRenderingContext2D): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("ctx")
    var ctx_Original: js.Function0[CanvasRenderingContext2D] = js.native
    
    /* CompleteClass */
    override def defaultFont(): String = js.native
    /* CompleteClass */
    override def defaultFont(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("defaultFont")
    var defaultFont_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def defaultTextFill(): String = js.native
    /* CompleteClass */
    override def defaultTextFill(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("defaultTextFill")
    var defaultTextFill_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def defs(): js.Function2[/* state */ State[Datum], /* visibleConnections */ js.Array[Connection], String] = js.native
    /* CompleteClass */
    override def defs(
      value: js.Function2[/* state */ State[Datum], /* visibleConnections */ js.Array[Connection], String]
    ): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("defs")
    var defs_Original: js.Function0[
        js.Function2[/* state */ State[Datum], /* visibleConnections */ js.Array[Connection], String]
      ] = js.native
    
    def diagonal(source: Point, target: Point, m: Point): String = js.native
    
    def downloadImage(): Unit = js.native
    def downloadImage(params: IsSvg): Unit = js.native
    
    /* CompleteClass */
    override def duration(): Double = js.native
    /* CompleteClass */
    override def duration(value: Double): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("duration")
    var duration_Original: js.Function0[Double] = js.native
    
    def expand(node: HierarchyNode[Datum]): Unit = js.native
    
    def expandAll(): this.type = js.native
    
    /* CompleteClass */
    override def expandLevel(): Double = js.native
    /* CompleteClass */
    override def expandLevel(value: Double): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("expandLevel")
    var expandLevel_Original: js.Function0[Double] = js.native
    
    def expandSomeNodes(node: HierarchyNode[Datum]): Unit = js.native
    
    def exportImg(): Unit = js.native
    def exportImg(params: Full): Unit = js.native
    
    def exportSvg(): this.type = js.native
    
    /* CompleteClass */
    override def firstDraw(): Boolean = js.native
    /* CompleteClass */
    override def firstDraw(value: Boolean): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("firstDraw")
    var firstDraw_Original: js.Function0[Boolean] = js.native
    
    def fit(): this.type = js.native
    def fit(params: Nodes[Datum]): this.type = js.native
    
    def fullscreen(): Unit = js.native
    def fullscreen(element: Element): Unit = js.native
    
    def getChartState(): State[Datum] = js.native
    
    def getNodeChildren(args: HierarchyNode[Datum], nodeStore: js.Array[Datum]): js.Array[Datum] = js.native
    
    def getTextWidth(text: String, params: Ctx): Double = js.native
    
    def hdiagonal(source: Point, target: Point, m: Point): String = js.native
    
    /* CompleteClass */
    override def id(): String = js.native
    /* CompleteClass */
    override def id(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("id")
    var id_Original: js.Function0[String] = js.native
    
    def initialZoom(zoomLevel: Double): this.type = js.native
    
    def initializeEnterExitUpdatePattern(): Unit = js.native
    
    /** Whether the current browser is Microsoft Edge */
    def isEdge(): Boolean = js.native
    
    /* CompleteClass */
    override def lastTransform(): ZoomTransform_ = js.native
    /* CompleteClass */
    override def lastTransform(value: ZoomTransform_): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("lastTransform")
    var lastTransform_Original: js.Function0[ZoomTransform_] = js.native
    
    /* CompleteClass */
    override def layout(): Layout = js.native
    /* CompleteClass */
    override def layout(value: Layout): OrgChart[Datum] = js.native
    
    /* CompleteClass */
    override def layoutBindings(): Record[Layout, LayoutBinding[Datum]] = js.native
    /* CompleteClass */
    override def layoutBindings(value: Record[Layout, LayoutBinding[Datum]]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("layoutBindings")
    var layoutBindings_Original: js.Function0[Record[Layout, LayoutBinding[Datum]]] = js.native
    
    /* CompleteClass */
    @JSName("layout")
    var layout_Original: js.Function0[Layout] = js.native
    
    /* CompleteClass */
    override def linkGroupArc(): Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = js.native
    /* CompleteClass */
    override def linkGroupArc(value: Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("linkGroupArc")
    var linkGroupArc_Original: js.Function0[Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]] = js.native
    
    /* CompleteClass */
    override def linkUpdate(): js.Function3[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        Unit
      ] = js.native
    /* CompleteClass */
    override def linkUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
    ): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("linkUpdate")
    var linkUpdate_Original: js.Function0[
        js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
      ] = js.native
    
    /* CompleteClass */
    override def neightbourMargin(): js.Function2[/* node1 */ HierarchyNode[Datum], /* node2 */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def neightbourMargin(value: js.Function2[/* node1 */ HierarchyNode[Datum], /* node2 */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("neightbourMargin")
    var neightbourMargin_Original: js.Function0[
        js.Function2[/* node1 */ HierarchyNode[Datum], /* node2 */ HierarchyNode[Datum], Double]
      ] = js.native
    
    /* CompleteClass */
    override def nodeContent(): js.Function4[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        /* state */ State[Datum], 
        String
      ] = js.native
    /* CompleteClass */
    override def nodeContent(
      value: js.Function4[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          /* state */ State[Datum], 
          String
        ]
    ): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeContent")
    var nodeContent_Original: js.Function0[
        js.Function4[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          /* state */ State[Datum], 
          String
        ]
      ] = js.native
    
    /* CompleteClass */
    override def nodeDefaultBackground(): String = js.native
    /* CompleteClass */
    override def nodeDefaultBackground(value: String): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeDefaultBackground")
    var nodeDefaultBackground_Original: js.Function0[String] = js.native
    
    /* CompleteClass */
    override def nodeHeight(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def nodeHeight(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeHeight")
    var nodeHeight_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    /* CompleteClass */
    override def nodeId(): js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]] = js.native
    /* CompleteClass */
    override def nodeId(value: js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeId")
    var nodeId_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]]] = js.native
    
    /* CompleteClass */
    override def nodeUpdate(): js.Function3[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        Unit
      ] = js.native
    /* CompleteClass */
    override def nodeUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
    ): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeUpdate")
    var nodeUpdate_Original: js.Function0[
        js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
      ] = js.native
    
    /* CompleteClass */
    override def nodeWidth(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def nodeWidth(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("nodeWidth")
    var nodeWidth_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    def onButtonClick(event: Any, node: HierarchyNode[Datum]): Unit = js.native
    
    /* CompleteClass */
    override def onNodeClick(): js.Function1[/* node */ NodeId, Unit] = js.native
    /* CompleteClass */
    override def onNodeClick(value: js.Function1[/* node */ NodeId, Unit]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("onNodeClick")
    var onNodeClick_Original: js.Function0[js.Function1[/* node */ NodeId, Unit]] = js.native
    
    /* CompleteClass */
    override def parentNodeId(): js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]] = js.native
    /* CompleteClass */
    override def parentNodeId(value: js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("parentNodeId")
    var parentNodeId_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]]] = js.native
    
    def removeNode(nodeId: NodeId): this.type = js.native
    
    def render(): this.type = js.native
    
    def restyleForeignObjectElements(): Unit = js.native
    
    /* CompleteClass */
    override def rootMargin(): Double = js.native
    /* CompleteClass */
    override def rootMargin(value: Double): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("rootMargin")
    var rootMargin_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def scaleExtent(): js.Tuple2[Double, Double] = js.native
    /* CompleteClass */
    override def scaleExtent(value: js.Tuple2[Double, Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("scaleExtent")
    var scaleExtent_Original: js.Function0[js.Tuple2[Double, Double]] = js.native
    
    /* CompleteClass */
    override def setActiveNodeCentered(): Boolean = js.native
    /* CompleteClass */
    override def setActiveNodeCentered(value: Boolean): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("setActiveNodeCentered")
    var setActiveNodeCentered_Original: js.Function0[Boolean] = js.native
    
    def setCentered(nodeId: NodeId): this.type = js.native
    
    def setExpanded(nodeId: NodeId): this.type = js.native
    def setExpanded(nodeId: NodeId, isExpanded: Boolean): this.type = js.native
    
    def setExpansionFlagToChildren(node: HierarchyNode[Datum], isExpanded: Boolean): Unit = js.native
    
    def setHighlighted(nodeId: NodeId): this.type = js.native
    
    def setLayouts(params: ExpandNodesFirst): Unit = js.native
    
    def setUpToTheRootHighlighted(nodeId: NodeId): this.type = js.native
    
    /* CompleteClass */
    override def siblingsMargin(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    /* CompleteClass */
    override def siblingsMargin(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("siblingsMargin")
    var siblingsMargin_Original: js.Function0[js.Function1[/* node */ HierarchyNode[Datum], Double]] = js.native
    
    /* CompleteClass */
    override def svg(): Selection_[SVGSVGElement, String, Null, Unit] = js.native
    /* CompleteClass */
    override def svg(value: Selection_[SVGSVGElement, String, Null, Unit]): OrgChart[Datum] = js.native
    
    /* CompleteClass */
    override def svgHeight(): Double = js.native
    /* CompleteClass */
    override def svgHeight(value: Double): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("svgHeight")
    var svgHeight_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def svgWidth(): Double = js.native
    /* CompleteClass */
    override def svgWidth(value: Double): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("svgWidth")
    var svgWidth_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    @JSName("svg")
    var svg_Original: js.Function0[Selection_[SVGSVGElement, String, Null, Unit]] = js.native
    
    def toDataUrl(url: String, callback: js.Function1[/* result */ String | js.typedarray.ArrayBuffer, Unit]): Unit = js.native
    
    def update(params: x0numbery0numberwidthnumb): Unit = js.native
    
    def updateNodesState(): Unit = js.native
    
    /* CompleteClass */
    override def zoomBehavior(): ZoomBehavior[Element, Datum] = js.native
    /* CompleteClass */
    override def zoomBehavior(value: ZoomBehavior[Element, Datum]): OrgChart[Datum] = js.native
    /* CompleteClass */
    @JSName("zoomBehavior")
    var zoomBehavior_Original: js.Function0[ZoomBehavior[Element, Datum]] = js.native
    
    def zoomIn(): Unit = js.native
    
    def zoomOut(): Unit = js.native
    
    def zoomTreeBounds(params: Params): Unit = js.native
    
    def zoomed(event: Any, node: HierarchyNode[Datum]): Unit = js.native
  }
  
  trait Connection extends StObject {
    
    var from: NodeId
    
    var label: String
    
    var to: NodeId
  }
  object Connection {
    
    inline def apply(from: NodeId, label: String, to: NodeId): Connection = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: NodeId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTo(value: NodeId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3OrgChart.d3OrgChartStrings.left
    - typings.d3OrgChart.d3OrgChartStrings.bottom
    - typings.d3OrgChart.d3OrgChartStrings.right
    - typings.d3OrgChart.d3OrgChartStrings.top
  */
  trait Layout extends StObject
  object Layout {
    
    inline def bottom: typings.d3OrgChart.d3OrgChartStrings.bottom = "bottom".asInstanceOf[typings.d3OrgChart.d3OrgChartStrings.bottom]
    
    inline def left: typings.d3OrgChart.d3OrgChartStrings.left = "left".asInstanceOf[typings.d3OrgChart.d3OrgChartStrings.left]
    
    inline def right: typings.d3OrgChart.d3OrgChartStrings.right = "right".asInstanceOf[typings.d3OrgChart.d3OrgChartStrings.right]
    
    inline def top: typings.d3OrgChart.d3OrgChartStrings.top = "top".asInstanceOf[typings.d3OrgChart.d3OrgChartStrings.top]
  }
  
  trait LayoutBinding[Datum] extends StObject {
    
    def buttonX(node: HierarchyNode[Datum]): Double
    
    def buttonY(node: HierarchyNode[Datum]): Double
    
    /** Returns a CSS transform */
    def centerTransform(params: CenterX): String
    
    var compactDimension: Reverse[Datum]
    
    def compactLinkMidX(node: HierarchyNode[Datum], state: State[Datum]): Double
    
    def compactLinkMidY(node: HierarchyNode[Datum], state: State[Datum]): Double
    
    def diagonal(source: Point, target: Point, m: Point): String
    
    def linkCompactXStart(node: HierarchyNode[Datum]): Double
    
    def linkCompactYStart(node: HierarchyNode[Datum]): Double
    
    def linkJoinX(node: HierarchyNode[Datum]): Double
    
    def linkJoinY(node: HierarchyNode[Datum]): Double
    
    def linkParentX(node: HierarchyNode[Datum]): Double
    
    def linkParentY(node: HierarchyNode[Datum]): Double
    
    def linkX(node: HierarchyNode[Datum]): Double
    
    def linkY(node: HierarchyNode[Datum]): Double
    
    def nodeBottomY(node: HierarchyNode[Datum]): Double
    
    def nodeFlexSize(params: ChildrenMargin[Datum]): js.Tuple2[Double, Double]
    
    def nodeJoinX(node: HierarchyNode[Datum]): Double
    
    def nodeJoinY(node: HierarchyNode[Datum]): Double
    
    def nodeLeftX(node: HierarchyNode[Datum]): Double
    
    def nodeRightX(node: HierarchyNode[Datum]): Double
    
    def nodeTopY(node: HierarchyNode[Datum]): Double
    
    def nodeUpdateTransform(params: widthnumberheightnumberPo): String
    
    /** Swaps x and y coordinates */
    def swap(d: Point): Point
    
    def zoomTransform(params: CenterY): String
  }
  object LayoutBinding {
    
    inline def apply[Datum](
      buttonX: HierarchyNode[Datum] => Double,
      buttonY: HierarchyNode[Datum] => Double,
      centerTransform: CenterX => String,
      compactDimension: Reverse[Datum],
      compactLinkMidX: (HierarchyNode[Datum], State[Datum]) => Double,
      compactLinkMidY: (HierarchyNode[Datum], State[Datum]) => Double,
      diagonal: (Point, Point, Point) => String,
      linkCompactXStart: HierarchyNode[Datum] => Double,
      linkCompactYStart: HierarchyNode[Datum] => Double,
      linkJoinX: HierarchyNode[Datum] => Double,
      linkJoinY: HierarchyNode[Datum] => Double,
      linkParentX: HierarchyNode[Datum] => Double,
      linkParentY: HierarchyNode[Datum] => Double,
      linkX: HierarchyNode[Datum] => Double,
      linkY: HierarchyNode[Datum] => Double,
      nodeBottomY: HierarchyNode[Datum] => Double,
      nodeFlexSize: ChildrenMargin[Datum] => js.Tuple2[Double, Double],
      nodeJoinX: HierarchyNode[Datum] => Double,
      nodeJoinY: HierarchyNode[Datum] => Double,
      nodeLeftX: HierarchyNode[Datum] => Double,
      nodeRightX: HierarchyNode[Datum] => Double,
      nodeTopY: HierarchyNode[Datum] => Double,
      nodeUpdateTransform: widthnumberheightnumberPo => String,
      swap: Point => Point,
      zoomTransform: CenterY => String
    ): LayoutBinding[Datum] = {
      val __obj = js.Dynamic.literal(buttonX = js.Any.fromFunction1(buttonX), buttonY = js.Any.fromFunction1(buttonY), centerTransform = js.Any.fromFunction1(centerTransform), compactDimension = compactDimension.asInstanceOf[js.Any], compactLinkMidX = js.Any.fromFunction2(compactLinkMidX), compactLinkMidY = js.Any.fromFunction2(compactLinkMidY), diagonal = js.Any.fromFunction3(diagonal), linkCompactXStart = js.Any.fromFunction1(linkCompactXStart), linkCompactYStart = js.Any.fromFunction1(linkCompactYStart), linkJoinX = js.Any.fromFunction1(linkJoinX), linkJoinY = js.Any.fromFunction1(linkJoinY), linkParentX = js.Any.fromFunction1(linkParentX), linkParentY = js.Any.fromFunction1(linkParentY), linkX = js.Any.fromFunction1(linkX), linkY = js.Any.fromFunction1(linkY), nodeBottomY = js.Any.fromFunction1(nodeBottomY), nodeFlexSize = js.Any.fromFunction1(nodeFlexSize), nodeJoinX = js.Any.fromFunction1(nodeJoinX), nodeJoinY = js.Any.fromFunction1(nodeJoinY), nodeLeftX = js.Any.fromFunction1(nodeLeftX), nodeRightX = js.Any.fromFunction1(nodeRightX), nodeTopY = js.Any.fromFunction1(nodeTopY), nodeUpdateTransform = js.Any.fromFunction1(nodeUpdateTransform), swap = js.Any.fromFunction1(swap), zoomTransform = js.Any.fromFunction1(zoomTransform))
      __obj.asInstanceOf[LayoutBinding[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutBinding[?], Datum] (val x: Self & LayoutBinding[Datum]) extends AnyVal {
      
      inline def setButtonX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "buttonX", js.Any.fromFunction1(value))
      
      inline def setButtonY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "buttonY", js.Any.fromFunction1(value))
      
      inline def setCenterTransform(value: CenterX => String): Self = StObject.set(x, "centerTransform", js.Any.fromFunction1(value))
      
      inline def setCompactDimension(value: Reverse[Datum]): Self = StObject.set(x, "compactDimension", value.asInstanceOf[js.Any])
      
      inline def setCompactLinkMidX(value: (HierarchyNode[Datum], State[Datum]) => Double): Self = StObject.set(x, "compactLinkMidX", js.Any.fromFunction2(value))
      
      inline def setCompactLinkMidY(value: (HierarchyNode[Datum], State[Datum]) => Double): Self = StObject.set(x, "compactLinkMidY", js.Any.fromFunction2(value))
      
      inline def setDiagonal(value: (Point, Point, Point) => String): Self = StObject.set(x, "diagonal", js.Any.fromFunction3(value))
      
      inline def setLinkCompactXStart(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkCompactXStart", js.Any.fromFunction1(value))
      
      inline def setLinkCompactYStart(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkCompactYStart", js.Any.fromFunction1(value))
      
      inline def setLinkJoinX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkJoinX", js.Any.fromFunction1(value))
      
      inline def setLinkJoinY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkJoinY", js.Any.fromFunction1(value))
      
      inline def setLinkParentX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkParentX", js.Any.fromFunction1(value))
      
      inline def setLinkParentY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkParentY", js.Any.fromFunction1(value))
      
      inline def setLinkX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkX", js.Any.fromFunction1(value))
      
      inline def setLinkY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "linkY", js.Any.fromFunction1(value))
      
      inline def setNodeBottomY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeBottomY", js.Any.fromFunction1(value))
      
      inline def setNodeFlexSize(value: ChildrenMargin[Datum] => js.Tuple2[Double, Double]): Self = StObject.set(x, "nodeFlexSize", js.Any.fromFunction1(value))
      
      inline def setNodeJoinX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeJoinX", js.Any.fromFunction1(value))
      
      inline def setNodeJoinY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeJoinY", js.Any.fromFunction1(value))
      
      inline def setNodeLeftX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeLeftX", js.Any.fromFunction1(value))
      
      inline def setNodeRightX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeRightX", js.Any.fromFunction1(value))
      
      inline def setNodeTopY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "nodeTopY", js.Any.fromFunction1(value))
      
      inline def setNodeUpdateTransform(value: widthnumberheightnumberPo => String): Self = StObject.set(x, "nodeUpdateTransform", js.Any.fromFunction1(value))
      
      inline def setSwap(value: Point => Point): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setZoomTransform(value: CenterY => String): Self = StObject.set(x, "zoomTransform", js.Any.fromFunction1(value))
    }
  }
  
  type NodeId = String | Double
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State[Datum]
    extends StObject
       with StatePublic[Datum]
       with StateInternal[Datum]
       with /* key */ StringDictionary[Any]
  
  /* Inlined {[ Property in keyof d3-org-chart.d3-org-chart.StatePublic<T> ]: (): d3-org-chart.d3-org-chart.StatePublic<T>[Property]} & {[ Property in keyof d3-org-chart.d3-org-chart.StatePublic<T> ]: (value : d3-org-chart.d3-org-chart.StatePublic<T>[Property]): TSelf} */
  trait StateGetSet[T, TSelf] extends StObject {
    
    def backgroundColor(): String
    def backgroundColor(value: String): TSelf
    @JSName("backgroundColor")
    var backgroundColor_Original: js.Function0[String]
    
    def buttonContent(): js.Function1[/* params */ typings.d3OrgChart.anon.State[T], String]
    def buttonContent(value: js.Function1[/* params */ typings.d3OrgChart.anon.State[T], String]): TSelf
    @JSName("buttonContent")
    var buttonContent_Original: js.Function0[js.Function1[/* params */ typings.d3OrgChart.anon.State[T], String]]
    
    def childrenMargin(): js.Function1[/* node */ HierarchyNode[T], Double]
    def childrenMargin(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("childrenMargin")
    var childrenMargin_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    def compact(): Boolean
    def compact(value: Boolean): TSelf
    
    def compactMarginBetween(): js.Function1[/* node */ HierarchyNode[T], Double]
    def compactMarginBetween(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("compactMarginBetween")
    var compactMarginBetween_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    def compactMarginPair(): js.Function1[/* node */ HierarchyNode[T], Double]
    def compactMarginPair(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("compactMarginPair")
    var compactMarginPair_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    @JSName("compact")
    var compact_Original: js.Function0[Boolean]
    
    def connections(): js.Array[Connection]
    def connections(value: js.Array[Connection]): TSelf
    
    def connectionsUpdate(): ValueFn[BaseType, T, Unit]
    def connectionsUpdate(value: ValueFn[BaseType, T, Unit]): TSelf
    @JSName("connectionsUpdate")
    var connectionsUpdate_Original: js.Function0[ValueFn[BaseType, T, Unit]]
    
    @JSName("connections")
    var connections_Original: js.Function0[js.Array[Connection]]
    
    def container(): String
    def container(value: String): TSelf
    @JSName("container")
    var container_Original: js.Function0[String]
    
    def ctx(): CanvasRenderingContext2D
    def ctx(value: CanvasRenderingContext2D): TSelf
    @JSName("ctx")
    var ctx_Original: js.Function0[CanvasRenderingContext2D]
    
    var data: js.UndefOr[js.Function0[js.Array[T] | Null]] = js.undefined
    
    def defaultFont(): String
    def defaultFont(value: String): TSelf
    @JSName("defaultFont")
    var defaultFont_Original: js.Function0[String]
    
    def defaultTextFill(): String
    def defaultTextFill(value: String): TSelf
    @JSName("defaultTextFill")
    var defaultTextFill_Original: js.Function0[String]
    
    def defs(): js.Function2[/* state */ State[T], /* visibleConnections */ js.Array[Connection], String]
    def defs(value: js.Function2[/* state */ State[T], /* visibleConnections */ js.Array[Connection], String]): TSelf
    @JSName("defs")
    var defs_Original: js.Function0[
        js.Function2[/* state */ State[T], /* visibleConnections */ js.Array[Connection], String]
      ]
    
    def duration(): Double
    def duration(value: Double): TSelf
    @JSName("duration")
    var duration_Original: js.Function0[Double]
    
    def expandLevel(): Double
    def expandLevel(value: Double): TSelf
    @JSName("expandLevel")
    var expandLevel_Original: js.Function0[Double]
    
    def firstDraw(): Boolean
    def firstDraw(value: Boolean): TSelf
    @JSName("firstDraw")
    var firstDraw_Original: js.Function0[Boolean]
    
    def id(): String
    def id(value: String): TSelf
    @JSName("id")
    var id_Original: js.Function0[String]
    
    def lastTransform(): ZoomTransform_
    def lastTransform(value: ZoomTransform_): TSelf
    @JSName("lastTransform")
    var lastTransform_Original: js.Function0[ZoomTransform_]
    
    def layout(): Layout
    def layout(value: Layout): TSelf
    
    def layoutBindings(): Record[Layout, LayoutBinding[T]]
    def layoutBindings(value: Record[Layout, LayoutBinding[T]]): TSelf
    @JSName("layoutBindings")
    var layoutBindings_Original: js.Function0[Record[Layout, LayoutBinding[T]]]
    
    @JSName("layout")
    var layout_Original: js.Function0[Layout]
    
    def linkGroupArc(): Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]
    def linkGroupArc(value: Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]): TSelf
    @JSName("linkGroupArc")
    var linkGroupArc_Original: js.Function0[Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
    
    def linkUpdate(): js.Function3[
        /* node */ HierarchyNode[T], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[T]], 
        Unit
      ]
    def linkUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ]
    ): TSelf
    @JSName("linkUpdate")
    var linkUpdate_Original: js.Function0[
        js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ]
      ]
    
    def neightbourMargin(): js.Function2[/* node1 */ HierarchyNode[T], /* node2 */ HierarchyNode[T], Double]
    def neightbourMargin(value: js.Function2[/* node1 */ HierarchyNode[T], /* node2 */ HierarchyNode[T], Double]): TSelf
    @JSName("neightbourMargin")
    var neightbourMargin_Original: js.Function0[js.Function2[/* node1 */ HierarchyNode[T], /* node2 */ HierarchyNode[T], Double]]
    
    def nodeContent(): js.Function4[
        /* node */ HierarchyNode[T], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[T]], 
        /* state */ State[T], 
        String
      ]
    def nodeContent(
      value: js.Function4[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          /* state */ State[T], 
          String
        ]
    ): TSelf
    @JSName("nodeContent")
    var nodeContent_Original: js.Function0[
        js.Function4[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          /* state */ State[T], 
          String
        ]
      ]
    
    def nodeDefaultBackground(): String
    def nodeDefaultBackground(value: String): TSelf
    @JSName("nodeDefaultBackground")
    var nodeDefaultBackground_Original: js.Function0[String]
    
    def nodeHeight(): js.Function1[/* node */ HierarchyNode[T], Double]
    def nodeHeight(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("nodeHeight")
    var nodeHeight_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    def nodeId(): js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]
    def nodeId(value: js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]): TSelf
    @JSName("nodeId")
    var nodeId_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]]
    
    def nodeUpdate(): js.Function3[
        /* node */ HierarchyNode[T], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[T]], 
        Unit
      ]
    def nodeUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ]
    ): TSelf
    @JSName("nodeUpdate")
    var nodeUpdate_Original: js.Function0[
        js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ]
      ]
    
    def nodeWidth(): js.Function1[/* node */ HierarchyNode[T], Double]
    def nodeWidth(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("nodeWidth")
    var nodeWidth_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    def onNodeClick(): js.Function1[/* node */ NodeId, Unit]
    def onNodeClick(value: js.Function1[/* node */ NodeId, Unit]): TSelf
    @JSName("onNodeClick")
    var onNodeClick_Original: js.Function0[js.Function1[/* node */ NodeId, Unit]]
    
    def parentNodeId(): js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]
    def parentNodeId(value: js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]): TSelf
    @JSName("parentNodeId")
    var parentNodeId_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]]
    
    def rootMargin(): Double
    def rootMargin(value: Double): TSelf
    @JSName("rootMargin")
    var rootMargin_Original: js.Function0[Double]
    
    def scaleExtent(): js.Tuple2[Double, Double]
    def scaleExtent(value: js.Tuple2[Double, Double]): TSelf
    @JSName("scaleExtent")
    var scaleExtent_Original: js.Function0[js.Tuple2[Double, Double]]
    
    def setActiveNodeCentered(): Boolean
    def setActiveNodeCentered(value: Boolean): TSelf
    @JSName("setActiveNodeCentered")
    var setActiveNodeCentered_Original: js.Function0[Boolean]
    
    def siblingsMargin(): js.Function1[/* node */ HierarchyNode[T], Double]
    def siblingsMargin(value: js.Function1[/* node */ HierarchyNode[T], Double]): TSelf
    @JSName("siblingsMargin")
    var siblingsMargin_Original: js.Function0[js.Function1[/* node */ HierarchyNode[T], Double]]
    
    def svg(): Selection_[SVGSVGElement, String, Null, Unit]
    def svg(value: Selection_[SVGSVGElement, String, Null, Unit]): TSelf
    
    def svgHeight(): Double
    def svgHeight(value: Double): TSelf
    @JSName("svgHeight")
    var svgHeight_Original: js.Function0[Double]
    
    def svgWidth(): Double
    def svgWidth(value: Double): TSelf
    @JSName("svgWidth")
    var svgWidth_Original: js.Function0[Double]
    
    @JSName("svg")
    var svg_Original: js.Function0[Selection_[SVGSVGElement, String, Null, Unit]]
    
    def zoomBehavior(): ZoomBehavior[Element, T]
    def zoomBehavior(value: ZoomBehavior[Element, T]): TSelf
    @JSName("zoomBehavior")
    var zoomBehavior_Original: js.Function0[ZoomBehavior[Element, T]]
  }
  object StateGetSet {
    
    inline def apply[T, TSelf](
      backgroundColor: () => String,
      buttonContent: () => js.Function1[/* params */ typings.d3OrgChart.anon.State[T], String],
      childrenMargin: () => js.Function1[/* node */ HierarchyNode[T], Double],
      compact: () => Boolean,
      compactMarginBetween: () => js.Function1[/* node */ HierarchyNode[T], Double],
      compactMarginPair: () => js.Function1[/* node */ HierarchyNode[T], Double],
      connections: () => js.Array[Connection],
      connectionsUpdate: () => ValueFn[BaseType, T, Unit],
      container: () => String,
      ctx: () => CanvasRenderingContext2D,
      defaultFont: () => String,
      defaultTextFill: () => String,
      defs: () => js.Function2[/* state */ State[T], /* visibleConnections */ js.Array[Connection], String],
      duration: () => Double,
      expandLevel: () => Double,
      firstDraw: () => Boolean,
      id: () => String,
      lastTransform: () => ZoomTransform_,
      layout: () => Layout,
      layoutBindings: () => Record[Layout, LayoutBinding[T]],
      linkGroupArc: () => Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]],
      linkUpdate: () => js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ],
      neightbourMargin: () => js.Function2[/* node1 */ HierarchyNode[T], /* node2 */ HierarchyNode[T], Double],
      nodeContent: () => js.Function4[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          /* state */ State[T], 
          String
        ],
      nodeDefaultBackground: () => String,
      nodeHeight: () => js.Function1[/* node */ HierarchyNode[T], Double],
      nodeId: () => js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]],
      nodeUpdate: () => js.Function3[
          /* node */ HierarchyNode[T], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[T]], 
          Unit
        ],
      nodeWidth: () => js.Function1[/* node */ HierarchyNode[T], Double],
      onNodeClick: () => js.Function1[/* node */ NodeId, Unit],
      parentNodeId: () => js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]],
      rootMargin: () => Double,
      scaleExtent: () => js.Tuple2[Double, Double],
      setActiveNodeCentered: () => Boolean,
      siblingsMargin: () => js.Function1[/* node */ HierarchyNode[T], Double],
      svg: () => Selection_[SVGSVGElement, String, Null, Unit],
      svgHeight: () => Double,
      svgWidth: () => Double,
      zoomBehavior: () => ZoomBehavior[Element, T]
    ): StateGetSet[T, TSelf] = {
      val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction0(backgroundColor), buttonContent = js.Any.fromFunction0(buttonContent), childrenMargin = js.Any.fromFunction0(childrenMargin), compact = js.Any.fromFunction0(compact), compactMarginBetween = js.Any.fromFunction0(compactMarginBetween), compactMarginPair = js.Any.fromFunction0(compactMarginPair), connections = js.Any.fromFunction0(connections), connectionsUpdate = js.Any.fromFunction0(connectionsUpdate), container = js.Any.fromFunction0(container), ctx = js.Any.fromFunction0(ctx), defaultFont = js.Any.fromFunction0(defaultFont), defaultTextFill = js.Any.fromFunction0(defaultTextFill), defs = js.Any.fromFunction0(defs), duration = js.Any.fromFunction0(duration), expandLevel = js.Any.fromFunction0(expandLevel), firstDraw = js.Any.fromFunction0(firstDraw), id = js.Any.fromFunction0(id), lastTransform = js.Any.fromFunction0(lastTransform), layout = js.Any.fromFunction0(layout), layoutBindings = js.Any.fromFunction0(layoutBindings), linkGroupArc = js.Any.fromFunction0(linkGroupArc), linkUpdate = js.Any.fromFunction0(linkUpdate), neightbourMargin = js.Any.fromFunction0(neightbourMargin), nodeContent = js.Any.fromFunction0(nodeContent), nodeDefaultBackground = js.Any.fromFunction0(nodeDefaultBackground), nodeHeight = js.Any.fromFunction0(nodeHeight), nodeId = js.Any.fromFunction0(nodeId), nodeUpdate = js.Any.fromFunction0(nodeUpdate), nodeWidth = js.Any.fromFunction0(nodeWidth), onNodeClick = js.Any.fromFunction0(onNodeClick), parentNodeId = js.Any.fromFunction0(parentNodeId), rootMargin = js.Any.fromFunction0(rootMargin), scaleExtent = js.Any.fromFunction0(scaleExtent), setActiveNodeCentered = js.Any.fromFunction0(setActiveNodeCentered), siblingsMargin = js.Any.fromFunction0(siblingsMargin), svg = js.Any.fromFunction0(svg), svgHeight = js.Any.fromFunction0(svgHeight), svgWidth = js.Any.fromFunction0(svgWidth), zoomBehavior = js.Any.fromFunction0(zoomBehavior))
      __obj.asInstanceOf[StateGetSet[T, TSelf]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateGetSet[?, ?], T, TSelf] (val x: Self & (StateGetSet[T, TSelf])) extends AnyVal {
      
      inline def setBackgroundColor(value: () => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction0(value))
      
      inline def setButtonContent(value: () => js.Function1[/* params */ typings.d3OrgChart.anon.State[T], String]): Self = StObject.set(x, "buttonContent", js.Any.fromFunction0(value))
      
      inline def setChildrenMargin(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "childrenMargin", js.Any.fromFunction0(value))
      
      inline def setCompact(value: () => Boolean): Self = StObject.set(x, "compact", js.Any.fromFunction0(value))
      
      inline def setCompactMarginBetween(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "compactMarginBetween", js.Any.fromFunction0(value))
      
      inline def setCompactMarginPair(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "compactMarginPair", js.Any.fromFunction0(value))
      
      inline def setConnections(value: () => js.Array[Connection]): Self = StObject.set(x, "connections", js.Any.fromFunction0(value))
      
      inline def setConnectionsUpdate(value: () => ValueFn[BaseType, T, Unit]): Self = StObject.set(x, "connectionsUpdate", js.Any.fromFunction0(value))
      
      inline def setContainer(value: () => String): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setCtx(value: () => CanvasRenderingContext2D): Self = StObject.set(x, "ctx", js.Any.fromFunction0(value))
      
      inline def setData(value: () => js.Array[T] | Null): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaultFont(value: () => String): Self = StObject.set(x, "defaultFont", js.Any.fromFunction0(value))
      
      inline def setDefaultTextFill(value: () => String): Self = StObject.set(x, "defaultTextFill", js.Any.fromFunction0(value))
      
      inline def setDefs(
        value: () => js.Function2[/* state */ State[T], /* visibleConnections */ js.Array[Connection], String]
      ): Self = StObject.set(x, "defs", js.Any.fromFunction0(value))
      
      inline def setDuration(value: () => Double): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
      
      inline def setExpandLevel(value: () => Double): Self = StObject.set(x, "expandLevel", js.Any.fromFunction0(value))
      
      inline def setFirstDraw(value: () => Boolean): Self = StObject.set(x, "firstDraw", js.Any.fromFunction0(value))
      
      inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
      
      inline def setLastTransform(value: () => ZoomTransform_): Self = StObject.set(x, "lastTransform", js.Any.fromFunction0(value))
      
      inline def setLayout(value: () => Layout): Self = StObject.set(x, "layout", js.Any.fromFunction0(value))
      
      inline def setLayoutBindings(value: () => Record[Layout, LayoutBinding[T]]): Self = StObject.set(x, "layoutBindings", js.Any.fromFunction0(value))
      
      inline def setLinkGroupArc(value: () => Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]): Self = StObject.set(x, "linkGroupArc", js.Any.fromFunction0(value))
      
      inline def setLinkUpdate(
        value: () => js.Function3[
              /* node */ HierarchyNode[T], 
              /* index */ Double, 
              /* nodes */ js.Array[HierarchyNode[T]], 
              Unit
            ]
      ): Self = StObject.set(x, "linkUpdate", js.Any.fromFunction0(value))
      
      inline def setNeightbourMargin(value: () => js.Function2[/* node1 */ HierarchyNode[T], /* node2 */ HierarchyNode[T], Double]): Self = StObject.set(x, "neightbourMargin", js.Any.fromFunction0(value))
      
      inline def setNodeContent(
        value: () => js.Function4[
              /* node */ HierarchyNode[T], 
              /* index */ Double, 
              /* nodes */ js.Array[HierarchyNode[T]], 
              /* state */ State[T], 
              String
            ]
      ): Self = StObject.set(x, "nodeContent", js.Any.fromFunction0(value))
      
      inline def setNodeDefaultBackground(value: () => String): Self = StObject.set(x, "nodeDefaultBackground", js.Any.fromFunction0(value))
      
      inline def setNodeHeight(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "nodeHeight", js.Any.fromFunction0(value))
      
      inline def setNodeId(value: () => js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]): Self = StObject.set(x, "nodeId", js.Any.fromFunction0(value))
      
      inline def setNodeUpdate(
        value: () => js.Function3[
              /* node */ HierarchyNode[T], 
              /* index */ Double, 
              /* nodes */ js.Array[HierarchyNode[T]], 
              Unit
            ]
      ): Self = StObject.set(x, "nodeUpdate", js.Any.fromFunction0(value))
      
      inline def setNodeWidth(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "nodeWidth", js.Any.fromFunction0(value))
      
      inline def setOnNodeClick(value: () => js.Function1[/* node */ NodeId, Unit]): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction0(value))
      
      inline def setParentNodeId(value: () => js.Function1[/* node */ HierarchyNode[T] | T, js.UndefOr[NodeId]]): Self = StObject.set(x, "parentNodeId", js.Any.fromFunction0(value))
      
      inline def setRootMargin(value: () => Double): Self = StObject.set(x, "rootMargin", js.Any.fromFunction0(value))
      
      inline def setScaleExtent(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "scaleExtent", js.Any.fromFunction0(value))
      
      inline def setSetActiveNodeCentered(value: () => Boolean): Self = StObject.set(x, "setActiveNodeCentered", js.Any.fromFunction0(value))
      
      inline def setSiblingsMargin(value: () => js.Function1[/* node */ HierarchyNode[T], Double]): Self = StObject.set(x, "siblingsMargin", js.Any.fromFunction0(value))
      
      inline def setSvg(value: () => Selection_[SVGSVGElement, String, Null, Unit]): Self = StObject.set(x, "svg", js.Any.fromFunction0(value))
      
      inline def setSvgHeight(value: () => Double): Self = StObject.set(x, "svgHeight", js.Any.fromFunction0(value))
      
      inline def setSvgWidth(value: () => Double): Self = StObject.set(x, "svgWidth", js.Any.fromFunction0(value))
      
      inline def setZoomBehavior(value: () => ZoomBehavior[Element, T]): Self = StObject.set(x, "zoomBehavior", js.Any.fromFunction0(value))
    }
  }
  
  trait StateInternal[Datum] extends StObject {
    
    val allNodes: js.Array[HierarchyNode[Datum]]
    
    val root: HierarchyNode[Datum]
  }
  object StateInternal {
    
    inline def apply[Datum](allNodes: js.Array[HierarchyNode[Datum]], root: HierarchyNode[Datum]): StateInternal[Datum] = {
      val __obj = js.Dynamic.literal(allNodes = allNodes.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateInternal[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateInternal[?], Datum] (val x: Self & StateInternal[Datum]) extends AnyVal {
      
      inline def setAllNodes(value: js.Array[HierarchyNode[Datum]]): Self = StObject.set(x, "allNodes", value.asInstanceOf[js.Any])
      
      inline def setAllNodesVarargs(value: HierarchyNode[Datum]*): Self = StObject.set(x, "allNodes", js.Array(value*))
      
      inline def setRoot(value: HierarchyNode[Datum]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatePublic[Datum] extends StObject {
    
    /** CSS color, for example "#2C3E50" */
    var backgroundColor: String = js.native
    
    def buttonContent(params: Node[Datum]): String = js.native
    
    def childrenMargin(node: HierarchyNode[Datum]): Double = js.native
    
    var compact: Boolean = js.native
    
    def compactMarginBetween(node: HierarchyNode[Datum]): Double = js.native
    
    def compactMarginPair(node: HierarchyNode[Datum]): Double = js.native
    
    var connections: js.Array[Connection] = js.native
    
    def connectionsUpdate(datum: Datum, index: Double, groups: js.Array[BaseType]): Unit = js.native
    def connectionsUpdate(datum: Datum, index: Double, groups: ArrayLike[BaseType]): Unit = js.native
    @JSName("connectionsUpdate")
    var connectionsUpdate_Original: ValueFn[BaseType, Datum, Unit] = js.native
    
    /** CSS selector string, for example "#my-chart" */
    var container: String = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    var data: js.Array[Datum] | Null = js.native
    
    /** Font name, for example "Helvetica" */
    var defaultFont: String = js.native
    
    /** CSS color, for example "#2C3E50" */
    var defaultTextFill: String = js.native
    
    /** Return type is the string representation of a SVG <defs> element */
    def defs(state: State[Datum], visibleConnections: js.Array[Connection]): String = js.native
    
    var duration: Double = js.native
    
    var expandLevel: Double = js.native
    
    var firstDraw: Boolean = js.native
    
    var id: String = js.native
    
    var lastTransform: ZoomTransform_ = js.native
    
    var layout: Layout = js.native
    
    var layoutBindings: Record[Layout, LayoutBinding[Datum]] = js.native
    
    /**
      * Generates a link for the given arguments.
      *
      * IMPORTANT: If the rendering context of the link generator is null,
      * then the link is returned as a path data string.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * @param d The datum for which the link is to be generated.
      */
    def linkGroupArc(d: DefaultLinkObject, args: Any*): String | Null = js.native
    @JSName("linkGroupArc")
    var linkGroupArc_Original: Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = js.native
    /**
      * Generates an link for the given arguments.
      *
      * IMPORTANT: If the link generator has been configured with a rendering context,
      * then the link is rendered to this context as a sequence of path method calls and this function returns void.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * @param d The datum for which the link is to be generated.
      */
    @JSName("linkGroupArc")
    def linkGroupArc_Unit(d: DefaultLinkObject, args: Any*): Unit = js.native
    
    def linkUpdate(node: HierarchyNode[Datum], index: Double, nodes: js.Array[HierarchyNode[Datum]]): Unit = js.native
    
    def neightbourMargin(node1: HierarchyNode[Datum], node2: HierarchyNode[Datum]): Double = js.native
    
    /** A function which renders the given node as HTML content. */
    def nodeContent(
      node: HierarchyNode[Datum],
      index: Double,
      nodes: js.Array[HierarchyNode[Datum]],
      state: State[Datum]
    ): String = js.native
    
    /** CSS color, for example "#2C3E50" */
    var nodeDefaultBackground: String = js.native
    
    def nodeHeight(node: HierarchyNode[Datum]): Double = js.native
    
    def nodeId(node: Datum): js.UndefOr[NodeId] = js.native
    /** Given a node, returns an id for equality comparisons */
    def nodeId(node: HierarchyNode[Datum]): js.UndefOr[NodeId] = js.native
    
    def nodeUpdate(node: HierarchyNode[Datum], index: Double, nodes: js.Array[HierarchyNode[Datum]]): Unit = js.native
    
    def nodeWidth(node: HierarchyNode[Datum]): Double = js.native
    
    /** A function which is triggered when the node is clicked. */
    def onNodeClick(node: NodeId): Unit = js.native
    
    def parentNodeId(node: Datum): js.UndefOr[NodeId] = js.native
    /** Given a node, returns its parent id for equality comparisons */
    def parentNodeId(node: HierarchyNode[Datum]): js.UndefOr[NodeId] = js.native
    
    var rootMargin: Double = js.native
    
    var scaleExtent: js.Tuple2[Double, Double] = js.native
    
    var setActiveNodeCentered: Boolean = js.native
    
    def siblingsMargin(node: HierarchyNode[Datum]): Double = js.native
    
    var svg: Selection_[SVGSVGElement, String, Null, Unit] = js.native
    
    var svgHeight: Double = js.native
    
    var svgWidth: Double = js.native
    
    /**
      * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
      * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
      * and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
      *
      * @param selection A D3 selection of elements.
      * @param args Optional arguments to be passed in.
      */
    def zoomBehavior(selection: Selection_[Element, Datum, Any, Any], args: Any*): Unit = js.native
    @JSName("zoomBehavior")
    var zoomBehavior_Original: ZoomBehavior[Element, Datum] = js.native
  }
}
