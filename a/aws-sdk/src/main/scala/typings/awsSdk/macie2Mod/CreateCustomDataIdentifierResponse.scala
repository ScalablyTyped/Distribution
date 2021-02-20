package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomDataIdentifierResponse extends StObject {
  
  /**
    * The unique identifier for the custom data identifier that was created.
    */
  var customDataIdentifierId: js.UndefOr[string] = js.native
}
object CreateCustomDataIdentifierResponse {
  
  @scala.inline
  def apply(): CreateCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomDataIdentifierResponse]
  }
  
  @scala.inline
  implicit class CreateCustomDataIdentifierResponseMutableBuilder[Self <: CreateCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDataIdentifierId(value: string): Self = StObject.set(x, "customDataIdentifierId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataIdentifierIdUndefined: Self = StObject.set(x, "customDataIdentifierId", js.undefined)
  }
}
