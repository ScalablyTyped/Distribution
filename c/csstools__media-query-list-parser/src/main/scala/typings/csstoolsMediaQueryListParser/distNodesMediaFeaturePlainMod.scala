package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenColon
import typings.csstoolsMediaQueryListParser.anon.NameTokens
import typings.csstoolsMediaQueryListParser.anon.NodeMediaFeaturePlainWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod._MediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeaturePlainMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-plain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-plain", "MediaFeaturePlain")
  @js.native
  open class MediaFeaturePlain protected ()
    extends StObject
       with _MediaFeatureWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(name: MediaFeatureName, colon: TokenColon, value: MediaFeatureValue) = this()
    
    def at(index: String): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureName | MediaFeatureValue] = js.native
    
    var colon: TokenColon = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureName): Double | String = js.native
    def indexOf(item: MediaFeatureValue): Double | String = js.native
    
    def isMediaFeaturePlain(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean = js.native
    
    var name: MediaFeatureName = js.native
    
    def toJSON(): NameTokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var value: MediaFeatureValue = js.native
    
    def walk(
      cb: js.Function2[
          /* entry */ NodeMediaFeaturePlainWalkerEntry, 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaFeaturePlain {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-plain", "MediaFeaturePlain")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeaturePlain(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeaturePlain")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean]
  }
  
  inline def parseMediaFeaturePlain(componentValues: js.Array[ComponentValue]): MediaFeaturePlain | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeaturePlain")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaFeaturePlain | `false`]
  
  type MediaFeaturePlainWalkerEntry = MediaFeatureValueWalkerEntry | MediaFeatureValue
  
  type MediaFeaturePlainWalkerParent = MediaFeatureValueWalkerParent | MediaFeaturePlain
}
