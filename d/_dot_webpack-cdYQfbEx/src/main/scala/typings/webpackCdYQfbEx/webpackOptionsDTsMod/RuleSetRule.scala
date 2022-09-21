package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.javascriptSlashauto
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.javascriptSlashdynamic
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.javascriptSlashesm
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.json
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.post
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.pre
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.webassemblySlashexperimental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSetRule extends StObject {
  
  /**
  	 * Match the child compiler name
  	 */
  var compiler: js.UndefOr[RuleSetConditionOrConditions] = js.undefined
  
  /**
  	 * Enforce this rule as pre or post step
  	 */
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  /**
  	 * Shortcut for resource.exclude
  	 */
  var exclude: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Shortcut for resource.include
  	 */
  var include: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Match the issuer of the module (The module pointing to this module)
  	 */
  var issuer: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Shortcut for use.loader
  	 */
  var loader: js.UndefOr[RuleSetLoader | RuleSetUse] = js.undefined
  
  /**
  	 * Shortcut for use.loader
  	 */
  var loaders: js.UndefOr[RuleSetUse] = js.undefined
  
  /**
  	 * Only execute the first matching rule in this array
  	 */
  var oneOf: js.UndefOr[RuleSetRules] = js.undefined
  
  /**
  	 * Shortcut for use.options
  	 */
  var options: js.UndefOr[RuleSetQuery] = js.undefined
  
  /**
  	 * Options for parsing
  	 */
  var parser: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Shortcut for use.query
  	 */
  var query: js.UndefOr[RuleSetQuery] = js.undefined
  
  /**
  	 * Match rules with custom resource name
  	 */
  var realResource: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Options for the resolver
  	 */
  var resolve: js.UndefOr[ResolveOptions] = js.undefined
  
  /**
  	 * Match the resource path of the module
  	 */
  var resource: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Match the resource query of the module
  	 */
  var resourceQuery: js.UndefOr[RuleSetConditionOrConditions] = js.undefined
  
  /**
  	 * Match and execute these rules when this rule is matched
  	 */
  var rules: js.UndefOr[RuleSetRules] = js.undefined
  
  /**
  	 * Flags a module as with or without side effects
  	 */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Shortcut for resource.test
  	 */
  var test: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.undefined
  
  /**
  	 * Module type to use for the module
  	 */
  var `type`: js.UndefOr[
    javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
  ] = js.undefined
  
  /**
  	 * Modifiers applied to the module when rule is matched
  	 */
  var use: js.UndefOr[RuleSetUse] = js.undefined
}
object RuleSetRule {
  
  inline def apply(): RuleSetRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSetRule]
  }
  
  extension [Self <: RuleSetRule](x: Self) {
    
    inline def setCompiler(value: RuleSetConditionOrConditions): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "compiler", js.Any.fromFunction1(value))
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setExclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setInclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIssuer(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuer", js.Any.fromFunction1(value))
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setLoader(value: RuleSetLoader | RuleSetUse): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLoaderVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "loader", js.Array(value*))
    
    inline def setLoaders(value: RuleSetUse): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    inline def setLoadersVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "loaders", js.Array(value*))
    
    inline def setOneOf(value: RuleSetRules): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: RuleSetRule*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setOptions(value: RuleSetQuery): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParser(value: StringDictionary[Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setQuery(value: RuleSetQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRealResource(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "realResource", value.asInstanceOf[js.Any])
    
    inline def setRealResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "realResource", js.Any.fromFunction1(value))
    
    inline def setRealResourceUndefined: Self = StObject.set(x, "realResource", js.undefined)
    
    inline def setResolve(value: ResolveOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setResource(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resource", js.Any.fromFunction1(value))
    
    inline def setResourceQuery(value: RuleSetConditionOrConditions): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceQuery", js.Any.fromFunction1(value))
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRules(value: RuleSetRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setTest(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setType(
      value: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: RuleSetUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
