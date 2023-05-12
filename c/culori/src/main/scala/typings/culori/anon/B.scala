package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B extends StObject {
  
  var a: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var alpha: FixupUse
  
  var b: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var l: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object B {
  
  inline def apply(
    a: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    alpha: FixupUse,
    b: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    l: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): B = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: B] (val x: Self) extends AnyVal {
    
    inline def setA(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setB(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
