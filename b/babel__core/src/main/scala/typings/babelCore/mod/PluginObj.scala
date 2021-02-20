package typings.babelCore.mod

import typings.babelTraverse.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginObj[S] extends StObject {
  
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
  implicit class PluginObjMutableBuilder[Self <: PluginObj[_], S] (val x: Self with PluginObj[S]) extends AnyVal {
    
    @scala.inline
    def setInherits(value: js.Any): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    @scala.inline
    def setManipulateOptions(value: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit): Self = StObject.set(x, "manipulateOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setManipulateOptionsUndefined: Self = StObject.set(x, "manipulateOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPost(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPre(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    @scala.inline
    def setVisitor(value: Visitor[S]): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
  }
}
