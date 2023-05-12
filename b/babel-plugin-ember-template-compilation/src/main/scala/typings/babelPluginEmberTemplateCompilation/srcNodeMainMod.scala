package typings.babelPluginEmberTemplateCompilation

import org.scalablytyped.runtime.Shortcut
import typings.babelCore.mod.PluginObj
import typings.babelPluginEmberTemplateCompilation.anon.BaseDir
import typings.babelPluginEmberTemplateCompilation.anon.TypeofBabel
import typings.babelPluginEmberTemplateCompilation.anon.TypeofimportedCore
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

object srcNodeMainMod extends Shortcut {
  
  @JSImport("babel-plugin-ember-template-compilation/src/node-main", JSImport.Default)
  @js.native
  val default: (js.Function1[/* babel */ TypeofimportedCore, PluginObj[Any]]) & BaseDir = js.native
  
  @JSImport("babel-plugin-ember-template-compilation/src/node-main", "JSUtils")
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
  
  /* Inlined std.Omit<babel-plugin-ember-template-compilation.babel-plugin-ember-template-compilation/src/plugin.Options, 'transforms' | 'compiler'> & {  compilerPath :string | undefined,   compiler :babel-plugin-ember-template-compilation.babel-plugin-ember-template-compilation/src/ember-template-compiler.EmberTemplateCompiler | undefined,   transforms :std.Array<babel-plugin-ember-template-compilation.babel-plugin-ember-template-compilation/src/node-main.Transform> | undefined} */
  trait Options extends StObject {
    
    var compiler: js.UndefOr[EmberTemplateCompiler] = js.undefined
    
    var compilerPath: js.UndefOr[String] = js.undefined
    
    var enableLegacyModules: js.UndefOr[js.Array[LegacyModuleName]] = js.undefined
    
    var outputModuleOverrides: js.UndefOr[Record[String, Record[String, js.Tuple2[String, String]]]] = js.undefined
    
    var targetFormat: js.UndefOr[wire | hbs] = js.undefined
    
    var transforms: js.UndefOr[js.Array[Transform]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: EmberTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerPath(value: String): Self = StObject.set(x, "compilerPath", value.asInstanceOf[js.Any])
      
      inline def setCompilerPathUndefined: Self = StObject.set(x, "compilerPath", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setEnableLegacyModules(value: js.Array[LegacyModuleName]): Self = StObject.set(x, "enableLegacyModules", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyModulesUndefined: Self = StObject.set(x, "enableLegacyModules", js.undefined)
      
      inline def setEnableLegacyModulesVarargs(value: LegacyModuleName*): Self = StObject.set(x, "enableLegacyModules", js.Array(value*))
      
      inline def setOutputModuleOverrides(value: Record[String, Record[String, js.Tuple2[String, String]]]): Self = StObject.set(x, "outputModuleOverrides", value.asInstanceOf[js.Any])
      
      inline def setOutputModuleOverridesUndefined: Self = StObject.set(x, "outputModuleOverrides", js.undefined)
      
      inline def setTargetFormat(value: wire | hbs): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
      
      inline def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  type Transform = ExtendedPluginBuilder | String | (js.Tuple2[String, Any])
  
  type _To = (js.Function1[/* babel */ TypeofimportedCore, PluginObj[Any]]) & BaseDir
  
  /* This means you don't have to write `default`, but can instead just say `srcNodeMainMod.foo` */
  override def _to: (js.Function1[/* babel */ TypeofimportedCore, PluginObj[Any]]) & BaseDir = default
}
