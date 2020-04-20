package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfig extends js.Object {
  /**
    * The name of the data source.
    */
  var name: Name = js.native
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: S3Bucket = js.native
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: S3Keys = js.native
}

object DataSourceConfig {
  @scala.inline
  def apply(name: Name, s3Bucket: S3Bucket, s3Keys: S3Keys): DataSourceConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Keys = s3Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfig]
  }
}

