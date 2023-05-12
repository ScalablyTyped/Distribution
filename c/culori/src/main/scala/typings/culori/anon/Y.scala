package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var alpha: FixupUse
  
  var x: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var y: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
  
  var z: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object Y {
  
  inline def apply(
    alpha: FixupUse,
    x: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    y: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ],
    z: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): Y = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: FixupUse): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setX(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
