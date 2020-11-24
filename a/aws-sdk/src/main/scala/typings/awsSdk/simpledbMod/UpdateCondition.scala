package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCondition extends js.Object {
  
  /**
    * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
    */
  var Exists: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the attribute involved in the condition.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
    */
  var Value: js.UndefOr[String] = js.native
}
object UpdateCondition {
  
  @scala.inline
  def apply(): UpdateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCondition]
  }
  
  @scala.inline
  implicit class UpdateConditionOps[Self <: UpdateCondition] (val x: Self) extends AnyVal {
    
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
    def setExists(value: Boolean): Self = this.set("Exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExists: Self = this.set("Exists", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
