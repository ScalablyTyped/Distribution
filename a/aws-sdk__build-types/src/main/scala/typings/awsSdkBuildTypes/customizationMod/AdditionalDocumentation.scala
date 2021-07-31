package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDocumentation extends StObject {
  
  /**
    * A documentation string to append to the general configuration property
    * documentation.
    */
  var additionalDocumentation: js.UndefOr[String] = js.undefined
}
object AdditionalDocumentation {
  
  @scala.inline
  def apply(): AdditionalDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDocumentation]
  }
  
  @scala.inline
  implicit class AdditionalDocumentationMutableBuilder[Self <: AdditionalDocumentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDocumentation(value: String): Self = StObject.set(x, "additionalDocumentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDocumentationUndefined: Self = StObject.set(x, "additionalDocumentation", js.undefined)
  }
}
