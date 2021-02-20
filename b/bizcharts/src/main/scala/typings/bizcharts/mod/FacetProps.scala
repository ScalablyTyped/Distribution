package typings.bizcharts.mod

import typings.bizcharts.anon.OffsetX
import typings.bizcharts.anon.OffsetY
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetProps
  extends Props[js.Any] {
  
  var autoSetAxis: js.UndefOr[Boolean] = js.native
  
  var colTitle: js.UndefOr[OffsetY] = js.native
  
  var eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var fields: js.UndefOr[String | js.Array[_]] = js.native
  
  var margin: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var rowTitle: js.UndefOr[OffsetX] = js.native
  
  var showTitle: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[FacetType] = js.native
}
object FacetProps {
  
  @scala.inline
  def apply(): FacetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetProps]
  }
  
  @scala.inline
  implicit class FacetPropsMutableBuilder[Self <: FacetProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSetAxis(value: Boolean): Self = StObject.set(x, "autoSetAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSetAxisUndefined: Self = StObject.set(x, "autoSetAxis", js.undefined)
    
    @scala.inline
    def setColTitle(value: OffsetY): Self = StObject.set(x, "colTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColTitleUndefined: Self = StObject.set(x, "colTitle", js.undefined)
    
    @scala.inline
    def setEachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachView", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachViewUndefined: Self = StObject.set(x, "eachView", js.undefined)
    
    @scala.inline
    def setFields(value: String | js.Array[_]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setRowTitle(value: OffsetX): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setType(value: FacetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
