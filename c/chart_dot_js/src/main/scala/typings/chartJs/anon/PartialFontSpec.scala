package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chart.js.chart.js/dist/chunks/helpers.core.FontSpec> */
trait PartialFontSpec extends StObject {
  
  var family: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[Double | String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr["normal" | "italic" | "oblique" | "initial" | "inherit"] = js.undefined
  
  var weight: js.UndefOr[String | Null] = js.undefined
}
object PartialFontSpec {
  
  inline def apply(): PartialFontSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFontSpec]
  }
  
  extension [Self <: PartialFontSpec](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: "normal" | "italic" | "oblique" | "initial" | "inherit"): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
