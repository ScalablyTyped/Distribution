package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckSchemaVersionValidityResponse extends StObject {
  
  /**
    * A validation failure error message.
    */
  var Error: js.UndefOr[SchemaValidationError] = js.native
  
  /**
    * Return true, if the schema is valid and false otherwise.
    */
  var Valid: js.UndefOr[IsVersionValid] = js.native
}
object CheckSchemaVersionValidityResponse {
  
  @scala.inline
  def apply(): CheckSchemaVersionValidityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSchemaVersionValidityResponse]
  }
  
  @scala.inline
  implicit class CheckSchemaVersionValidityResponseMutableBuilder[Self <: CheckSchemaVersionValidityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SchemaValidationError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setValid(value: IsVersionValid): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
