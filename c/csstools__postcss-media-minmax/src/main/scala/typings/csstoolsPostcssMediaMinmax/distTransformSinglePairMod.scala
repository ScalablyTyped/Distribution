package typings.csstoolsPostcssMediaMinmax

import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureComparison
import typings.csstoolsMediaQueryListParser.mod.MediaFeature
import typings.csstoolsMediaQueryListParser.mod.MediaFeatureValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformSinglePairMod {
  
  @JSImport("@csstools/postcss-media-minmax/dist/transform-single-pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformSingleNameValuePair(name: String, operator: MediaFeatureComparison, value: MediaFeatureValue, nameBeforeValue: Boolean): js.UndefOr[MediaFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSingleNameValuePair")(name.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], nameBeforeValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MediaFeature]]
}
