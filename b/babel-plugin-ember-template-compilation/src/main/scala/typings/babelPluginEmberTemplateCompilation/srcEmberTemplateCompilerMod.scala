package typings.babelPluginEmberTemplateCompilation

import typings.babelPluginEmberTemplateCompilation.anon.Ast
import typings.babelPluginEmberTemplateCompilation.anon.EntityEncoding
import typings.babelPluginEmberTemplateCompilation.anon.IgnoreStandalone
import typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.codemod
import typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.precompile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEmberTemplateCompilerMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/ember-template-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertTemplateCompiler(emberTemplateCompiler: Any): /* asserts emberTemplateCompiler is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-plugin-ember-template-compilation), TsIdentModule(None,List(babel-plugin-ember-template-compilation, src, ember-template-compiler)), TsIdentSimple(EmberTemplateCompiler))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTemplateCompiler")(emberTemplateCompiler.asInstanceOf[js.Any]).asInstanceOf[/* asserts emberTemplateCompiler is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(babel-plugin-ember-template-compilation), TsIdentModule(None,List(babel-plugin-ember-template-compilation, src, ember-template-compiler)), TsIdentSimple(EmberTemplateCompiler))),IArray())*/ Boolean]
  
  @js.native
  trait EmberTemplateCompiler extends StObject {
    
    def _buildCompileOptions(options: PreprocessOptions): PreprocessOptions = js.native
    
    def _preprocess(src: String): Any = js.native
    def _preprocess(src: String, options: PreprocessOptions): Any = js.native
    
    def _print(
      ast: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ASTv1.Template */ Any
    ): String = js.native
    def _print(
      ast: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ASTv1.Template */ Any,
      options: EntityEncoding
    ): String = js.native
    
    def precompile(templateString: String, options: PreprocessOptions): String = js.native
  }
  
  trait PreprocessOptions extends StObject {
    
    var contents: String
    
    var filename: js.UndefOr[String] = js.undefined
    
    var locals: js.UndefOr[js.Array[String]] = js.undefined
    
    var mode: js.UndefOr[codemod | precompile] = js.undefined
    
    var moduleName: String
    
    var parseOptions: js.UndefOr[IgnoreStandalone] = js.undefined
    
    var plugins: js.UndefOr[Ast] = js.undefined
    
    var strictMode: js.UndefOr[Boolean] = js.undefined
  }
  object PreprocessOptions {
    
    inline def apply(contents: String, moduleName: String): PreprocessOptions = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreprocessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreprocessOptions] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLocals(value: js.Array[String]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setLocalsVarargs(value: String*): Self = StObject.set(x, "locals", js.Array(value*))
      
      inline def setMode(value: codemod | precompile): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setParseOptions(value: IgnoreStandalone): Self = StObject.set(x, "parseOptions", value.asInstanceOf[js.Any])
      
      inline def setParseOptionsUndefined: Self = StObject.set(x, "parseOptions", js.undefined)
      
      inline def setPlugins(value: Ast): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
    }
  }
}
