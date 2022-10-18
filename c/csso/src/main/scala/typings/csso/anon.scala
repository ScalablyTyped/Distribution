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
  
  trait Typeofident extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
  }
  object Typeofident {
    
    inline def apply(decode: String => String, encode: String => String): Typeofident = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Typeofident]
    }
    
    extension [Self <: Typeofident](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Typeofstring extends StObject {
    
    def decode(input: String): String = js.native
    
    def encode(input: String): String = js.native
    def encode(input: String, apostrophe: Boolean): String = js.native
  }
  
  trait Typeofurl extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
  }
  object Typeofurl {
    
    inline def apply(decode: String => String, encode: String => String): Typeofurl = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Typeofurl]
    }
    
    extension [Self <: Typeofurl](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
}
