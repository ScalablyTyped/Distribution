package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.area
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bubble
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dot
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.image
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.line
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.marker
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pie
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.MapLayerElement
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.PaletteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidth extends StObject {
  
  /**
    * Specifies a color for the border of the layer elements.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the line width (for layers of a line type) or width of the layer elements border in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color for layer elements.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the field that provides data to be used for coloring of layer elements.
    */
  var colorGroupingField: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to paint layer elements with similar attributes in the same color.
    */
  var colorGroups: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A function that customizes each layer element individually.
    */
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], Unit]] = js.undefined
  
  /**
    * Specifies the name of the attribute containing marker data. Setting this property makes sense only if the layer type is &apos;marker&apos; and the elementType is &apos;bubble&apos;, &apos;pie&apos; or &apos;image&apos;.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a data source for the layer.
    */
  var dataSource: js.UndefOr[js.Object | (DataSourceLike[Any, Any])] = js.undefined
  
  /**
    * Specifies the type of a marker element. Setting this property makes sense only if the layer type is &apos;marker&apos;.
    */
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.undefined
  
  /**
    * Specifies whether or not to change the appearance of a layer element when it is hovered over.
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a color for the border of the layer element when it is hovered over.
    */
  var hoveredBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the pixel-measured line width (for layers of a line type) or width for the border of the layer element when it is hovered over.
    */
  var hoveredBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color for a layer element when it is hovered over.
    */
  var hoveredColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies marker label properties.
    */
  var label: js.UndefOr[DataField] = js.undefined
  
  /**
    * Specifies the pixel-measured diameter of the marker that represents the biggest value. Setting this property makes sense only if the layer type is &apos;marker&apos;.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the pixel-measured diameter of the marker that represents the smallest value. Setting this property makes sense only if the layer type is &apos;marker&apos;.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the layer name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the layer opacity (from 0 to 1).
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of a predefined palette or a custom range of colors to be used as a palette.
    */
  var palette: js.UndefOr[js.Array[String] | PaletteType] = js.undefined
  
  /**
    * The position of a color in the palette[] array. Should not exceed the value of the paletteSize property.
    */
  var paletteIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the number of colors in a palette.
    */
  var paletteSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color for the border of the layer element when it is selected.
    */
  var selectedBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a pixel-measured line width (for layers of a line type) or width for the border of the layer element when it is selected.
    */
  var selectedBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color for the layer element when it is selected.
    */
  var selectedColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether single or multiple map elements can be selected on a vector map.
    */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  
  /**
    * Specifies the size of markers. Setting this property makes sense only if the layer type is &apos;marker&apos; and the elementType is &apos;dot&apos;, &apos;pie&apos; or &apos;image&apos;.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the field that provides data to be used for sizing bubble markers. Setting this property makes sense only if the layer type is &apos;marker&apos; and the elementType is &apos;bubble&apos;.
    */
  var sizeGroupingField: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to display bubbles with similar attributes in the same size. Setting this property makes sense only if the layer type is &apos;marker&apos; and the elementType is &apos;bubble&apos;.
    */
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies layer type.
    */
  var `type`: js.UndefOr[area | line | marker] = js.undefined
}
object BorderWidth {
  
  inline def apply(): BorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidth]
  }
  
  extension [Self <: BorderWidth](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorGroupingField(value: String): Self = StObject.set(x, "colorGroupingField", value.asInstanceOf[js.Any])
    
    inline def setColorGroupingFieldUndefined: Self = StObject.set(x, "colorGroupingField", js.undefined)
    
    inline def setColorGroups(value: js.Array[Double]): Self = StObject.set(x, "colorGroups", value.asInstanceOf[js.Any])
    
    inline def setColorGroupsUndefined: Self = StObject.set(x, "colorGroups", js.undefined)
    
    inline def setColorGroupsVarargs(value: Double*): Self = StObject.set(x, "colorGroups", js.Array(value*))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCustomize(value: /* elements */ js.Array[MapLayerElement] => Unit): Self = StObject.set(x, "customize", js.Any.fromFunction1(value))
    
    inline def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataSource(value: js.Object | (DataSourceLike[Any, Any])): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setElementType(value: bubble | dot | image | pie): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setHoveredBorderColor(value: String): Self = StObject.set(x, "hoveredBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoveredBorderColorUndefined: Self = StObject.set(x, "hoveredBorderColor", js.undefined)
    
    inline def setHoveredBorderWidth(value: Double): Self = StObject.set(x, "hoveredBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoveredBorderWidthUndefined: Self = StObject.set(x, "hoveredBorderWidth", js.undefined)
    
    inline def setHoveredColor(value: String): Self = StObject.set(x, "hoveredColor", value.asInstanceOf[js.Any])
    
    inline def setHoveredColorUndefined: Self = StObject.set(x, "hoveredColor", js.undefined)
    
    inline def setLabel(value: DataField): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPalette(value: js.Array[String] | PaletteType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteIndex(value: Double): Self = StObject.set(x, "paletteIndex", value.asInstanceOf[js.Any])
    
    inline def setPaletteIndexUndefined: Self = StObject.set(x, "paletteIndex", js.undefined)
    
    inline def setPaletteSize(value: Double): Self = StObject.set(x, "paletteSize", value.asInstanceOf[js.Any])
    
    inline def setPaletteSizeUndefined: Self = StObject.set(x, "paletteSize", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setSelectedBorderColor(value: String): Self = StObject.set(x, "selectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderColorUndefined: Self = StObject.set(x, "selectedBorderColor", js.undefined)
    
    inline def setSelectedBorderWidth(value: Double): Self = StObject.set(x, "selectedBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSelectedBorderWidthUndefined: Self = StObject.set(x, "selectedBorderWidth", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSelectionMode(value: multiple | none | single_): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupingField(value: String): Self = StObject.set(x, "sizeGroupingField", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupingFieldUndefined: Self = StObject.set(x, "sizeGroupingField", js.undefined)
    
    inline def setSizeGroups(value: js.Array[Double]): Self = StObject.set(x, "sizeGroups", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupsUndefined: Self = StObject.set(x, "sizeGroups", js.undefined)
    
    inline def setSizeGroupsVarargs(value: Double*): Self = StObject.set(x, "sizeGroups", js.Array(value*))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: area | line | marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
