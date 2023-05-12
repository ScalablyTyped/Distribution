package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.SimpleBlockNode
import typings.csstoolsMediaQueryListParser.anon.Advance
import typings.csstoolsMediaQueryListParser.anon.AdvanceNode
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserParseMediaQueryMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/parser/parse-media-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseMediaAnd(componentValues: js.Array[ComponentValue]): `false` | AdvanceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaAnd")(componentValues.asInstanceOf[js.Any]).asInstanceOf[`false` | AdvanceNode]
  
  inline def parseMediaCondition(componentValues: js.Array[ComponentValue]): MediaCondition | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaCondition")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaCondition | `false`]
  
  inline def parseMediaConditionListWithAnd(componentValues: js.Array[ComponentValue]): MediaConditionListWithAnd | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaConditionListWithAnd")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaConditionListWithAnd | `false`]
  
  inline def parseMediaConditionListWithOr(componentValues: js.Array[ComponentValue]): MediaConditionListWithOr | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaConditionListWithOr")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaConditionListWithOr | `false`]
  
  inline def parseMediaConditionWithoutOr(componentValues: js.Array[ComponentValue]): MediaCondition | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaConditionWithoutOr")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaCondition | `false`]
  
  inline def parseMediaInParens(componentValues: js.Array[ComponentValue]): MediaInParens | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaInParens")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaInParens | `false`]
  
  inline def parseMediaInParensFromSimpleBlock(simpleBlock: SimpleBlockNode): MediaInParens | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaInParensFromSimpleBlock")(simpleBlock.asInstanceOf[js.Any]).asInstanceOf[MediaInParens | `false`]
  
  inline def parseMediaNot(componentValues: js.Array[ComponentValue]): MediaNot | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaNot")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaNot | `false`]
  
  inline def parseMediaOr(componentValues: js.Array[ComponentValue]): `false` | Advance = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaOr")(componentValues.asInstanceOf[js.Any]).asInstanceOf[`false` | Advance]
  
  inline def parseMediaQuery(componentValues: js.Array[ComponentValue]): MediaQuery | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaQuery")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaQuery | `false`]
}
