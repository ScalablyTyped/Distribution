package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var alpha: FixupUse
  
  var b: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var g: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var r: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object R {
  
  inline def apply(
    alpha: FixupUse,
    b: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    g: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    r: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): R = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setB(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
