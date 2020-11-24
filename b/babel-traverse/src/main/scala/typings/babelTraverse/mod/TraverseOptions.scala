package typings.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraverseOptions[S] extends Visitor[S] {
  
  var noScope: js.UndefOr[Boolean] = js.native
  
  var scope: js.UndefOr[Scope] = js.native
}
object TraverseOptions {
  
  @scala.inline
  def apply[S](): TraverseOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraverseOptions[S]]
  }
  
  @scala.inline
  implicit class TraverseOptionsOps[Self <: TraverseOptions[_], S] (val x: Self with TraverseOptions[S]) extends AnyVal {
    
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
    def setNoScope(value: Boolean): Self = this.set("noScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoScope: Self = this.set("noScope", js.undefined)
    
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
