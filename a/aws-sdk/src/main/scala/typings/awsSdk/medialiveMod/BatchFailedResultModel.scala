package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchFailedResultModel extends StObject {
  
  /**
    * ARN of the resource
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * Error code for the failed operation
    */
  var Code: js.UndefOr[string] = js.undefined
  
  /**
    * ID of the resource
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Error message for the failed operation
    */
  var Message: js.UndefOr[string] = js.undefined
}
object BatchFailedResultModel {
  
  inline def apply(): BatchFailedResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchFailedResultModel]
  }
  
  extension [Self <: BatchFailedResultModel](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCode(value: string): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
