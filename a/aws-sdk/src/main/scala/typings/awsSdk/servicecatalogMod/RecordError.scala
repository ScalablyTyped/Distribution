package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordError extends StObject {
  
  /**
    * The numeric value of the error.
    */
  var Code: js.UndefOr[ErrorCode] = js.native
  
  /**
    * The description of the error.
    */
  var Description: js.UndefOr[ErrorDescription] = js.native
}
object RecordError {
  
  @scala.inline
  def apply(): RecordError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordError]
  }
  
  @scala.inline
  implicit class RecordErrorMutableBuilder[Self <: RecordError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setDescription(value: ErrorDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
