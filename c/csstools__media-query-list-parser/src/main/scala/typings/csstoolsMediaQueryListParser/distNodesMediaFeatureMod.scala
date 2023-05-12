package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.mod.SimpleBlockNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.After
import typings.csstoolsMediaQueryListParser.anon.NodeMediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRange
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature", "MediaFeature")
  @js.native
  open class MediaFeature protected ()
    extends StObject
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(feature: MediaFeatureBoolean) = this()
    def this(feature: MediaFeaturePlain) = this()
    def this(feature: MediaFeatureRange) = this()
    def this(feature: MediaFeatureBoolean, before: js.Array[CSSToken]) = this()
    def this(feature: MediaFeaturePlain, before: js.Array[CSSToken]) = this()
    def this(feature: MediaFeatureRange, before: js.Array[CSSToken]) = this()
    def this(feature: MediaFeatureBoolean, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(feature: MediaFeatureBoolean, before: Unit, after: js.Array[CSSToken]) = this()
    def this(feature: MediaFeaturePlain, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(feature: MediaFeaturePlain, before: Unit, after: js.Array[CSSToken]) = this()
    def this(feature: MediaFeatureRange, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(feature: MediaFeatureRange, before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[MediaFeatureBoolean | MediaFeaturePlain | MediaFeatureRange] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureBoolean | MediaFeaturePlain | MediaFeatureRange] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    var feature: MediaFeaturePlain | MediaFeatureBoolean | MediaFeatureRange = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureBoolean): Double | String = js.native
    def indexOf(item: MediaFeaturePlain): Double | String = js.native
    def indexOf(item: MediaFeatureRange): Double | String = js.native
    
    def isMediaFeature(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean = js.native
    
    def toJSON(): After = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(
      cb: js.Function2[/* entry */ NodeMediaFeatureWalkerEntry, /* index */ Double | String, Boolean | Unit]
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeature {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature", "MediaFeature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeature(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeature")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean]
  }
  
  inline def newMediaFeatureBoolean(name: String): MediaFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("newMediaFeatureBoolean")(name.asInstanceOf[js.Any]).asInstanceOf[MediaFeature]
  
  inline def newMediaFeaturePlain(name: String, value: CSSToken*): MediaFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("newMediaFeaturePlain")(scala.List(name.asInstanceOf[js.Any]).`++`(value.asInstanceOf[Seq[js.Any]])*).asInstanceOf[MediaFeature]
  
  inline def parseMediaFeature(simpleBlock: SimpleBlockNode): `false` | MediaFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeature")(simpleBlock.asInstanceOf[js.Any]).asInstanceOf[`false` | MediaFeature]
  inline def parseMediaFeature(simpleBlock: SimpleBlockNode, before: js.Array[CSSToken]): `false` | MediaFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeature")(simpleBlock.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[`false` | MediaFeature]
  inline def parseMediaFeature(simpleBlock: SimpleBlockNode, before: js.Array[CSSToken], after: js.Array[CSSToken]): `false` | MediaFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeature")(simpleBlock.asInstanceOf[js.Any], before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[`false` | MediaFeature]
  inline def parseMediaFeature(simpleBlock: SimpleBlockNode, before: Unit, after: js.Array[CSSToken]): `false` | MediaFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeature")(simpleBlock.asInstanceOf[js.Any], before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[`false` | MediaFeature]
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRange
  */
  type MediaFeatureWalkerEntry = _MediaFeatureWalkerEntry | MediaFeaturePlainWalkerEntry | MediaFeatureRangeWalkerEntry
  
  type MediaFeatureWalkerParent = MediaFeaturePlainWalkerParent | MediaFeatureRangeWalkerParent | MediaFeature
  
  trait _MediaFeatureWalkerEntry extends StObject
}
