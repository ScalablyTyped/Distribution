package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDelim
import typings.csstoolsMediaQueryListParser.anon.NameTokens
import typings.csstoolsMediaQueryListParser.anon.NodeMediaFeatureRangeWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.ValueOne
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureComparison
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod._MediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureRangeMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeNameValue")
  @js.native
  open class MediaFeatureRangeNameValue protected ()
    extends StObject
       with MediaFeatureRange {
    def this(name: MediaFeatureName, operator: js.Array[TokenDelim], value: MediaFeatureValue) = this()
    def this(name: MediaFeatureName, operator: js.Tuple2[TokenDelim, TokenDelim], value: MediaFeatureValue) = this()
    
    def at(index: String): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureName): Double | String = js.native
    def indexOf(item: MediaFeatureValue): Double | String = js.native
    
    def isMediaFeatureRangeNameValue(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeNameValue */ Boolean = js.native
    
    var name: MediaFeatureName = js.native
    
    var operator: (js.Tuple2[TokenDelim, TokenDelim]) | js.Array[TokenDelim] = js.native
    
    def operatorKind(): MediaFeatureComparison | `false` = js.native
    
    def toJSON(): NameTokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var value: MediaFeatureValue = js.native
    
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeatureRangeNameValue {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeNameValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureRangeNameValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeNameValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeNameValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeNameValue */ Boolean]
  }
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeValueName")
  @js.native
  open class MediaFeatureRangeValueName protected ()
    extends StObject
       with MediaFeatureRange {
    def this(name: MediaFeatureName, operator: js.Array[TokenDelim], value: MediaFeatureValue) = this()
    def this(name: MediaFeatureName, operator: js.Tuple2[TokenDelim, TokenDelim], value: MediaFeatureValue) = this()
    
    def at(index: String): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureName): Double | String = js.native
    def indexOf(item: MediaFeatureValue): Double | String = js.native
    
    def isMediaFeatureRangeValueName(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean = js.native
    
    var name: MediaFeatureName = js.native
    
    var operator: (js.Tuple2[TokenDelim, TokenDelim]) | js.Array[TokenDelim] = js.native
    
    def operatorKind(): MediaFeatureComparison | `false` = js.native
    
    def toJSON(): NameTokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var value: MediaFeatureValue = js.native
    
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeatureRangeValueName {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeValueName")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureRangeValueName(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeValueName")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean]
  }
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeValueNameValue")
  @js.native
  open class MediaFeatureRangeValueNameValue protected ()
    extends StObject
       with MediaFeatureRange {
    def this(
      name: MediaFeatureName,
      valueOne: MediaFeatureValue,
      valueOneOperator: js.Array[TokenDelim],
      valueTwo: MediaFeatureValue,
      valueTwoOperator: js.Array[TokenDelim]
    ) = this()
    def this(
      name: MediaFeatureName,
      valueOne: MediaFeatureValue,
      valueOneOperator: js.Array[TokenDelim],
      valueTwo: MediaFeatureValue,
      valueTwoOperator: js.Tuple2[TokenDelim, TokenDelim]
    ) = this()
    def this(
      name: MediaFeatureName,
      valueOne: MediaFeatureValue,
      valueOneOperator: js.Tuple2[TokenDelim, TokenDelim],
      valueTwo: MediaFeatureValue,
      valueTwoOperator: js.Array[TokenDelim]
    ) = this()
    def this(
      name: MediaFeatureName,
      valueOne: MediaFeatureValue,
      valueOneOperator: js.Tuple2[TokenDelim, TokenDelim],
      valueTwo: MediaFeatureValue,
      valueTwoOperator: js.Tuple2[TokenDelim, TokenDelim]
    ) = this()
    
    def at(index: String): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureName): Double | String = js.native
    def indexOf(item: MediaFeatureValue): Double | String = js.native
    
    def isMediaFeatureRangeValueNameValue(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueNameValue */ Boolean = js.native
    
    var name: MediaFeatureName = js.native
    
    def toJSON(): ValueOne = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var valueOne: MediaFeatureValue = js.native
    
    var valueOneOperator: (js.Tuple2[TokenDelim, TokenDelim]) | js.Array[TokenDelim] = js.native
    
    def valueOneOperatorKind(): MediaFeatureComparison | `false` = js.native
    
    var valueTwo: MediaFeatureValue = js.native
    
    var valueTwoOperator: (js.Tuple2[TokenDelim, TokenDelim]) | js.Array[TokenDelim] = js.native
    
    def valueTwoOperatorKind(): MediaFeatureComparison | `false` = js.native
    
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureRangeWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeatureRangeValueNameValue {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "MediaFeatureRangeValueNameValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureRangeValueNameValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueNameValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeValueNameValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueNameValue */ Boolean]
  }
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-range", "mediaDescriptors")
  @js.native
  val mediaDescriptors: Set[String] = js.native
  
  inline def parseMediaFeatureRange(componentValues: js.Array[ComponentValue]): MediaFeatureRange | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeatureRange")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureRange | `false`]
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeNameValue
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeValueName
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeValueNameValue
  */
  trait MediaFeatureRange
    extends StObject
       with _MediaFeatureWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent
  
  type MediaFeatureRangeWalkerEntry = MediaFeatureValueWalkerEntry | MediaFeatureValue
  
  type MediaFeatureRangeWalkerParent = MediaFeatureValueWalkerParent | MediaFeatureRange
}
