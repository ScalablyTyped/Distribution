package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:   s3://bucket-name/training-data.csv 
    */
  var dataLocation: js.UndefOr[S3Location] = js.native
}

object DataSource {
  @scala.inline
  def apply(dataLocation: S3Location = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (dataLocation != null) __obj.updateDynamic("dataLocation")(dataLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

