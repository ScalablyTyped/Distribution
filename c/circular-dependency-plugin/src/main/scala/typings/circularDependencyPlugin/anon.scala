package typings.circularDependencyPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compilation extends StObject {
    
    var compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    
    var module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any
    
    var paths: js.Array[String]
  }
  object Compilation {
    
    inline def apply(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
      module: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any,
      paths: js.Array[String]
    ): Compilation = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compilation]
    }
    
    extension [Self <: Compilation](x: Self) {
      
      inline def setCompilation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
      ): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setModule(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any
      ): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  trait CompilationAny extends StObject {
    
    var compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
  }
  object CompilationAny {
    
    inline def apply(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    ): CompilationAny = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationAny]
    }
    
    extension [Self <: CompilationAny](x: Self) {
      
      inline def setCompilation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
      ): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    }
  }
}
