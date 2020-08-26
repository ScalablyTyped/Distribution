package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentsResult extends js.Object {
  /**
    * Information about the environments that are returned.
    */
  var environments: js.UndefOr[EnvironmentList] = js.native
}

object DescribeEnvironmentsResult {
  @scala.inline
  def apply(): DescribeEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsResult]
  }
  @scala.inline
  implicit class DescribeEnvironmentsResultOps[Self <: DescribeEnvironmentsResult] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: Environment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: EnvironmentList): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
  }
  
}

