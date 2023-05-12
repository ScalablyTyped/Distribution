package typings.babelPluginEmberTemplateCompilation

import typings.babelPluginEmberTemplateCompilation.anon.TypeofBabel
import typings.babelPluginEmberTemplateCompilation.srcJsUtilsMod.State
import typings.babelPluginEmberTemplateCompilation.srcScopeLocalsMod.ScopeLocals
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPublicTypesMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/public-types", "JSUtils")
  @js.native
  open class JSUtils protected ()
    extends typings.babelPluginEmberTemplateCompilation.srcJsUtilsMod.JSUtils {
    def this(
      babel: TypeofBabel,
      state: State,
      template: NodePath[Expression],
      scopeLocals: ScopeLocals,
      importer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
    ) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars`
    - typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars-inline-precompile`
    - typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`htmlbars-inline-precompile`
  */
  trait LegacyModuleName extends StObject
  object LegacyModuleName {
    
    inline def `ember-cli-htmlbars`: typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars` = "ember-cli-htmlbars".asInstanceOf[typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars`]
    
    inline def `ember-cli-htmlbars-inline-precompile`: typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars-inline-precompile` = "ember-cli-htmlbars-inline-precompile".asInstanceOf[typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`ember-cli-htmlbars-inline-precompile`]
    
    inline def `htmlbars-inline-precompile`: typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`htmlbars-inline-precompile` = "htmlbars-inline-precompile".asInstanceOf[typings.babelPluginEmberTemplateCompilation.babelPluginEmberTemplateCompilationStrings.`htmlbars-inline-precompile`]
  }
}
