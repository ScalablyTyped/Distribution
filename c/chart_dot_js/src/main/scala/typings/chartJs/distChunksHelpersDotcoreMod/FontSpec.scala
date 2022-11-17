package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSpec extends StObject {
  
  /**
    * Default font family for all text, follows CSS font-family options.
    * @default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
    */
  var family: String
  
  /**
    * Height of an individual line of text (see MDN).
    * @default 1.2
    */
  var lineHeight: Double | String
  
  /**
    * Default font size (in px) for text. Does not apply to radialLinear scale point labels.
    * @default 12
    */
  var size: Double
  
  /**
    * Default font style. Does not apply to tooltip title or footer. Does not apply to chart title. Follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit)
    * @default 'normal'
    */
  var style: "normal" | "italic" | "oblique" | "initial" | "inherit"
  
  /**
    * Default font weight (boldness). (see MDN).
    */
  var weight: String | Null
}
object FontSpec {
  
  inline def apply(
    family: String,
    lineHeight: Double | String,
    size: Double,
    style: "normal" | "italic" | "oblique" | "initial" | "inherit"
  ): FontSpec = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = null)
    __obj.asInstanceOf[FontSpec]
  }
  
  extension [Self <: FontSpec](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: "normal" | "italic" | "oblique" | "initial" | "inherit"): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
  }
}
