package typings.chartJs.anon

import typings.chartJs.chartJsStrings.inherit
import typings.chartJs.chartJsStrings.initial
import typings.chartJs.chartJsStrings.italic
import typings.chartJs.chartJsStrings.normal
import typings.chartJs.chartJsStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var family: String
  
  var lineHeight: Double
  
  var size: Double
  
  var string: String
  
  var style: normal | inherit | italic | oblique | initial
  
  var weight: String
}
object LineHeight {
  
  inline def apply(
    family: String,
    lineHeight: Double,
    size: Double,
    string: String,
    style: normal | inherit | italic | oblique | initial,
    weight: String
  ): LineHeight = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeight] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: normal | inherit | italic | oblique | initial): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
