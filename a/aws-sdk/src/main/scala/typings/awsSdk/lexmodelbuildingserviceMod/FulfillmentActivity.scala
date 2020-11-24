package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfillmentActivity extends js.Object {
  
  /**
    *  A description of the Lambda function that is run to fulfill the intent. 
    */
  var codeHook: js.UndefOr[CodeHook] = js.native
  
  /**
    *  How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the client application. 
    */
  var `type`: FulfillmentActivityType = js.native
}
object FulfillmentActivity {
  
  @scala.inline
  def apply(`type`: FulfillmentActivityType): FulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentActivity]
  }
  
  @scala.inline
  implicit class FulfillmentActivityOps[Self <: FulfillmentActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: FulfillmentActivityType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeHook(value: CodeHook): Self = this.set("codeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeHook: Self = this.set("codeHook", js.undefined)
  }
}
