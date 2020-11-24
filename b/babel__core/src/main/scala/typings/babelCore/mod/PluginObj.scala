package typings.babelCore.mod

import typings.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginObj[S] extends js.Object {
  
  var inherits: js.UndefOr[js.Any] = js.native
  
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]] = js.native
  
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]] = js.native
  
  var visitor: Visitor[S] = js.native
}
object PluginObj {
  
  @scala.inline
  def apply[S](visitor: Visitor[S]): PluginObj[S] = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObj[S]]
  }
  
  @scala.inline
  implicit class PluginObjOps[Self <: PluginObj[_], S] (val x: Self with PluginObj[S]) extends AnyVal {
    
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
    def setVisitor(value: Visitor[S]): Self = this.set("visitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: js.Any): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
    
    @scala.inline
    def setManipulateOptions(value: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit): Self = this.set("manipulateOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteManipulateOptions: Self = this.set("manipulateOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPost(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPre(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
}
