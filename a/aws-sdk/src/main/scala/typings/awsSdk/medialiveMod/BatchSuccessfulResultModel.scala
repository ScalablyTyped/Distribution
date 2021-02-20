package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSuccessfulResultModel extends StObject {
  
  /**
    * ARN of the resource
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * ID of the resource
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Current state of the resource
    */
  var State: js.UndefOr[string] = js.native
}
object BatchSuccessfulResultModel {
  
  @scala.inline
  def apply(): BatchSuccessfulResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSuccessfulResultModel]
  }
  
  @scala.inline
  implicit class BatchSuccessfulResultModelMutableBuilder[Self <: BatchSuccessfulResultModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
