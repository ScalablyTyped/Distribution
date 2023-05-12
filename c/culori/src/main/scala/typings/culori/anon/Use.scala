package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Use extends StObject {
  
  def fixup(arr: js.Array[Double]): js.Array[Double]
  @JSName("fixup")
  var fixup_Original: js.Function1[/* arr */ js.Array[Double], js.Array[Double]]
  
  var use: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object Use {
  
  inline def apply(
    fixup: /* arr */ js.Array[Double] => js.Array[Double],
    use: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): Use = {
    val __obj = js.Dynamic.literal(fixup = js.Any.fromFunction1(fixup), use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Use]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Use] (val x: Self) extends AnyVal {
    
    inline def setFixup(value: /* arr */ js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "fixup", js.Any.fromFunction1(value))
    
    inline def setUse(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
  }
}
