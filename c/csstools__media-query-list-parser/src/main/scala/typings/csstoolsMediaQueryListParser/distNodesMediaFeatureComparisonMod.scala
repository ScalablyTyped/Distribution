package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDelim
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaFeatureComparisonMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-comparison", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MediaFeatureEQ
    extends StObject
       with MediaFeatureComparison
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-comparison", "MediaFeatureEQ")
  @js.native
  object MediaFeatureEQ extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaFeatureEQ & String] = js.native
    
    @js.native
    sealed trait EQ
      extends StObject
         with MediaFeatureEQ
    /* "=" */ val EQ: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureEQ.EQ & String = js.native
  }
  
  @js.native
  sealed trait MediaFeatureGT
    extends StObject
       with MediaFeatureComparison
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-comparison", "MediaFeatureGT")
  @js.native
  object MediaFeatureGT extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaFeatureGT & String] = js.native
    
    @js.native
    sealed trait GT
      extends StObject
         with MediaFeatureGT
    /* ">" */ val GT: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureGT.GT & String = js.native
    
    @js.native
    sealed trait GT_OR_EQ
      extends StObject
         with MediaFeatureGT
    /* ">=" */ val GT_OR_EQ: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureGT.GT_OR_EQ & String = js.native
  }
  
  @js.native
  sealed trait MediaFeatureLT
    extends StObject
       with MediaFeatureComparison
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-feature-comparison", "MediaFeatureLT")
  @js.native
  object MediaFeatureLT extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaFeatureLT & String] = js.native
    
    @js.native
    sealed trait LT
      extends StObject
         with MediaFeatureLT
    /* "<" */ val LT: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureLT.LT & String = js.native
    
    @js.native
    sealed trait LT_OR_EQ
      extends StObject
         with MediaFeatureLT
    /* "<=" */ val LT_OR_EQ: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureLT.LT_OR_EQ & String = js.native
  }
  
  inline def comparisonFromTokens(tokens: js.Array[TokenDelim]): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("comparisonFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]
  inline def comparisonFromTokens(tokens: js.Tuple2[TokenDelim, TokenDelim]): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("comparisonFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]
  
  inline def invertComparison(operator: MediaFeatureComparison): MediaFeatureComparison | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("invertComparison")(operator.asInstanceOf[js.Any]).asInstanceOf[MediaFeatureComparison | `false`]
  
  inline def matchesComparison(componentValues: js.Array[ComponentValue]): `false` | (js.Tuple2[Double, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesComparison")(componentValues.asInstanceOf[js.Any]).asInstanceOf[`false` | (js.Tuple2[Double, Double])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureLT
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureGT
    - typings.csstoolsMediaQueryListParser.distNodesMediaFeatureComparisonMod.MediaFeatureEQ
  */
  trait MediaFeatureComparison extends StObject
}
