package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontEdgingEnumValues
  extends StObject
     with EmbindEnum {
  
  var Alias: FontEdging
  
  var AntiAlias: FontEdging
  
  var SubpixelAntiAlias: FontEdging
}
object FontEdgingEnumValues {
  
  @scala.inline
  def apply(Alias: FontEdging, AntiAlias: FontEdging, SubpixelAntiAlias: FontEdging, values: js.Array[Double]): FontEdgingEnumValues = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], AntiAlias = AntiAlias.asInstanceOf[js.Any], SubpixelAntiAlias = SubpixelAntiAlias.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontEdgingEnumValues]
  }
  
  @scala.inline
  implicit class FontEdgingEnumValuesMutableBuilder[Self <: FontEdgingEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: FontEdging): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAlias(value: FontEdging): Self = StObject.set(x, "AntiAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubpixelAntiAlias(value: FontEdging): Self = StObject.set(x, "SubpixelAntiAlias", value.asInstanceOf[js.Any])
  }
}
