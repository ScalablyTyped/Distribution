package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobError extends StObject {
  
  /**
    * The code for the job error.
    */
  var Code: typings.awsSdk.dataexchangeMod.Code
  
  /**
    * The details about the job error.
    */
  var Details: js.UndefOr[typings.awsSdk.dataexchangeMod.Details] = js.undefined
  
  /**
    * The name of the limit that was reached.
    */
  var LimitName: js.UndefOr[JobErrorLimitName] = js.undefined
  
  /**
    * The value of the exceeded limit.
    */
  var LimitValue: js.UndefOr[double] = js.undefined
  
  /**
    * The message related to the job error.
    */
  var Message: string
  
  /**
    * The unique identifier for the resource related to the error.
    */
  var ResourceId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of resource related to the error.
    */
  var ResourceType: js.UndefOr[JobErrorResourceTypes] = js.undefined
}
object JobError {
  
  inline def apply(Code: Code, Message: string): JobError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
  
  extension [Self <: JobError](x: Self) {
    
    inline def setCode(value: Code): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Details): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setLimitName(value: JobErrorLimitName): Self = StObject.set(x, "LimitName", value.asInstanceOf[js.Any])
    
    inline def setLimitNameUndefined: Self = StObject.set(x, "LimitName", js.undefined)
    
    inline def setLimitValue(value: double): Self = StObject.set(x, "LimitValue", value.asInstanceOf[js.Any])
    
    inline def setLimitValueUndefined: Self = StObject.set(x, "LimitValue", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: JobErrorResourceTypes): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
