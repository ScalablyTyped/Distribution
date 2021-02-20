package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSeverityLevelsRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
}
object DescribeSeverityLevelsRequest {
  
  @scala.inline
  def apply(): DescribeSeverityLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsRequest]
  }
  
  @scala.inline
  implicit class DescribeSeverityLevelsRequestMutableBuilder[Self <: DescribeSeverityLevelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
