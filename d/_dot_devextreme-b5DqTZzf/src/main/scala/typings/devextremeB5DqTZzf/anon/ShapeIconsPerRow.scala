package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.collapsed
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.containers
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.disabled
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flowchart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.general
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.orgChart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeIconsPerRow extends StObject {
  
  /**
    * Lists toolbox groups.
    */
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]] = js.undefined
  
  /**
    * Specifies the number of shape icons in a row.
    */
  var shapeIconsPerRow: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the search box is visible.
    */
  var showSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the toolbar&apos;s visibility.
    */
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.undefined
  
  /**
    * Specifies the toolbox&apos;s width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeIconsPerRow {
  
  inline def apply(): ShapeIconsPerRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeIconsPerRow]
  }
  
  extension [Self <: ShapeIconsPerRow](x: Self) {
    
    inline def setGroups(value: js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: (general | flowchart | orgChart | containers | custom | DisplayMode)*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setShapeIconsPerRow(value: Double): Self = StObject.set(x, "shapeIconsPerRow", value.asInstanceOf[js.Any])
    
    inline def setShapeIconsPerRowUndefined: Self = StObject.set(x, "shapeIconsPerRow", js.undefined)
    
    inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
    
    inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
    
    inline def setVisibility(value: auto | visible | collapsed | disabled): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
