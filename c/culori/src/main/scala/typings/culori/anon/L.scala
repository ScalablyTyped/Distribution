package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L extends StObject {
  
  var alpha: FixupUse
  
  var h: Use
  
  var l: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var s: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object L {
  
  inline def apply(
    alpha: FixupUse,
    h: Use,
    l: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    s: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): L = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: L] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setH(value: Use): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setS(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
