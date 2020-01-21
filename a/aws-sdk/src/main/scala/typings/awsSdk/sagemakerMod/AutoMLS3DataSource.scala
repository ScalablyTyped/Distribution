package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLS3DataSource extends js.Object {
  /**
    * The data type.
    */
  var S3DataType: AutoMLS3DataType = js.native
  /**
    * The URL to the Amazon S3 data source.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}

object AutoMLS3DataSource {
  @scala.inline
  def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
}

