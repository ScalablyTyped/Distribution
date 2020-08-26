package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowLevelPermissionDataSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the permission dataset.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn = js.native
  /**
    * The namespace associated with the row-level permissions dataset.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
  /**
    * Permission policy.
    */
  var PermissionPolicy: RowLevelPermissionPolicy = js.native
}

object RowLevelPermissionDataSet {
  @scala.inline
  def apply(Arn: Arn, PermissionPolicy: RowLevelPermissionPolicy): RowLevelPermissionDataSet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PermissionPolicy = PermissionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionDataSet]
  }
  @scala.inline
  implicit class RowLevelPermissionDataSetOps[Self <: RowLevelPermissionDataSet] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionPolicy(value: RowLevelPermissionPolicy): Self = this.set("PermissionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
  }
  
}

