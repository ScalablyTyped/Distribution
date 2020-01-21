package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
}

object DynamoDBTarget {
  @scala.inline
  def apply(Path: Path = null): DynamoDBTarget = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBTarget]
  }
}

