package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.axis
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.domain
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.grid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labels
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ticks
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.title
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part extends StObject {
  
  var part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
  
  var vgProp: VgEncodeChannel
}
object Part {
  
  inline def apply(
    part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain,
    vgProp: VgEncodeChannel
  ): Part = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any], vgProp = vgProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  
  extension [Self <: Part](x: Self) {
    
    inline def setPart(
      value: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
    ): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setVgProp(value: VgEncodeChannel): Self = StObject.set(x, "vgProp", value.asInstanceOf[js.Any])
  }
}
