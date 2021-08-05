package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamOptions extends StObject {
  
  var `match`: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any
    ])
  ] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
}
object StreamOptions {
  
  inline def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  
  extension [Self <: StreamOptions](x: Self) {
    
    inline def setMatch(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any
        ])
    ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatchVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any)*
    ): Self = StObject.set(x, "match", js.Array(value :_*))
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
