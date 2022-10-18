package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var fontFamily: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(fontFamily = "'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setFontFamily(
      value: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
  }
}
