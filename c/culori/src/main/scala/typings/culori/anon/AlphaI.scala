package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaI extends StObject {
  
  var alpha: FixupUse
  
  var i: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var q: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var y: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object AlphaI {
  
  inline def apply(
    alpha: FixupUse,
    i: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    q: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    y: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): AlphaI = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaI] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setI(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setQ(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setY(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
