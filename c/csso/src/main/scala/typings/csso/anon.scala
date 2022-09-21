package typings.csso

import typings.cssTree.mod.CssNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ast extends StObject {
    
    var ast: CssNode
  }
  object Ast {
    
    inline def apply(ast: CssNode): Ast = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ast]
    }
    
    extension [Self <: Ast](x: Self) {
      
      inline def setAst(value: CssNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    }
  }
  
  trait Classes extends StObject {
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Classes {
    
    inline def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
