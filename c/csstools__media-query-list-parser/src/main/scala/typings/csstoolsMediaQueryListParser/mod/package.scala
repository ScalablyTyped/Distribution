package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDelim
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserInts.`-1`
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureComparison
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import typings.csstoolsMediaQueryListParser.distParserParseMod.Options
import typings.csstoolsMediaQueryListParser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cloneMediaQuery(x: typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalid): typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalid]
inline def cloneMediaQuery(x: typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType): typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType]
inline def cloneMediaQuery(x: typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType): typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType]

inline def comparisonFromTokens(tokens: js.Array[TokenDelim]): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("comparisonFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]
inline def comparisonFromTokens(tokens: js.Tuple2[TokenDelim, TokenDelim]): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("comparisonFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]

inline def invertComparison(operator: MediaFeatureComparison): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("invertComparison")(operator.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]

inline def isCustomMedia(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomMedia")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean]

inline def isGeneralEnclosed(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneralEnclosed")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean]

inline def isMediaAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean]

inline def isMediaCondition(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaCondition")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean]

inline def isMediaConditionList(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionList")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionList */ Boolean]

inline def isMediaConditionListWithAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean]

inline def isMediaConditionListWithOr(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithOr")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean]

inline def isMediaFeature(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeature")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean]

inline def isMediaFeatureBoolean(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-boolean.MediaFeatureBoolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureBoolean")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-boolean.MediaFeatureBoolean */ Boolean]

inline def isMediaFeatureName(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-name.MediaFeatureName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureName")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-name.MediaFeatureName */ Boolean]

inline def isMediaFeaturePlain(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeaturePlain")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean]

inline def isMediaFeatureRange(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRange")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRange */ Boolean]

inline def isMediaFeatureRangeNameValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeNameValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeNameValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeNameValue */ Boolean]

inline def isMediaFeatureRangeValueName(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeValueName")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean]

inline def isMediaFeatureRangeValueNameValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueNameValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeValueNameValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueNameValue */ Boolean]

inline def isMediaFeatureValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-value.MediaFeatureValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-value.MediaFeatureValue */ Boolean]

inline def isMediaInParens(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaInParens")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean]

inline def isMediaNot(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-not.MediaNot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaNot")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-not.MediaNot */ Boolean]

inline def isMediaOr(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-or.MediaOr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaOr")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-or.MediaOr */ Boolean]

inline def isMediaQuery(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQuery */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQuery")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQuery */ Boolean]

inline def isMediaQueryInvalid(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryInvalid */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryInvalid")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryInvalid */ Boolean]

inline def isMediaQueryWithType(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryWithType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean]

inline def isMediaQueryWithoutType(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithoutType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryWithoutType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithoutType */ Boolean]

inline def matchesComparison(componentValues: js.Array[ComponentValue]): `false` | (js.Tuple2[Double, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesComparison")(componentValues.asInstanceOf[js.Any]).asInstanceOf[`false` | (js.Tuple2[Double, Double])]

inline def matchesRatio(componentValues: js.Array[ComponentValue]): js.Array[Double] | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesRatio")(componentValues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | `-1`]

inline def matchesRatioExactly(componentValues: js.Array[ComponentValue]): js.Array[Double] | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesRatioExactly")(componentValues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | `-1`]

inline def modifierFromToken(token: TokenIdent): typings.csstoolsMediaQueryListParser.distNodesMediaQueryModifierMod.MediaQueryModifier | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("modifierFromToken")(token.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaQueryModifierMod.MediaQueryModifier | `false`]

inline def newMediaFeatureBoolean(name: String): typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("newMediaFeatureBoolean")(name.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature]

inline def newMediaFeaturePlain(name: String, value: CSSToken*): typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("newMediaFeaturePlain")(scala.List(name.asInstanceOf[js.Any]).`++`(value.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature]

inline def parse(source: String): js.Array[MediaQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[MediaQuery]]
inline def parse(source: String, options: Options): js.Array[MediaQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[MediaQuery]]

inline def parseCustomMedia(source: String): typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMedia")(source.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false`]
inline def parseCustomMedia(
  source: String,
  options: typings.csstoolsMediaQueryListParser.distParserParseCustomMediaMod.Options
): typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMedia")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false`]

inline def parseCustomMediaFromTokens(tokens: js.Array[CSSToken]): typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMediaFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false`]
inline def parseCustomMediaFromTokens(
  tokens: js.Array[CSSToken],
  options: typings.csstoolsMediaQueryListParser.distParserParseCustomMediaMod.Options
): typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMediaFromTokens")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia | `false`]

inline def parseFromTokens(tokens: js.Array[CSSToken]): js.Array[MediaQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[MediaQuery]]
inline def parseFromTokens(tokens: js.Array[CSSToken], options: Options): js.Array[MediaQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[MediaQuery]]

inline def typeFromToken(token: TokenIdent): typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("typeFromToken")(token.asInstanceOf[js.Any]).asInstanceOf[typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType | `false`]
