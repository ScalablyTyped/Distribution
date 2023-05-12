package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixupUse extends StObject {
  
  def fixup(arr: js.Array[js.UndefOr[Double | Unit]]): js.Array[Unit]
  @JSName("fixup")
  var fixup_Original: FnCall
  
  var use: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
  ]
}
object FixupUse {
  
  inline def apply(
    fixup: FnCall,
    use: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
    ]
  ): FixupUse = {
    val __obj = js.Dynamic.literal(fixup = fixup.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixupUse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixupUse] (val x: Self) extends AnyVal {
    
    inline def setFixup(value: FnCall): Self = StObject.set(x, "fixup", value.asInstanceOf[js.Any])
    
    inline def setUse(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof interpolatorPiecewise */ js.Any
        ]
    ): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
  }
}
