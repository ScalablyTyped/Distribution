package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsFilterCriteria extends js.Object {
  /**
    * An array of objects, one for each condition that determines which jobs to exclude from the results.
    */
  var excludes: js.UndefOr[listOfListJobsFilterTerm] = js.native
  /**
    * An array of objects, one for each condition that determines which jobs to include in the results.
    */
  var includes: js.UndefOr[listOfListJobsFilterTerm] = js.native
}

object ListJobsFilterCriteria {
  @scala.inline
  def apply(excludes: listOfListJobsFilterTerm = null, includes: listOfListJobsFilterTerm = null): ListJobsFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsFilterCriteria]
  }
}

