package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaCH extends StObject {
  
  var alpha: FixupUse
  
  var c: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var h: Use
  
  var j: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object AlphaCH {
  
  inline def apply(
    alpha: FixupUse,
    c: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    h: Use,
    j: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): AlphaCH = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaCH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaCH] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setC(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setH(value: Use): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setJ(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}
