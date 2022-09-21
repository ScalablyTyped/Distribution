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
import typings.d3OrgChart.anon.K
import typings.d3OrgChart.anon.Node
import typings.d3OrgChart.anon.Nodes
import typings.d3OrgChart.anon.Params
import typings.d3OrgChart.anon.Reverse
import typings.d3OrgChart.anon.knumberPoint
import typings.d3OrgChart.anon.widthnumberheightnumberPo
import typings.d3OrgChart.anon.x0numbery0numberwidthnumb
import typings.d3OrgChart.d3OrgChartStrings.none
import typings.d3Selection.mod.Selection_
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
  open class OrgChart[Datum] () extends StObject {
    
    def addNode(node: Datum): this.type = js.native
    
    def backgroundColor(): String = js.native
    // CSS color, for example "#2C3E50"
    def backgroundColor(value: String): this.type = js.native
    
    def buttonContent(): js.Function1[/* params */ Node[Datum], String] = js.native
    // Return type is HTML content
    def buttonContent(value: js.Function1[/* params */ Node[Datum], String]): this.type = js.native
    
    def calculateCompactFlexDimensions(root: Any): Unit = js.native
    
    def calculateCompactFlexPositions(root: Any): Unit = js.native
    
    def childrenMargin(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def childrenMargin(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def clearHighlighting(): Unit = js.native
    
    def collapse(node: HierarchyNode[Datum]): Unit = js.native
    
    def collapseAll(): this.type = js.native
    
    def compact(): Boolean = js.native
    def compact(value: Boolean): this.type = js.native
    
    def compactMarginBetween(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def compactMarginBetween(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def compactMarginPair(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def compactMarginPair(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def connections(): js.Array[Connection] = js.native
    def connections(value: js.Array[Connection]): this.type = js.native
    
    def connectionsUpdate(): Any = js.native
    def connectionsUpdate(value: Any): this.type = js.native
    
    def container(): String = js.native
    // CSS selector string, for example "#my-chart"
    def container(value: String): this.type = js.native
    
    def ctx(): CanvasRenderingContext2D = js.native
    def ctx(value: CanvasRenderingContext2D): this.type = js.native
    
    def data(): this.type = js.native
    def data(value: js.Array[Datum]): this.type = js.native
    @JSName("data")
    def data_Union(): js.Array[Datum] | Null = js.native
    
    def defaultFont(): String = js.native
    // Font name, for example "Helvetica"
    def defaultFont(value: String): this.type = js.native
    
    def defaultTextFill(): String = js.native
    // CSS color, for example "#2C3E50"
    def defaultTextFill(value: String): this.type = js.native
    
    def defs(): Any = js.native
    def defs(value: Any): this.type = js.native
    
    def diagonal(source: Point, target: Point, m: Point): String = js.native
    
    def downloadImage(): Unit = js.native
    def downloadImage(params: IsSvg): Unit = js.native
    
    def duration(): Double = js.native
    def duration(value: Double): this.type = js.native
    
    def expand(node: HierarchyNode[Datum]): Unit = js.native
    
    def expandAll(): this.type = js.native
    
    def expandLevel(): Double = js.native
    def expandLevel(value: Double): this.type = js.native
    
    def expandSomeNodes(node: HierarchyNode[Datum]): Unit = js.native
    
    def exportImg(): Unit = js.native
    def exportImg(params: Full): Unit = js.native
    
    def exportSvg(): this.type = js.native
    
    def firstDraw(): Boolean = js.native
    def firstDraw(value: Boolean): this.type = js.native
    
    def fit(): this.type = js.native
    def fit(params: Nodes[Datum]): this.type = js.native
    
    def fullscreen(): Unit = js.native
    def fullscreen(element: Element): Unit = js.native
    
    def getChartState(): State[Datum] = js.native
    
    def getNodeChildren(args: HierarchyNode[Datum], nodeStore: js.Array[Datum]): js.Array[Datum] = js.native
    
    def getTextWidth(text: String, params: Ctx): Double = js.native
    
    // Whether the current browser is Microsoft Edge
    def hdiagonal(source: Point, target: Point, m: Point): String = js.native
    
    // Getters and setters, dynamically crreated in the constructor
    // TODO: improve unknown types
    def id(): String = js.native
    def id(value: String): this.type = js.native
    
    def initialZoom(zoomLevel: Double): this.type = js.native
    
    def initializeEnterExitUpdatePattern(): Unit = js.native
    
    def isEdge(): Boolean = js.native
    
    def lastTransform(): knumberPoint = js.native
    def lastTransform(value: knumberPoint): this.type = js.native
    
    def layout(): Layout = js.native
    def layout(value: Layout): this.type = js.native
    
    def layoutBindings(): Record[Layout, LayoutBinding[Datum]] = js.native
    def layoutBindings(value: Record[Layout, LayoutBinding[Datum]]): this.type = js.native
    
    def linkGroupArc(): Any = js.native
    def linkGroupArc(value: Any): this.type = js.native
    
    def linkUpdate(): js.Function3[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        Unit
      ] = js.native
    def linkUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
    ): this.type = js.native
    
    def neightbourMargin(): js.Function2[/* node1 */ HierarchyNode[Datum], /* node2 */ HierarchyNode[Datum], Double] = js.native
    // NB: typo to match library
    def neightbourMargin(value: js.Function2[/* node1 */ HierarchyNode[Datum], /* node2 */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def nodeContent(): js.Function4[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        /* state */ State[Datum], 
        String
      ] = js.native
    // Return type is HTML content
    def nodeContent(
      value: js.Function4[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          /* state */ State[Datum], 
          String
        ]
    ): this.type = js.native
    
    def nodeDefaultBackground(): String = js.native
    // CSS color, for example "#2C3E50"
    def nodeDefaultBackground(value: String): this.type = js.native
    
    def nodeHeight(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def nodeHeight(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def nodeId(): js.Function1[/* node */ HierarchyNode[Datum] | Datum, NodeId] = js.native
    // Given a node, returns an id for equality comparisons
    def nodeId(value: js.Function1[/* node */ HierarchyNode[Datum] | Datum, NodeId]): this.type = js.native
    
    def nodeUpdate(): js.Function3[
        /* node */ HierarchyNode[Datum], 
        /* index */ Double, 
        /* nodes */ js.Array[HierarchyNode[Datum]], 
        Unit
      ] = js.native
    def nodeUpdate(
      value: js.Function3[
          /* node */ HierarchyNode[Datum], 
          /* index */ Double, 
          /* nodes */ js.Array[HierarchyNode[Datum]], 
          Unit
        ]
    ): this.type = js.native
    
    def nodeWidth(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def nodeWidth(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def onButtonClick(event: Any, node: HierarchyNode[Datum]): Unit = js.native
    
    def onNodeClick(): js.Function1[/* node */ HierarchyNode[Datum], Unit] = js.native
    def onNodeClick(value: js.Function1[/* node */ HierarchyNode[Datum], Unit]): this.type = js.native
    
    def parentNodeId(): js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]] = js.native
    // Given a node, returns it's parent id for equality comparisons
    def parentNodeId(value: js.Function1[/* node */ HierarchyNode[Datum] | Datum, js.UndefOr[NodeId]]): this.type = js.native
    
    def removeNode(nodeId: NodeId): this.type = js.native
    
    def render(): this.type = js.native
    
    def restyleForeignObjectElements(): Unit = js.native
    
    def rootMargin(): Double = js.native
    def rootMargin(value: Double): this.type = js.native
    
    def setActiveNodeCentered(): Boolean = js.native
    def setActiveNodeCentered(value: Boolean): this.type = js.native
    
    def setCentered(nodeId: NodeId): this.type = js.native
    
    def setExpanded(nodeId: NodeId): this.type = js.native
    def setExpanded(nodeId: NodeId, isExpanded: Boolean): this.type = js.native
    
    def setExpansionFlagToChildren(node: HierarchyNode[Datum], isExpanded: Boolean): Unit = js.native
    
    def setHighlighted(nodeId: NodeId): this.type = js.native
    
    def setLayouts(params: ExpandNodesFirst): Unit = js.native
    
    def setUpToTheRootHighlighted(nodeId: NodeId): this.type = js.native
    
    def siblingsMargin(): js.Function1[/* node */ HierarchyNode[Datum], Double] = js.native
    def siblingsMargin(value: js.Function1[/* node */ HierarchyNode[Datum], Double]): this.type = js.native
    
    def svgHeight(): Double = js.native
    def svgHeight(value: Double): this.type = js.native
    
    def svgWidth(): Double = js.native
    def svgWidth(value: Double): this.type = js.native
    
    def toDataUrl(url: String, callback: js.Function1[/* result */ String | js.typedarray.ArrayBuffer, Unit]): Unit = js.native
    
    def update(params: x0numbery0numberwidthnumb): Unit = js.native
    
    def updateNodesState(): Unit = js.native
    
    def zoomBehavior(): Any = js.native
    def zoomBehavior(value: Any): this.type = js.native
    
    def zoomIn(): Unit = js.native
    
    def zoomOut(): Unit = js.native
    
    def zoomTreeBounds(params: Params): Unit = js.native
    
    def zoomed(event: Any, node: HierarchyNode[Datum]): Unit = js.native
  }
  
  type Connection = Any
  
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
    
    def centerTransform(params: CenterX): String
    
    // CSS transform
    var compactDimension: Reverse[Datum]
    
    def compactLinkMidX(node: HierarchyNode[Datum], state: State[Datum]): Double
    
    def compactLinkMidY(node: HierarchyNode[Datum], state: State[Datum]): Double
    
    // CSS transform
    var diagonal: Any
    
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
    
    // swaps x and y coordinates
    def nodeUpdateTransform(params: widthnumberheightnumberPo): String
    
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
      diagonal: Any,
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
      val __obj = js.Dynamic.literal(buttonX = js.Any.fromFunction1(buttonX), buttonY = js.Any.fromFunction1(buttonY), centerTransform = js.Any.fromFunction1(centerTransform), compactDimension = compactDimension.asInstanceOf[js.Any], compactLinkMidX = js.Any.fromFunction2(compactLinkMidX), compactLinkMidY = js.Any.fromFunction2(compactLinkMidY), diagonal = diagonal.asInstanceOf[js.Any], linkCompactXStart = js.Any.fromFunction1(linkCompactXStart), linkCompactYStart = js.Any.fromFunction1(linkCompactYStart), linkJoinX = js.Any.fromFunction1(linkJoinX), linkJoinY = js.Any.fromFunction1(linkJoinY), linkParentX = js.Any.fromFunction1(linkParentX), linkParentY = js.Any.fromFunction1(linkParentY), linkX = js.Any.fromFunction1(linkX), linkY = js.Any.fromFunction1(linkY), nodeBottomY = js.Any.fromFunction1(nodeBottomY), nodeFlexSize = js.Any.fromFunction1(nodeFlexSize), nodeJoinX = js.Any.fromFunction1(nodeJoinX), nodeJoinY = js.Any.fromFunction1(nodeJoinY), nodeLeftX = js.Any.fromFunction1(nodeLeftX), nodeRightX = js.Any.fromFunction1(nodeRightX), nodeTopY = js.Any.fromFunction1(nodeTopY), nodeUpdateTransform = js.Any.fromFunction1(nodeUpdateTransform), swap = js.Any.fromFunction1(swap), zoomTransform = js.Any.fromFunction1(zoomTransform))
      __obj.asInstanceOf[LayoutBinding[Datum]]
    }
    
    extension [Self <: LayoutBinding[?], Datum](x: Self & LayoutBinding[Datum]) {
      
      inline def setButtonX(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "buttonX", js.Any.fromFunction1(value))
      
      inline def setButtonY(value: HierarchyNode[Datum] => Double): Self = StObject.set(x, "buttonY", js.Any.fromFunction1(value))
      
      inline def setCenterTransform(value: CenterX => String): Self = StObject.set(x, "centerTransform", js.Any.fromFunction1(value))
      
      inline def setCompactDimension(value: Reverse[Datum]): Self = StObject.set(x, "compactDimension", value.asInstanceOf[js.Any])
      
      inline def setCompactLinkMidX(value: (HierarchyNode[Datum], State[Datum]) => Double): Self = StObject.set(x, "compactLinkMidX", js.Any.fromFunction2(value))
      
      inline def setCompactLinkMidY(value: (HierarchyNode[Datum], State[Datum]) => Double): Self = StObject.set(x, "compactLinkMidY", js.Any.fromFunction2(value))
      
      inline def setDiagonal(value: Any): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait State[Datum]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var backgroundColor: none
    
    var compact: Boolean
    
    var connections: js.Array[Connection]
    
    var container: String
    
    var ctx: CanvasRenderingContext2D
    
    var data: js.Array[Datum] | Null
    
    var defaultFont: String
    
    var defaultTextFill: String
    
    var duration: Double
    
    var expandLevel: Double
    
    var firstDraw: Boolean
    
    var id: String
    
    var lastTransform: K
    
    var nodeDefaultBackground: String
    
    def nodeId(d: Datum): NodeId
    
    def parentNodeId(d: Datum): NodeId
    
    var rootMargin: Double
    
    var scaleExtent: js.Tuple2[Double, Double]
    
    var setActiveNodeCentered: Boolean
    
    var svg: Selection_[SVGSVGElement, String, Null, Unit]
    
    var svgHeight: Double
    
    var svgWidth: Double
    
    var zoomBehavior: Null
  }
  object State {
    
    inline def apply[Datum](
      compact: Boolean,
      connections: js.Array[Connection],
      container: String,
      ctx: CanvasRenderingContext2D,
      defaultFont: String,
      defaultTextFill: String,
      duration: Double,
      expandLevel: Double,
      firstDraw: Boolean,
      id: String,
      lastTransform: K,
      nodeDefaultBackground: String,
      nodeId: Datum => NodeId,
      parentNodeId: Datum => NodeId,
      rootMargin: Double,
      scaleExtent: js.Tuple2[Double, Double],
      setActiveNodeCentered: Boolean,
      svg: Selection_[SVGSVGElement, String, Null, Unit],
      svgHeight: Double,
      svgWidth: Double,
      zoomBehavior: Null
    ): State[Datum] = {
      val __obj = js.Dynamic.literal(backgroundColor = "none", compact = compact.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], defaultFont = defaultFont.asInstanceOf[js.Any], defaultTextFill = defaultTextFill.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], expandLevel = expandLevel.asInstanceOf[js.Any], firstDraw = firstDraw.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastTransform = lastTransform.asInstanceOf[js.Any], nodeDefaultBackground = nodeDefaultBackground.asInstanceOf[js.Any], nodeId = js.Any.fromFunction1(nodeId), parentNodeId = js.Any.fromFunction1(parentNodeId), rootMargin = rootMargin.asInstanceOf[js.Any], scaleExtent = scaleExtent.asInstanceOf[js.Any], setActiveNodeCentered = setActiveNodeCentered.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], svgHeight = svgHeight.asInstanceOf[js.Any], svgWidth = svgWidth.asInstanceOf[js.Any], zoomBehavior = zoomBehavior.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[State[Datum]]
    }
    
    extension [Self <: State[?], Datum](x: Self & State[Datum]) {
      
      inline def setBackgroundColor(value: none): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultFont(value: String): Self = StObject.set(x, "defaultFont", value.asInstanceOf[js.Any])
      
      inline def setDefaultTextFill(value: String): Self = StObject.set(x, "defaultTextFill", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setExpandLevel(value: Double): Self = StObject.set(x, "expandLevel", value.asInstanceOf[js.Any])
      
      inline def setFirstDraw(value: Boolean): Self = StObject.set(x, "firstDraw", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastTransform(value: K): Self = StObject.set(x, "lastTransform", value.asInstanceOf[js.Any])
      
      inline def setNodeDefaultBackground(value: String): Self = StObject.set(x, "nodeDefaultBackground", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: Datum => NodeId): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setParentNodeId(value: Datum => NodeId): Self = StObject.set(x, "parentNodeId", js.Any.fromFunction1(value))
      
      inline def setRootMargin(value: Double): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setScaleExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scaleExtent", value.asInstanceOf[js.Any])
      
      inline def setSetActiveNodeCentered(value: Boolean): Self = StObject.set(x, "setActiveNodeCentered", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: Selection_[SVGSVGElement, String, Null, Unit]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgHeight(value: Double): Self = StObject.set(x, "svgHeight", value.asInstanceOf[js.Any])
      
      inline def setSvgWidth(value: Double): Self = StObject.set(x, "svgWidth", value.asInstanceOf[js.Any])
      
      inline def setZoomBehavior(value: Null): Self = StObject.set(x, "zoomBehavior", value.asInstanceOf[js.Any])
    }
  }
}
