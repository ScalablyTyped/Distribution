package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONMappingParameters extends js.Object {
  /**
    * The path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsSdk.kinesisanalyticsv2Mod.RecordRowPath = js.native
}

object JSONMappingParameters {
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONMappingParameters]
  }
}

