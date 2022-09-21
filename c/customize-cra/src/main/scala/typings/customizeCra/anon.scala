package typings.customizeCra

import org.scalablytyped.runtime.StringDictionary
import typings.customizeCra.customizeCraStrings.post
import typings.customizeCra.customizeCraStrings.pre
import typings.webpack.anon.Compiler
import typings.webpack.anon.Ident
import typings.webpack.mod.ResolveOptionsWebpackOptions
import typings.webpack.mod.RuleSetCondition
import typings.webpack.mod.RuleSetConditionAbsolute
import typings.webpack.mod.RuleSetConditionOrConditions
import typings.webpack.mod.RuleSetLogicalConditions
import typings.webpack.mod.RuleSetLogicalConditionsAbsolute
import typings.webpack.mod.RuleSetRule
import typings.webpack.mod.RuleSetUseItem
import typings.webpack.mod.TypeWebpackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dest extends StObject {
    
    var dest: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object Dest {
    
    inline def apply(): Dest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dest]
    }
    
    extension [Self <: Dest](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  /* Inlined std.Required<webpack.webpack.RuleSetRule> */
  trait RequiredRuleSetRule extends StObject {
    
    var assert: StringDictionary[RuleSetConditionOrConditions]
    
    var compiler: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var dependency: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var descriptionData: StringDictionary[RuleSetConditionOrConditions]
    
    var enforce: pre | post
    
    var exclude: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var generator: StringDictionary[Any]
    
    var include: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var issuer: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var issuerLayer: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var layer: String
    
    var loader: String
    
    var mimetype: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var oneOf: js.Array[RuleSetRule]
    
    var options: String | StringDictionary[Any]
    
    var parser: StringDictionary[Any]
    
    var realResource: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var resolve: ResolveOptionsWebpackOptions
    
    var resource: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var resourceFragment: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var resourceQuery: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var rules: js.Array[RuleSetRule]
    
    var scheme: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    
    var sideEffects: Boolean
    
    var test: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    
    var `type`: String
    
    var use: String | js.Array[RuleSetUseItem] | (js.Function1[
        (/* data */ Compiler) | (/* data */ js.Object), 
        js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
      ]) | Ident
  }
  object RequiredRuleSetRule {
    
    inline def apply(
      assert: StringDictionary[RuleSetConditionOrConditions],
      compiler: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      dependency: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      descriptionData: StringDictionary[RuleSetConditionOrConditions],
      enforce: pre | post,
      exclude: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      generator: StringDictionary[Any],
      include: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      issuer: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      issuerLayer: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      layer: String,
      loader: String,
      mimetype: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      oneOf: js.Array[RuleSetRule],
      options: String | StringDictionary[Any],
      parser: StringDictionary[Any],
      realResource: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      resolve: ResolveOptionsWebpackOptions,
      resource: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      resourceFragment: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      resourceQuery: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      rules: js.Array[RuleSetRule],
      scheme: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition],
      sideEffects: Boolean,
      test: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute],
      `type`: String,
      use: String | js.Array[RuleSetUseItem] | (js.Function1[
          (/* data */ Compiler) | (/* data */ js.Object), 
          js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
        ]) | Ident
    ): RequiredRuleSetRule = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], descriptionData = descriptionData.asInstanceOf[js.Any], enforce = enforce.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerLayer = issuerLayer.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], realResource = realResource.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceFragment = resourceFragment.asInstanceOf[js.Any], resourceQuery = resourceQuery.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredRuleSetRule]
    }
    
    extension [Self <: RequiredRuleSetRule](x: Self) {
      
      inline def setAssert(value: StringDictionary[RuleSetConditionOrConditions]): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setCompiler(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "compiler", js.Any.fromFunction1(value))
      
      inline def setCompilerVarargs(value: RuleSetCondition*): Self = StObject.set(x, "compiler", js.Array(value*))
      
      inline def setDependency(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
      
      inline def setDependencyFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "dependency", js.Any.fromFunction1(value))
      
      inline def setDependencyVarargs(value: RuleSetCondition*): Self = StObject.set(x, "dependency", js.Array(value*))
      
      inline def setDescriptionData(value: StringDictionary[RuleSetConditionOrConditions]): Self = StObject.set(x, "descriptionData", value.asInstanceOf[js.Any])
      
      inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      inline def setExclude(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setExcludeVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setGenerator(value: StringDictionary[Any]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setInclude(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      inline def setIncludeVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setIssuer(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuer", js.Any.fromFunction1(value))
      
      inline def setIssuerLayer(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "issuerLayer", value.asInstanceOf[js.Any])
      
      inline def setIssuerLayerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuerLayer", js.Any.fromFunction1(value))
      
      inline def setIssuerLayerVarargs(value: RuleSetCondition*): Self = StObject.set(x, "issuerLayer", js.Array(value*))
      
      inline def setIssuerVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setMimetype(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "mimetype", js.Any.fromFunction1(value))
      
      inline def setMimetypeVarargs(value: RuleSetCondition*): Self = StObject.set(x, "mimetype", js.Array(value*))
      
      inline def setOneOf(value: js.Array[RuleSetRule]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfVarargs(value: RuleSetRule*): Self = StObject.set(x, "oneOf", js.Array(value*))
      
      inline def setOptions(value: String | StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParser(value: StringDictionary[Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setRealResource(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "realResource", value.asInstanceOf[js.Any])
      
      inline def setRealResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "realResource", js.Any.fromFunction1(value))
      
      inline def setRealResourceVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "realResource", js.Array(value*))
      
      inline def setResolve(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResource(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceFragment(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "resourceFragment", value.asInstanceOf[js.Any])
      
      inline def setResourceFragmentFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceFragment", js.Any.fromFunction1(value))
      
      inline def setResourceFragmentVarargs(value: RuleSetCondition*): Self = StObject.set(x, "resourceFragment", js.Array(value*))
      
      inline def setResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resource", js.Any.fromFunction1(value))
      
      inline def setResourceQuery(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
      
      inline def setResourceQueryFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceQuery", js.Any.fromFunction1(value))
      
      inline def setResourceQueryVarargs(value: RuleSetCondition*): Self = StObject.set(x, "resourceQuery", js.Array(value*))
      
      inline def setResourceVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "resource", js.Array(value*))
      
      inline def setRules(value: js.Array[RuleSetRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setScheme(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
      ): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "scheme", js.Any.fromFunction1(value))
      
      inline def setSchemeVarargs(value: RuleSetCondition*): Self = StObject.set(x, "scheme", js.Array(value*))
      
      inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      inline def setTest(
        value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
      ): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTestVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUse(
        value: String | js.Array[RuleSetUseItem] | (js.Function1[
              (/* data */ Compiler) | (/* data */ js.Object), 
              js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
            ]) | Ident
      ): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseFunction1(
        value: (/* data */ Compiler) | (/* data */ js.Object) => js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
      ): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      
      inline def setUseVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
}
