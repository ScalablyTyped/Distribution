package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLDataSource extends js.Object {
  /**
    * The Amazon S3 location of the input data.  The input data must be in CSV format and contain at least 1000 rows. 
    */
  var S3DataSource: AutoMLS3DataSource = js.native
}

object AutoMLDataSource {
  @scala.inline
  def apply(S3DataSource: AutoMLS3DataSource): AutoMLDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLDataSource]
  }
}

