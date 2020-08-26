package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobScopeTerm extends js.Object {
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.
    */
  var simpleScopeTerm: js.UndefOr[SimpleScopeTerm] = js.native
  /**
    * A tag-based condition that defines the operator and a tag key or tag keys and values for including or excluding an object from the job.
    */
  var tagScopeTerm: js.UndefOr[TagScopeTerm] = js.native
}

object JobScopeTerm {
  @scala.inline
  def apply(): JobScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScopeTerm]
  }
  @scala.inline
  implicit class JobScopeTermOps[Self <: JobScopeTerm] (val x: Self) extends AnyVal {
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
    def setSimpleScopeTerm(value: SimpleScopeTerm): Self = this.set("simpleScopeTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleScopeTerm: Self = this.set("simpleScopeTerm", js.undefined)
    @scala.inline
    def setTagScopeTerm(value: TagScopeTerm): Self = this.set("tagScopeTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagScopeTerm: Self = this.set("tagScopeTerm", js.undefined)
  }
  
}

