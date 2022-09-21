package typings.terserMCwkxx7L.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  var bare_returns: js.UndefOr[Boolean] = js.undefined
  
  var ecma: js.UndefOr[ECMA] = js.undefined
  
  var html5_comments: js.UndefOr[Boolean] = js.undefined
  
  var shebang: js.UndefOr[Boolean] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  extension [Self <: ParseOptions](x: Self) {
    
    inline def setBare_returns(value: Boolean): Self = StObject.set(x, "bare_returns", value.asInstanceOf[js.Any])
    
    inline def setBare_returnsUndefined: Self = StObject.set(x, "bare_returns", js.undefined)
    
    inline def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setHtml5_comments(value: Boolean): Self = StObject.set(x, "html5_comments", value.asInstanceOf[js.Any])
    
    inline def setHtml5_commentsUndefined: Self = StObject.set(x, "html5_comments", js.undefined)
    
    inline def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
    
    inline def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
  }
}
