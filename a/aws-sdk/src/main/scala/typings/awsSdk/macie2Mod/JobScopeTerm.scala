package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobScopeTerm extends js.Object {
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from a job.
    */
  var simpleScopeTerm: js.UndefOr[SimpleScopeTerm] = js.native
  /**
    * A tag-based condition that defines a property, operator, and one or more values for including or excluding an object from a job.
    */
  var tagScopeTerm: js.UndefOr[TagScopeTerm] = js.native
}

object JobScopeTerm {
  @scala.inline
  def apply(simpleScopeTerm: SimpleScopeTerm = null, tagScopeTerm: TagScopeTerm = null): JobScopeTerm = {
    val __obj = js.Dynamic.literal()
    if (simpleScopeTerm != null) __obj.updateDynamic("simpleScopeTerm")(simpleScopeTerm.asInstanceOf[js.Any])
    if (tagScopeTerm != null) __obj.updateDynamic("tagScopeTerm")(tagScopeTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobScopeTerm]
  }
}

