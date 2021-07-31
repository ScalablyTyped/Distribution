package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNameSuggestion extends StObject {
  
  /**
    * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
    */
  var PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined
}
object PropertyNameSuggestion {
  
  @scala.inline
  def apply(): PropertyNameSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyNameSuggestion]
  }
  
  @scala.inline
  implicit class PropertyNameSuggestionMutableBuilder[Self <: PropertyNameSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: ResourcePropertyName): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameUndefined: Self = StObject.set(x, "PropertyName", js.undefined)
  }
}
