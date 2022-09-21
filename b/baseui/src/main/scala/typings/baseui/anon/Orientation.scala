package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: baseui.anon.Readonlyreadonlyhorizonta[keyof baseui.anon.Readonlyreadonlyhorizonta] */ js.Any
  ] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  extension [Self <: Orientation](x: Self) {
    
    inline def set$orientation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.anon.Readonlyreadonlyhorizonta[keyof baseui.anon.Readonlyreadonlyhorizonta] */ js.Any
    ): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
