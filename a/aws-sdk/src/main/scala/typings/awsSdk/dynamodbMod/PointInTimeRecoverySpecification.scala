package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInTimeRecoverySpecification extends js.Object {
  
  /**
    * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
    */
  var PointInTimeRecoveryEnabled: BooleanObject = js.native
}
object PointInTimeRecoverySpecification {
  
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
  
  @scala.inline
  implicit class PointInTimeRecoverySpecificationOps[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
    
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
    def setPointInTimeRecoveryEnabled(value: BooleanObject): Self = this.set("PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
  }
}
