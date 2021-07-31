package typings.csso

import org.scalablytyped.runtime.Instantiable0
import typings.cssTree.mod.CssNode
import typings.cssTree.mod.CssNodePlain
import typings.cssTree.mod.DefinitionSyntax_
import typings.cssTree.mod.EnterOrLeaveFn
import typings.cssTree.mod.FindFn
import typings.cssTree.mod.GenerateOptions
import typings.cssTree.mod.Keyword_
import typings.cssTree.mod.ParseOptions
import typings.cssTree.mod.Property_
import typings.cssTree.mod.WalkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ast extends StObject {
    
    var ast: CssNode
  }
  object Ast {
    
    @scala.inline
    def apply(ast: CssNode): Ast = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ast]
    }
    
    @scala.inline
    implicit class AstMutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: CssNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    }
  }
  
  trait Classes extends StObject {
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Classes {
    
    @scala.inline
    def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Typeofcsstree extends StObject {
    
    var List: Instantiable0[typings.cssTree.mod.List[js.Object]] = js.native
    
    def clone(node: CssNode): CssNode = js.native
    
    val definitionSyntax: DefinitionSyntax_ = js.native
    
    def find(ast: CssNode, fn: FindFn): CssNode = js.native
    
    def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = js.native
    
    def findLast(ast: CssNode, fn: FindFn): CssNode = js.native
    
    def fromPlainObject(node: CssNodePlain): CssNode = js.native
    
    def generate(ast: CssNode): String = js.native
    def generate(ast: CssNode, options: GenerateOptions): String = js.native
    
    def keyword(value: String): Keyword_ = js.native
    
    def parse(text: String): CssNode = js.native
    def parse(text: String, options: ParseOptions): CssNode = js.native
    
    def property(value: String): Property_ = js.native
    
    def toPlainObject(node: CssNode): CssNodePlain = js.native
    
    def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = js.native
    def walk(ast: CssNode, options: WalkOptions): Unit = js.native
  }
}
