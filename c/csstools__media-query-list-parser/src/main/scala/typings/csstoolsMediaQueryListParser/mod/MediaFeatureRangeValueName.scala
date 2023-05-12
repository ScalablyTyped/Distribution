package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDelim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaFeatureRangeValueName")
@js.native
open class MediaFeatureRangeValueName protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeValueName {
  def this(
    name: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName,
    operator: js.Array[TokenDelim],
    value: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
  ) = this()
  def this(
    name: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureNameMod.MediaFeatureName,
    operator: js.Tuple2[TokenDelim, TokenDelim],
    value: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValue
  ) = this()
}
/* static members */
object MediaFeatureRangeValueName {
  
  @JSImport("@csstools/media-query-list-parser", "MediaFeatureRangeValueName")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaFeatureRangeValueName(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeatureRangeValueName")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature-range.MediaFeatureRangeValueName */ Boolean]
}
