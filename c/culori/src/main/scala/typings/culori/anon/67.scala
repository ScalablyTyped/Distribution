package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  @JSName("rgb")
  def rgb_0(
    c: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof convertRgbToXyz50>[0] */ js.Any
  ): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof convertLuvToLchuv */ js.Any
  ]
}
object `67` {
  
  inline def apply(
    rgb: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof convertRgbToXyz50>[0] */ js.Any => ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof convertLuvToLchuv */ js.Any
    ]
  ): `67` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `67`] (val x: Self) extends AnyVal {
    
    inline def setRgb(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<typeof convertRgbToXyz50>[0] */ js.Any => ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof convertLuvToLchuv */ js.Any
        ]
    ): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
