package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckSchemaVersionValidityResponse extends js.Object {
  
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
  implicit class CheckSchemaVersionValidityResponseOps[Self <: CheckSchemaVersionValidityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: SchemaValidationError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setValid(value: IsVersionValid): Self = this.set("Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("Valid", js.undefined)
  }
}
