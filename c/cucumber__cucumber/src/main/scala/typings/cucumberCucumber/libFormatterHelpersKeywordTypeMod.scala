package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersKeywordTypeMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/keyword_type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait KeywordType extends StObject
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/keyword_type", "KeywordType")
  @js.native
  object KeywordType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KeywordType & String] = js.native
    
    @js.native
    sealed trait Event
      extends StObject
         with KeywordType
    /* "event" */ val Event: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Event & String = js.native
    
    @js.native
    sealed trait Outcome
      extends StObject
         with KeywordType
    /* "outcome" */ val Outcome: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Outcome & String = js.native
    
    @js.native
    sealed trait Precondition
      extends StObject
         with KeywordType
    /* "precondition" */ val Precondition: typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType.Precondition & String = js.native
  }
  
  inline def getStepKeywordType(param0: IGetStepKeywordTypeOptions): KeywordType = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepKeywordType")(param0.asInstanceOf[js.Any]).asInstanceOf[KeywordType]
  
  trait IGetStepKeywordTypeOptions extends StObject {
    
    var keyword: String
    
    var language: String
    
    var previousKeywordType: js.UndefOr[KeywordType] = js.undefined
  }
  object IGetStepKeywordTypeOptions {
    
    inline def apply(keyword: String, language: String): IGetStepKeywordTypeOptions = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetStepKeywordTypeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetStepKeywordTypeOptions] (val x: Self) extends AnyVal {
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPreviousKeywordType(value: KeywordType): Self = StObject.set(x, "previousKeywordType", value.asInstanceOf[js.Any])
      
      inline def setPreviousKeywordTypeUndefined: Self = StObject.set(x, "previousKeywordType", js.undefined)
    }
  }
}
