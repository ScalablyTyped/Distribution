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
  
  @scala.inline
  def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  
  @scala.inline
  implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any
        ])
    ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMatchVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mm.Pattern */ js.Any)*
    ): Self = StObject.set(x, "match", js.Array(value :_*))
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
