package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeValidDBInstanceModificationsMessage extends js.Object {
  /**
    * The customer identifier or the ARN of your DB instance. 
    */
  var DBInstanceIdentifier: String = js.native
}

object DescribeValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsMessage]
  }
  @scala.inline
  implicit class DescribeValidDBInstanceModificationsMessageOps[Self <: DescribeValidDBInstanceModificationsMessage] (val x: Self) extends AnyVal {
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
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
  
}

