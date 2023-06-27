package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.NodeMediaFeatureValueWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.Value
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserInts.`-1`
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureValueMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-value", "MediaFeatureValue")
  @js.native
  open class MediaFeatureValue protected ()
    extends StObject
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(value: js.Array[ComponentValue]) = this()
    def this(value: ComponentValue) = this()
    def this(value: js.Array[ComponentValue], before: js.Array[CSSToken]) = this()
    def this(value: ComponentValue, before: js.Array[CSSToken]) = this()
    def this(value: js.Array[ComponentValue], before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(value: js.Array[ComponentValue], before: Unit, after: js.Array[CSSToken]) = this()
    def this(value: ComponentValue, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(value: ComponentValue, before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[ComponentValue | js.Array[ComponentValue]] = js.native
    def at(index: Double): js.UndefOr[ComponentValue | js.Array[ComponentValue]] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    def indexOf(item: ComponentValue): Double | String = js.native
    
    def isMediaFeatureValue(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-value.MediaFeatureValue */ Boolean = js.native
    
    def toJSON(): Value = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var value: ComponentValue | js.Array[ComponentValue] = js.native
    
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureValueWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaFeatureValueWalkerEntry[T], 
          /* index */ Double | String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeatureValue {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-value", "MediaFeatureValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureValue(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-value.MediaFeatureValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-value.MediaFeatureValue */ Boolean]
  }
  
  inline def matchesRatio(componentValues: js.Array[ComponentValue]): js.Array[Double] | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesRatio")(componentValues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | `-1`]
  
  inline def matchesRatioExactly(componentValues: js.Array[ComponentValue]): js.Array[Double] | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesRatioExactly")(componentValues.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | `-1`]
  
  inline def parseMediaFeatureValue(componentValues: js.Array[ComponentValue]): MediaFeatureValue | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeatureValue")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureValue | `false`]
  
  type MediaFeatureValueWalkerEntry = ComponentValue
  
  type MediaFeatureValueWalkerParent = ContainerNode | MediaFeatureValue
}
