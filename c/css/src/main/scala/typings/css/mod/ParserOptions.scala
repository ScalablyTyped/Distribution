package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions extends StObject {
  
  /** Silently fail on parse errors */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /** The path to the file containing css. Makes errors and source maps more helpful, by letting them know where code comes from. */
  var source: js.UndefOr[String] = js.undefined
}
object ParserOptions {
  
  inline def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
