package typings.cucumber.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var preferForRegexpMatch: js.UndefOr[Boolean] = js.native
  
  var regexp: RegExp = js.native
  
  def transformer(arg: String*): js.Any = js.native
  
  var typeName: js.UndefOr[String] = js.native
  
  var useForSnippets: js.UndefOr[Boolean] = js.native
}
object Transform {
  
  @scala.inline
  def apply(regexp: RegExp, transformer: /* repeated */ String => js.Any): Transform = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    
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
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformer(value: /* repeated */ String => js.Any): Self = this.set("transformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreferForRegexpMatch(value: Boolean): Self = this.set("preferForRegexpMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferForRegexpMatch: Self = this.set("preferForRegexpMatch", js.undefined)
    
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("typeName", js.undefined)
    
    @scala.inline
    def setUseForSnippets(value: Boolean): Self = this.set("useForSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForSnippets: Self = this.set("useForSnippets", js.undefined)
  }
}
