package typings.bizcharts.mod

import typings.bizcharts.anon.OffsetX
import typings.bizcharts.anon.OffsetY
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetProps
  extends StObject
     with Props[js.Any] {
  
  var autoSetAxis: js.UndefOr[Boolean] = js.undefined
  
  var colTitle: js.UndefOr[OffsetY] = js.undefined
  
  var eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var fields: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var rowTitle: js.UndefOr[OffsetX] = js.undefined
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[FacetType] = js.undefined
}
object FacetProps {
  
  inline def apply(): FacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetProps]
  }
  
  extension [Self <: FacetProps](x: Self) {
    
    inline def setAutoSetAxis(value: Boolean): Self = StObject.set(x, "autoSetAxis", value.asInstanceOf[js.Any])
    
    inline def setAutoSetAxisUndefined: Self = StObject.set(x, "autoSetAxis", js.undefined)
    
    inline def setColTitle(value: OffsetY): Self = StObject.set(x, "colTitle", value.asInstanceOf[js.Any])
    
    inline def setColTitleUndefined: Self = StObject.set(x, "colTitle", js.undefined)
    
    inline def setEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachView", js.Any.fromFunction2(value))
    
    inline def setEachViewUndefined: Self = StObject.set(x, "eachView", js.undefined)
    
    inline def setFields(value: String | js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setRowTitle(value: OffsetX): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    inline def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setType(value: FacetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
