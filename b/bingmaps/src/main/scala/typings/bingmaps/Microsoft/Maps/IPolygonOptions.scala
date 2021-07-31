package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolygonOptions
  extends StObject
     with IPolylineOptions {
  
  /** CSS string or Color object as the polygon's filling color. */
  var fillColor: js.UndefOr[String | Color] = js.undefined
}
object IPolygonOptions {
  
  @scala.inline
  def apply(): IPolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolygonOptions]
  }
  
  @scala.inline
  implicit class IPolygonOptionsMutableBuilder[Self <: IPolygonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String | Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
  }
}
