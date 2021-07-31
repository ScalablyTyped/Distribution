package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scripts extends StObject {
  
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
}
object Scripts {
  
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  @scala.inline
  implicit class ScriptsMutableBuilder[Self <: Scripts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
  }
}
