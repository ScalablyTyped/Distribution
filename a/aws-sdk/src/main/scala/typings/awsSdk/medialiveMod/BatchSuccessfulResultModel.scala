package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSuccessfulResultModel extends js.Object {
  
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
  implicit class BatchSuccessfulResultModelOps[Self <: BatchSuccessfulResultModel] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setState(value: string): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
