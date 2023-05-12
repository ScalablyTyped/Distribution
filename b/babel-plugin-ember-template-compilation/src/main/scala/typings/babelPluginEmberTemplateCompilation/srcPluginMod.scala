package typings.babelPluginEmberTemplateCompilation

import typings.babelCore.mod.PluginObj
import typings.babelPluginEmberTemplateCompilation.anon.TypeofBabel
import typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.hbs
import typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.wire
import typings.babelPluginEmberTemplateCompilation.srcEmberTemplateCompilerMod.EmberTemplateCompiler
import typings.babelPluginEmberTemplateCompilation.srcJsUtilsMod.ExtendedPluginBuilder
import typings.babelPluginEmberTemplateCompilation.srcJsUtilsMod.State
import typings.babelPluginEmberTemplateCompilation.srcPublicTypesMod.LegacyModuleName
import typings.babelPluginEmberTemplateCompilation.srcScopeLocalsMod.ScopeLocals
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Expression
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(babel: TypeofBabel): PluginObj[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(babel.asInstanceOf[js.Any]).asInstanceOf[PluginObj[Any]]
  
  @JSImport("babel-plugin-ember-template-compilation/src/plugin", "JSUtils")
  @js.native
  open class JSUtils protected ()
    extends typings.babelPluginEmberTemplateCompilation.srcPublicTypesMod.JSUtils {
    def this(
      babel: TypeofBabel,
      state: State,
      template: NodePath[Expression],
      scopeLocals: ScopeLocals,
      importer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
    ) = this()
  }
  
  inline def makePlugin[EnvSpecificOptions](loadOptions: js.Function1[/* opts */ EnvSpecificOptions, Options]): js.Function1[/* babel */ TypeofBabel, PluginObj[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePlugin")(loadOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* babel */ TypeofBabel, PluginObj[Any]]]
  
  trait Options extends StObject {
    
    var compiler: EmberTemplateCompiler
    
    var enableLegacyModules: js.UndefOr[js.Array[LegacyModuleName]] = js.undefined
    
    var outputModuleOverrides: js.UndefOr[Record[String, Record[String, js.Tuple2[String, String]]]] = js.undefined
    
    var targetFormat: js.UndefOr[wire | hbs] = js.undefined
    
    var transforms: js.UndefOr[js.Array[ExtendedPluginBuilder]] = js.undefined
  }
  object Options {
    
    inline def apply(compiler: EmberTemplateCompiler): Options = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: EmberTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyModules(value: js.Array[LegacyModuleName]): Self = StObject.set(x, "enableLegacyModules", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyModulesUndefined: Self = StObject.set(x, "enableLegacyModules", js.undefined)
      
      inline def setEnableLegacyModulesVarargs(value: LegacyModuleName*): Self = StObject.set(x, "enableLegacyModules", js.Array(value*))
      
      inline def setOutputModuleOverrides(value: Record[String, Record[String, js.Tuple2[String, String]]]): Self = StObject.set(x, "outputModuleOverrides", value.asInstanceOf[js.Any])
      
      inline def setOutputModuleOverridesUndefined: Self = StObject.set(x, "outputModuleOverrides", js.undefined)
      
      inline def setTargetFormat(value: wire | hbs): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
      
      inline def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
      
      inline def setTransforms(value: js.Array[ExtendedPluginBuilder]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: ExtendedPluginBuilder*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
}
