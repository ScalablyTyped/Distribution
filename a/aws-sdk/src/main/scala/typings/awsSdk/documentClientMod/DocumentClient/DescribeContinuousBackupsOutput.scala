package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContinuousBackupsOutput extends js.Object {
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsDescription] = js.native
}

object DescribeContinuousBackupsOutput {
  @scala.inline
  def apply(ContinuousBackupsDescription: ContinuousBackupsDescription = null): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuousBackupsDescription != null) __obj.updateDynamic("ContinuousBackupsDescription")(ContinuousBackupsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
}

