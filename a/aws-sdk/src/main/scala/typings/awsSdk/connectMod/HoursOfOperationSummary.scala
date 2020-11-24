package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoursOfOperationSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the hours of operation.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the hours of operation.
    */
  var Id: js.UndefOr[HoursOfOperationId] = js.native
  
  /**
    * The name of the hours of operation.
    */
  var Name: js.UndefOr[HoursOfOperationName] = js.native
}
object HoursOfOperationSummary {
  
  @scala.inline
  def apply(): HoursOfOperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoursOfOperationSummary]
  }
  
  @scala.inline
  implicit class HoursOfOperationSummaryOps[Self <: HoursOfOperationSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: HoursOfOperationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: HoursOfOperationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
