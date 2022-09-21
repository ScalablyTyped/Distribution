package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.anon.Ident
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayOfStringOrStringArrayValues = js.Array[String | js.Array[String]]

type ArrayOfStringValues = js.Array[String]

type Entry = EntryDynamic | EntryStatic

type EntryDynamic = js.Function0[EntryStatic | js.Promise[EntryStatic]]

type EntryItem = String | NonEmptyArrayOfUniqueStringValues

type EntryObject = /**
	 * An entry point with name
	 */
StringDictionary[String | NonEmptyArrayOfUniqueStringValues]

type EntryStatic = EntryObject | EntryItem

type ExternalItem = String | (/**
			 * The dependency used for the external
			 */
StringDictionary[String | StringDictionary[Any] | ArrayOfStringValues | Boolean]) | js.RegExp

type Externals = (js.Function3[
/* context */ String, 
/* request */ String, 
/* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit], 
Unit]) | ExternalItem | (js.Array[
(js.Function3[
  /* context */ String, 
  /* request */ String, 
  /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit], 
  Unit
]) | ExternalItem])

type FilterItemTypes = js.RegExp | String | (js.Function1[/* value */ String, Boolean])

type FilterTypes = FilterItemTypes | js.Array[FilterItemTypes]

type NonEmptyArrayOfUniqueStringValues = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - js.RegExp
  - java.lang.String
  - js.Function1[/ * value * / java.lang.String, scala.Boolean]
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditions
  - typings.webpackCdYQfbEx.anon.And
*/
type RuleSetCondition = _RuleSetCondition | (js.Function1[/* value */ String, Boolean]) | js.RegExp | String

/* Rewritten from type alias, can be one of: 
  - js.RegExp
  - java.lang.String
  - js.Function1[/ * value * / java.lang.String, scala.Boolean]
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditionsAbsolute
  - typings.webpackCdYQfbEx.anon.Exclude
*/
type RuleSetConditionAbsolute = _RuleSetConditionAbsolute | (js.Function1[/* value */ String, Boolean]) | js.RegExp | String

/* Rewritten from type alias, can be one of: 
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetCondition
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditions
*/
type RuleSetConditionOrConditions = _RuleSetConditionOrConditions | (js.Function1[/* value */ String, Boolean]) | js.RegExp | String

/* Rewritten from type alias, can be one of: 
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditionAbsolute
  - typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditionsAbsolute
*/
type RuleSetConditionOrConditionsAbsolute = _RuleSetConditionOrConditionsAbsolute | (js.Function1[/* value */ String, Boolean]) | js.RegExp | String

type RuleSetLoader = String

type RuleSetQuery = StringDictionary[Any] | String

type RuleSetRules = js.Array[RuleSetRule]

type RuleSetUse = RuleSetUseItem | js.Function | js.Array[RuleSetUseItem]

type RuleSetUseItem = RuleSetLoader | js.Function | Ident

type WebpackPluginFunction = js.ThisFunction1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* this */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ Any, 
Unit]
