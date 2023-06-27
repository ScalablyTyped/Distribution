package typings.codemirrorLangJavascript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Jsx extends StObject {
    
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    var typescript: js.UndefOr[Boolean] = js.undefined
  }
  object Jsx {
    
    inline def apply(): Jsx = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Jsx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jsx] (val x: Self) extends AnyVal {
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setTypescript(value: Boolean): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var path: js.Array[String]
  }
  object Name {
    
    inline def apply(name: String, path: js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
