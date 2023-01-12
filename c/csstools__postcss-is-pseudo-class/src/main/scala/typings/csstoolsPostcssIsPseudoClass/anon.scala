package typings.csstoolsPostcssIsPseudoClass

import typings.csstoolsPostcssIsPseudoClass.csstoolsPostcssIsPseudoClassStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnComplexSelector extends StObject {
    
    var onComplexSelector: js.UndefOr[warning] = js.undefined
  }
  object OnComplexSelector {
    
    inline def apply(): OnComplexSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnComplexSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnComplexSelector] (val x: Self) extends AnyVal {
      
      inline def setOnComplexSelector(value: warning): Self = StObject.set(x, "onComplexSelector", value.asInstanceOf[js.Any])
      
      inline def setOnComplexSelectorUndefined: Self = StObject.set(x, "onComplexSelector", js.undefined)
    }
  }
  
  trait SpecificityMatchingName extends StObject {
    
    var specificityMatchingName: String
  }
  object SpecificityMatchingName {
    
    inline def apply(specificityMatchingName: String): SpecificityMatchingName = {
      val __obj = js.Dynamic.literal(specificityMatchingName = specificityMatchingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecificityMatchingName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpecificityMatchingName] (val x: Self) extends AnyVal {
      
      inline def setSpecificityMatchingName(value: String): Self = StObject.set(x, "specificityMatchingName", value.asInstanceOf[js.Any])
    }
  }
}
