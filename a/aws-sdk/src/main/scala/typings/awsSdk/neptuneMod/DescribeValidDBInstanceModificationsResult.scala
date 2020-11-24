package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeValidDBInstanceModificationsResult extends js.Object {
  
  var ValidDBInstanceModificationsMessage: js.UndefOr[typings.awsSdk.neptuneMod.ValidDBInstanceModificationsMessage] = js.native
}
object DescribeValidDBInstanceModificationsResult {
  
  @scala.inline
  def apply(): DescribeValidDBInstanceModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
  }
  
  @scala.inline
  implicit class DescribeValidDBInstanceModificationsResultOps[Self <: DescribeValidDBInstanceModificationsResult] (val x: Self) extends AnyVal {
    
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
    def setValidDBInstanceModificationsMessage(value: ValidDBInstanceModificationsMessage): Self = this.set("ValidDBInstanceModificationsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidDBInstanceModificationsMessage: Self = this.set("ValidDBInstanceModificationsMessage", js.undefined)
  }
}
