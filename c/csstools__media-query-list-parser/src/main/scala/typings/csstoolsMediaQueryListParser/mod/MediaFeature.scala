package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaFeature")
@js.native
open class MediaFeature protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature {
  def this(feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean) = this()
  def this(feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain) = this()
  def this(feature: MediaFeatureRange) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean,
    before: js.Array[CSSToken]
  ) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain,
    before: js.Array[CSSToken]
  ) = this()
  def this(feature: MediaFeatureRange, before: js.Array[CSSToken]) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean,
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureBooleanMod.MediaFeatureBoolean,
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain,
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    feature: typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlain,
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
  def this(feature: MediaFeatureRange, before: js.Array[CSSToken], after: js.Array[CSSToken]) = this()
  def this(feature: MediaFeatureRange, before: Unit, after: js.Array[CSSToken]) = this()
}
/* static members */
object MediaFeature {
  
  @JSImport("@csstools/media-query-list-parser", "MediaFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaFeature(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFeature")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-feature.MediaFeature */ Boolean]
}
