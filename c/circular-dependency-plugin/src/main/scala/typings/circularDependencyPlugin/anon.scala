package typings.circularDependencyPlugin

import typings.webpack.mod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compilation extends StObject {
    
    var compilation: typings.webpack.mod.Compilation
    
    var module: Module
    
    var paths: js.Array[String]
  }
  object Compilation {
    
    inline def apply(compilation: typings.webpack.mod.Compilation, module: Module, paths: js.Array[String]): Compilation = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compilation]
    }
    
    extension [Self <: Compilation](x: Self) {
      
      inline def setCompilation(value: typings.webpack.mod.Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  trait CompilationCompilation extends StObject {
    
    var compilation: typings.webpack.mod.Compilation
  }
  object CompilationCompilation {
    
    inline def apply(compilation: typings.webpack.mod.Compilation): CompilationCompilation = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationCompilation]
    }
    
    extension [Self <: CompilationCompilation](x: Self) {
      
      inline def setCompilation(value: typings.webpack.mod.Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    }
  }
}
