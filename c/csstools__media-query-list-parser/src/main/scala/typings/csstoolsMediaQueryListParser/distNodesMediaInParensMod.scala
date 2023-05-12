package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Before
import typings.csstoolsMediaQueryListParser.anon.NodeMediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod._MediaAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod._MediaAndWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod._MediaNotWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod._MediaNotWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod._MediaOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod._MediaOrWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaInParensMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithOrWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod._MediaOrWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod._MediaNotWalkerEntry because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-in-parens", "MediaInParens")
  @js.native
  open class MediaInParens protected ()
    extends StObject
       with _MediaAndWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(media: GeneralEnclosed) = this()
    def this(media: MediaCondition) = this()
    def this(media: MediaFeature) = this()
    def this(media: GeneralEnclosed, before: js.Array[CSSToken]) = this()
    def this(media: MediaCondition, before: js.Array[CSSToken]) = this()
    def this(media: MediaFeature, before: js.Array[CSSToken]) = this()
    def this(media: GeneralEnclosed, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(media: GeneralEnclosed, before: Unit, after: js.Array[CSSToken]) = this()
    def this(media: MediaCondition, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(media: MediaCondition, before: Unit, after: js.Array[CSSToken]) = this()
    def this(media: MediaFeature, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(media: MediaFeature, before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[MediaCondition | MediaFeature | GeneralEnclosed] = js.native
    def at(index: Double): js.UndefOr[MediaCondition | MediaFeature | GeneralEnclosed] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    def indexOf(item: GeneralEnclosed): Double | String = js.native
    def indexOf(item: MediaCondition): Double | String = js.native
    def indexOf(item: MediaFeature): Double | String = js.native
    
    def isMediaInParens(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean = js.native
    
    var media: MediaCondition | MediaFeature | GeneralEnclosed = js.native
    
    def toJSON(): Before = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(
      cb: js.Function2[
          /* entry */ NodeMediaInParensWalkerEntry, 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaInParens {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-in-parens", "MediaInParens")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaInParens(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaInParens")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
    - js.Array[
  typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue]
    - typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionList
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRange
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  */
  type MediaInParensWalkerEntry = _MediaInParensWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
    - typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionList
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRange
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  */
  type MediaInParensWalkerParent = _MediaInParensWalkerParent | ContainerNode
  
  trait _MediaInParensWalkerEntry
    extends StObject
       with _MediaAndWalkerEntry
       with _MediaNotWalkerEntry
       with _MediaOrWalkerEntry
  
  trait _MediaInParensWalkerParent
    extends StObject
       with _MediaAndWalkerParent
       with _MediaNotWalkerParent
       with _MediaOrWalkerParent
}
