package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Short
  extends StObject
     with ShapeDef
     with Shape {
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("type")
  val type_Short: short
}
object Short {
  
  @scala.inline
  def apply(): Short = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[Short]
  }
  
  @scala.inline
  implicit class ShortMutableBuilder[Self <: Short] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
