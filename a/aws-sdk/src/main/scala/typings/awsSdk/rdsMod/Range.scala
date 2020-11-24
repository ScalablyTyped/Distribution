package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Integer] = js.native
  
  /**
    * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000... 
    */
  var Step: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Integer] = js.native
}
object Range {
  
  @scala.inline
  def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Integer): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("From", js.undefined)
    
    @scala.inline
    def setStep(value: IntegerOptional): Self = this.set("Step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("Step", js.undefined)
    
    @scala.inline
    def setTo(value: Integer): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("To", js.undefined)
  }
}
