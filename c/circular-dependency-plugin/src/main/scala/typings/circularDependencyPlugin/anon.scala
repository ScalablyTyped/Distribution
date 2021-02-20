package typings.circularDependencyPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Compilation extends StObject {
    
    var compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any = js.native
    
    var module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any = js.native
    
    var paths: js.Array[String] = js.native
  }
  object Compilation {
    
    @scala.inline
    def apply(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
      module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any,
      paths: js.Array[String]
    ): Compilation = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compilation]
    }
    
    @scala.inline
    implicit class CompilationMutableBuilder[Self <: Compilation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
      ): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any
      ): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CompilationAny extends StObject {
    
    var compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any = js.native
  }
  object CompilationAny {
    
    @scala.inline
    def apply(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    ): CompilationAny = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationAny]
    }
    
    @scala.inline
    implicit class CompilationAnyMutableBuilder[Self <: CompilationAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
      ): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    }
  }
}
