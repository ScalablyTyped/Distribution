package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ColorCodeField
import typings.devextremeB5DqTZzf.anon.HeaderHeight
import typings.devextremeB5DqTZzf.anon.Rect
import typings.devextremeB5DqTZzf.anon.SelectionStyle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.leftBottomRightTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.leftTopRightBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rightBottomLeftTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rightTopLeftBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sliceanddice
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.squarified
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.strip
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.ClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.DrillEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.HoverChangedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.NodesInitializedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.NodesRenderingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxTreeMap.SelectionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeMapOptions
  extends StObject
     with BaseWidgetOptions[dxTreeMap] {
  
  /**
    * Specifies the name of the data source field that provides nested items for a group. Applies to hierarchical data sources only.
    */
  var childrenField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides colors for tiles.
    */
  var colorField: js.UndefOr[String] = js.undefined
  
  /**
    * Manages the color settings.
    */
  var colorizer: js.UndefOr[ColorCodeField] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Configures groups.
    */
  var group: js.UndefOr[HeaderHeight] = js.undefined
  
  /**
    * Specifies whether tiles and groups change their style when a user pauses on them.
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides IDs for items. Applies to plain data sources only.
    */
  var idField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the user will interact with a single tile or its group.
    */
  var interactWithGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides texts for tile and group labels.
    */
  var labelField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the layout algorithm.
    */
  var layoutAlgorithm: js.UndefOr[sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, Any])] = js.undefined
  
  /**
    * Specifies the direction in which the items will be laid out.
    */
  var layoutDirection: js.UndefOr[
    leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom
  ] = js.undefined
  
  /**
    * Specifies how many hierarchical levels must be visualized.
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed when a node is clicked or tapped.
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ ClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a user drills up or down.
    */
  var onDrill: js.UndefOr[js.Function1[/* e */ DrillEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a node.
    */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ HoverChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed only once, after the nodes are initialized.
    */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ NodesInitializedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before the nodes are displayed and each time the collection of active nodes is changed.
    */
  var onNodesRendering: js.UndefOr[js.Function1[/* e */ NodesRenderingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a node is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides parent IDs for items. Applies to plain data sources only.
    */
  var parentField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a single or multiple nodes can be in the selected state simultaneously.
    */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  
  /**
    * Configures tiles.
    */
  var tile: js.UndefOr[SelectionStyle] = js.undefined
  
  /**
    * Configures tooltips - small pop-up rectangles that display information about a data-visualizing UI component element being pressed or hovered over with the mouse pointer.
    */
  @JSName("tooltip")
  var tooltip_dxTreeMapOptions: js.UndefOr[dxTreeMapTooltip] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides values for tiles.
    */
  var valueField: js.UndefOr[String] = js.undefined
}
object dxTreeMapOptions {
  
  inline def apply(): dxTreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeMapOptions]
  }
  
  extension [Self <: dxTreeMapOptions](x: Self) {
    
    inline def setChildrenField(value: String): Self = StObject.set(x, "childrenField", value.asInstanceOf[js.Any])
    
    inline def setChildrenFieldUndefined: Self = StObject.set(x, "childrenField", js.undefined)
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    inline def setColorizer(value: ColorCodeField): Self = StObject.set(x, "colorizer", value.asInstanceOf[js.Any])
    
    inline def setColorizerUndefined: Self = StObject.set(x, "colorizer", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setGroup(value: HeaderHeight): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
    
    inline def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
    
    inline def setInteractWithGroup(value: Boolean): Self = StObject.set(x, "interactWithGroup", value.asInstanceOf[js.Any])
    
    inline def setInteractWithGroupUndefined: Self = StObject.set(x, "interactWithGroup", js.undefined)
    
    inline def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
    
    inline def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
    
    inline def setLayoutAlgorithm(value: sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, Any])): Self = StObject.set(x, "layoutAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setLayoutAlgorithmFunction1(value: /* e */ Rect => Any): Self = StObject.set(x, "layoutAlgorithm", js.Any.fromFunction1(value))
    
    inline def setLayoutAlgorithmUndefined: Self = StObject.set(x, "layoutAlgorithm", js.undefined)
    
    inline def setLayoutDirection(value: leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
    
    inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setOnClick(value: (js.Function1[/* e */ ClickEvent, Unit]) | String): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(value: /* e */ ClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDrill(value: /* e */ DrillEvent => Unit): Self = StObject.set(x, "onDrill", js.Any.fromFunction1(value))
    
    inline def setOnDrillUndefined: Self = StObject.set(x, "onDrill", js.undefined)
    
    inline def setOnHoverChanged(value: /* e */ HoverChangedEvent => Unit): Self = StObject.set(x, "onHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnHoverChangedUndefined: Self = StObject.set(x, "onHoverChanged", js.undefined)
    
    inline def setOnNodesInitialized(value: /* e */ NodesInitializedEvent => Unit): Self = StObject.set(x, "onNodesInitialized", js.Any.fromFunction1(value))
    
    inline def setOnNodesInitializedUndefined: Self = StObject.set(x, "onNodesInitialized", js.undefined)
    
    inline def setOnNodesRendering(value: /* e */ NodesRenderingEvent => Unit): Self = StObject.set(x, "onNodesRendering", js.Any.fromFunction1(value))
    
    inline def setOnNodesRenderingUndefined: Self = StObject.set(x, "onNodesRendering", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setParentField(value: String): Self = StObject.set(x, "parentField", value.asInstanceOf[js.Any])
    
    inline def setParentFieldUndefined: Self = StObject.set(x, "parentField", js.undefined)
    
    inline def setSelectionMode(value: multiple | none | single_): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setTile(value: SelectionStyle): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    
    inline def setTooltip(value: dxTreeMapTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
