package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggeringDataset extends js.Object {
  /**
    * The name of the data set whose content generation triggers the new data set content generation.
    */
  var name: DatasetName = js.native
}

object TriggeringDataset {
  @scala.inline
  def apply(name: DatasetName): TriggeringDataset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggeringDataset]
  }
}

