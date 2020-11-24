package typings.circularDependencyPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compilation extends js.Object {
  
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
  implicit class CompilationOps[Self <: Compilation] (val x: Self) extends AnyVal {
    
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
    def setCompilation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    ): Self = this.set("compilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ js.Any
    ): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
