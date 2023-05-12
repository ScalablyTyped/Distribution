package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenColon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaFeaturePlain")
@js.native
open class MediaFeaturePlain protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain {
  def this(
    name: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName,
    colon: TokenColon,
    value: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
  ) = this()
}
/* static members */
object MediaFeaturePlain {
  
  @JSImport("@csstools/media-query-list-parser", "MediaFeaturePlain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaFeaturePlain(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeaturePlain")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-plain.MediaFeaturePlain */ Boolean]
}
