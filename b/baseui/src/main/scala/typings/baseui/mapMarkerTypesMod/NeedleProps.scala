package typings.baseui.mapMarkerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedleProps extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var overrides: FixedMarkerOverrides
  
  var size: NeedleSize
}
object NeedleProps {
  
  inline def apply(overrides: FixedMarkerOverrides, size: NeedleSize): NeedleProps = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeedleProps] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setOverrides(value: FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setSize(value: NeedleSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
