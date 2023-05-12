package typings.csstoolsMediaQueryListParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilNodeTypeMod {
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("@csstools/media-query-list-parser/dist/util/node-type", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    @js.native
    sealed trait CustomMedia
      extends StObject
         with NodeType
    /* "custom-media" */ val CustomMedia: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.CustomMedia & String = js.native
    
    @js.native
    sealed trait GeneralEnclosed
      extends StObject
         with NodeType
    /* "general-enclosed" */ val GeneralEnclosed: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.GeneralEnclosed & String = js.native
    
    @js.native
    sealed trait MediaAnd
      extends StObject
         with NodeType
    /* "media-and" */ val MediaAnd: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaAnd & String = js.native
    
    @js.native
    sealed trait MediaCondition
      extends StObject
         with NodeType
    /* "media-condition" */ val MediaCondition: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaCondition & String = js.native
    
    @js.native
    sealed trait MediaConditionListWithAnd
      extends StObject
         with NodeType
    /* "media-condition-list-and" */ val MediaConditionListWithAnd: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaConditionListWithAnd & String = js.native
    
    @js.native
    sealed trait MediaConditionListWithOr
      extends StObject
         with NodeType
    /* "media-condition-list-or" */ val MediaConditionListWithOr: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaConditionListWithOr & String = js.native
    
    @js.native
    sealed trait MediaFeature
      extends StObject
         with NodeType
    /* "media-feature" */ val MediaFeature: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeature & String = js.native
    
    @js.native
    sealed trait MediaFeatureBoolean
      extends StObject
         with NodeType
    /* "mf-boolean" */ val MediaFeatureBoolean: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureBoolean & String = js.native
    
    @js.native
    sealed trait MediaFeatureName
      extends StObject
         with NodeType
    /* "mf-name" */ val MediaFeatureName: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureName & String = js.native
    
    @js.native
    sealed trait MediaFeaturePlain
      extends StObject
         with NodeType
    /* "mf-plain" */ val MediaFeaturePlain: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeaturePlain & String = js.native
    
    @js.native
    sealed trait MediaFeatureRangeNameValue
      extends StObject
         with NodeType
    /* "mf-range-name-value" */ val MediaFeatureRangeNameValue: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureRangeNameValue & String = js.native
    
    @js.native
    sealed trait MediaFeatureRangeValueName
      extends StObject
         with NodeType
    /* "mf-range-value-name" */ val MediaFeatureRangeValueName: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureRangeValueName & String = js.native
    
    @js.native
    sealed trait MediaFeatureRangeValueNameValue
      extends StObject
         with NodeType
    /* "mf-range-value-name-value" */ val MediaFeatureRangeValueNameValue: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureRangeValueNameValue & String = js.native
    
    @js.native
    sealed trait MediaFeatureValue
      extends StObject
         with NodeType
    /* "mf-value" */ val MediaFeatureValue: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaFeatureValue & String = js.native
    
    @js.native
    sealed trait MediaInParens
      extends StObject
         with NodeType
    /* "media-in-parens" */ val MediaInParens: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaInParens & String = js.native
    
    @js.native
    sealed trait MediaNot
      extends StObject
         with NodeType
    /* "media-not" */ val MediaNot: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaNot & String = js.native
    
    @js.native
    sealed trait MediaOr
      extends StObject
         with NodeType
    /* "media-or" */ val MediaOr: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaOr & String = js.native
    
    @js.native
    sealed trait MediaQueryInvalid
      extends StObject
         with NodeType
    /* "media-query-invalid" */ val MediaQueryInvalid: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaQueryInvalid & String = js.native
    
    @js.native
    sealed trait MediaQueryWithType
      extends StObject
         with NodeType
    /* "media-query-with-type" */ val MediaQueryWithType: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaQueryWithType & String = js.native
    
    @js.native
    sealed trait MediaQueryWithoutType
      extends StObject
         with NodeType
    /* "media-query-without-type" */ val MediaQueryWithoutType: typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType.MediaQueryWithoutType & String = js.native
  }
}
