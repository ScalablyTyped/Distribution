package typings.codemirror.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on https://codemirror.net/demo/simplemode.html
trait Rule extends StObject {
  
  var dedent: js.UndefOr[Boolean] = js.undefined
  
  var dedentIfLineStart: js.UndefOr[Boolean] = js.undefined
  
  var indent: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[js.Any] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var pop: js.UndefOr[Boolean] = js.undefined
  
  var push: js.UndefOr[String] = js.undefined
  
  var regex: js.UndefOr[String | RegExp] = js.undefined
  
  var sol: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedent(value: Boolean): Self = StObject.set(x, "dedent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedentIfLineStart(value: Boolean): Self = StObject.set(x, "dedentIfLineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedentIfLineStartUndefined: Self = StObject.set(x, "dedentIfLineStart", js.undefined)
    
    @scala.inline
    def setDedentUndefined: Self = StObject.set(x, "dedent", js.undefined)
    
    @scala.inline
    def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setRegex(value: String | RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setSol(value: Boolean): Self = StObject.set(x, "sol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolUndefined: Self = StObject.set(x, "sol", js.undefined)
    
    @scala.inline
    def setToken(value: String | js.Array[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNull: Self = StObject.set(x, "token", null)
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setTokenVarargs(value: String*): Self = StObject.set(x, "token", js.Array(value :_*))
  }
}
