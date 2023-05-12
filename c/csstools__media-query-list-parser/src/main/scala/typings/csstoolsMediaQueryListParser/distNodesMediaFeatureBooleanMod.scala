package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Type
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod._MediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureBooleanMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-boolean", "MediaFeatureBoolean")
  @js.native
  open class MediaFeatureBoolean protected ()
    extends StObject
       with _MediaFeatureWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(name: MediaFeatureName) = this()
    
    def at(index: String): js.UndefOr[MediaFeatureName] = js.native
    def at(index: Double): js.UndefOr[MediaFeatureName] = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: MediaFeatureName): Double | String = js.native
    
    def isMediaFeatureBoolean(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-boolean.MediaFeatureBoolean */ Boolean = js.native
    
    var name: MediaFeatureName = js.native
    
    def toJSON(): Type = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
  }
  /* static members */
  object MediaFeatureBoolean {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-boolean", "MediaFeatureBoolean")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureBoolean(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-boolean.MediaFeatureBoolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureBoolean")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-boolean.MediaFeatureBoolean */ Boolean]
  }
  
  inline def parseMediaFeatureBoolean(componentValues: js.Array[ComponentValue]): `false` | MediaFeatureBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeatureBoolean")(componentValues.asInstanceOf[js.Any]).asInstanceOf[`false` | MediaFeatureBoolean]
}
