package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsStrings.inherit
import typings.chartJs.chartJsStrings.initial
import typings.chartJs.chartJsStrings.italic
import typings.chartJs.chartJsStrings.normal
import typings.chartJs.chartJsStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFontSpec
  extends StObject
     with FontSpec {
  
  var string: String
}
object CanvasFontSpec {
  
  inline def apply(
    family: String,
    lineHeight: Double | String,
    size: Double,
    string: String,
    style: normal | italic | oblique | initial | inherit
  ): CanvasFontSpec = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = null)
    __obj.asInstanceOf[CanvasFontSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasFontSpec] (val x: Self) extends AnyVal {
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
