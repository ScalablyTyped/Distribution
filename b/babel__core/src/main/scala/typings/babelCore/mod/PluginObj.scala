package typings.babelCore.mod

import typings.babelTraverse.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginObj[S] extends StObject {
  
  var inherits: js.UndefOr[js.Any] = js.undefined
  
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]] = js.undefined
  
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]] = js.undefined
  
  var visitor: Visitor[S]
}
object PluginObj {
  
  inline def apply[S](visitor: Visitor[S]): PluginObj[S] = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObj[S]]
  }
  
  extension [Self <: PluginObj[?], S](x: Self & PluginObj[S]) {
    
    inline def setInherits(value: js.Any): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def setManipulateOptions(value: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit): Self = StObject.set(x, "manipulateOptions", js.Any.fromFunction2(value))
    
    inline def setManipulateOptionsUndefined: Self = StObject.set(x, "manipulateOptions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPost(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPre(value: js.ThisFunction1[/* this */ S, /* file */ BabelFile, Unit]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setVisitor(value: Visitor[S]): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
  }
}
