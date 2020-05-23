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
    * A JobScopeTerm object that specifies conditions for including or excluding objects from the job.
    */
  var scoping: js.UndefOr[Scoping] = js.native
}

object S3JobDefinition {
  @scala.inline
  def apply(bucketDefinitions: listOfS3BucketDefinitionForJob = null, scoping: Scoping = null): S3JobDefinition = {
    val __obj = js.Dynamic.literal()
    if (bucketDefinitions != null) __obj.updateDynamic("bucketDefinitions")(bucketDefinitions.asInstanceOf[js.Any])
    if (scoping != null) __obj.updateDynamic("scoping")(scoping.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3JobDefinition]
  }
}

