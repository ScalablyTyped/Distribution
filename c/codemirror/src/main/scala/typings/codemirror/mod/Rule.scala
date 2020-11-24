package typings.codemirror.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on https://codemirror.net/demo/simplemode.html
@js.native
trait Rule extends js.Object {
  
  var dedent: js.UndefOr[Boolean] = js.native
  
  var dedentIfLineStart: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[js.Any] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var pop: js.UndefOr[Boolean] = js.native
  
  var push: js.UndefOr[String] = js.native
  
  var regex: js.UndefOr[String | RegExp] = js.native
  
  var sol: js.UndefOr[Boolean] = js.native
  
  var token: js.UndefOr[String | js.Array[String] | Null] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDedent(value: Boolean): Self = this.set("dedent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedent: Self = this.set("dedent", js.undefined)
    
    @scala.inline
    def setDedentIfLineStart(value: Boolean): Self = this.set("dedentIfLineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedentIfLineStart: Self = this.set("dedentIfLineStart", js.undefined)
    
    @scala.inline
    def setIndent(value: Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPop(value: Boolean): Self = this.set("pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setRegex(value: String | RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setSol(value: Boolean): Self = this.set("sol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSol: Self = this.set("sol", js.undefined)
    
    @scala.inline
    def setTokenVarargs(value: String*): Self = this.set("token", js.Array(value :_*))
    
    @scala.inline
    def setToken(value: String | js.Array[String]): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setTokenNull: Self = this.set("token", null)
  }
}
