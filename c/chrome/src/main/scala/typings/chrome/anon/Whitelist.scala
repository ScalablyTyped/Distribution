package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Whitelist extends StObject {
  
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object Whitelist {
  
  @scala.inline
  def apply(): Whitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Whitelist]
  }
  
  @scala.inline
  implicit class WhitelistMutableBuilder[Self <: Whitelist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
