package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends StObject {
  
  /**
    * The Unix epoch timestamp in seconds for when the update was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * Any errors associated with a Failed update.
    */
  var errors: js.UndefOr[ErrorDetails] = js.native
  
  /**
    * A UUID that is used to track the update.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A key-value map that contains the parameters associated with the update.
    */
  var params: js.UndefOr[UpdateParams] = js.native
  
  /**
    * The current status of the update.
    */
  var status: js.UndefOr[UpdateStatus] = js.native
  
  /**
    * The type of the update.
    */
  var `type`: js.UndefOr[UpdateType] = js.native
}
object Update {
  
  @scala.inline
  def apply(): Update = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setErrors(value: ErrorDetails): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ErrorDetail*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setParams(value: UpdateParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: UpdateParam*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: UpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: UpdateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
