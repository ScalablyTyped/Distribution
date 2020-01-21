package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLChannel extends js.Object {
  /**
    * You can use Gzip or None. The default value is None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.sagemakerMod.CompressionType] = js.native
  /**
    * The data source.
    */
  var DataSource: AutoMLDataSource = js.native
  /**
    * The name of the target variable in supervised learning, a.k.a. ‘y’.
    */
  var TargetAttributeName: typings.awsSdk.sagemakerMod.TargetAttributeName = js.native
}

object AutoMLChannel {
  @scala.inline
  def apply(
    DataSource: AutoMLDataSource,
    TargetAttributeName: TargetAttributeName,
    CompressionType: CompressionType = null
  ): AutoMLChannel = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLChannel]
  }
}

