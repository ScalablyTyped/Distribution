package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3JobDefinition extends js.Object {
  /**
    * An array of objects, one for each bucket that contains objects to analyze.
    */
  var bucketDefinitions: js.UndefOr[listOfS3BucketDefinitionForJob] = js.native
  /**
    * The property- and tag-based conditions that determine which objects to include or exclude from the analysis.
    */
  var scoping: js.UndefOr[Scoping] = js.native
}

object S3JobDefinition {
  @scala.inline
  def apply(): S3JobDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3JobDefinition]
  }
  @scala.inline
  implicit class S3JobDefinitionOps[Self <: S3JobDefinition] (val x: Self) extends AnyVal {
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
    def setBucketDefinitionsVarargs(value: S3BucketDefinitionForJob*): Self = this.set("bucketDefinitions", js.Array(value :_*))
    @scala.inline
    def setBucketDefinitions(value: listOfS3BucketDefinitionForJob): Self = this.set("bucketDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketDefinitions: Self = this.set("bucketDefinitions", js.undefined)
    @scala.inline
    def setScoping(value: Scoping): Self = this.set("scoping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoping: Self = this.set("scoping", js.undefined)
  }
  
}

