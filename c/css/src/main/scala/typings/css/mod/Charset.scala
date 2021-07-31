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
  
  @scala.inline
  def apply(): Charset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charset]
  }
  
  @scala.inline
  implicit class CharsetMutableBuilder[Self <: Charset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
  }
}
