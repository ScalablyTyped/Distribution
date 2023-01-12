package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceContent extends StObject {
  
  /**
    * The display text for the choice content.
    */
  var DisplayText: js.UndefOr[ChoiceContentDisplayText] = js.undefined
  
  /**
    * The URL for the choice content.
    */
  var Url: js.UndefOr[ChoiceContentUrl] = js.undefined
}
object ChoiceContent {
  
  inline def apply(): ChoiceContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoiceContent] (val x: Self) extends AnyVal {
    
    inline def setDisplayText(value: ChoiceContentDisplayText): Self = StObject.set(x, "DisplayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "DisplayText", js.undefined)
    
    inline def setUrl(value: ChoiceContentUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
