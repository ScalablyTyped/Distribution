package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchFailedResultModel extends StObject {
  
  /**
    * ARN of the resource
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * Error code for the failed operation
    */
  var Code: js.UndefOr[string] = js.native
  
  /**
    * ID of the resource
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Error message for the failed operation
    */
  var Message: js.UndefOr[string] = js.native
}
object BatchFailedResultModel {
  
  @scala.inline
  def apply(): BatchFailedResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchFailedResultModel]
  }
  
  @scala.inline
  implicit class BatchFailedResultModelMutableBuilder[Self <: BatchFailedResultModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCode(value: string): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
