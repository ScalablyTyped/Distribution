package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Name
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureNameMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-name", "MediaFeatureName")
  @js.native
  open class MediaFeatureName protected ()
    extends StObject
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(name: ComponentValue) = this()
    def this(name: ComponentValue, before: js.Array[CSSToken]) = this()
    def this(name: ComponentValue, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
    def this(name: ComponentValue, before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[ComponentValue] = js.native
    def at(index: Double): js.UndefOr[ComponentValue] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken = js.native
    
    def indexOf(item: ComponentValue): Double | String = js.native
    
    def isMediaFeatureName(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-name.MediaFeatureName */ Boolean = js.native
    
    var name: ComponentValue = js.native
    
    def toJSON(): Name = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
  }
  /* static members */
  object MediaFeatureName {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-name", "MediaFeatureName")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaFeatureName(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-name.MediaFeatureName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureName")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-name.MediaFeatureName */ Boolean]
  }
  
  inline def parseMediaFeatureName(componentValues: js.Array[ComponentValue]): MediaFeatureName | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaFeatureName")(componentValues.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureName | `false`]
}
