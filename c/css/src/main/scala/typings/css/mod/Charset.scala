package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charset
  extends StObject
     with Node
     with AtRule {
  
  /** The part following @charset. */
  var charset: js.UndefOr[String] = js.undefined
}
object Charset {
  
  inline def apply(): Charset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charset]
  }
  
  extension [Self <: Charset](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
  }
}
