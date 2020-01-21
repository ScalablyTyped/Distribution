package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataset extends js.Object {
  var dataset: String
}

object AnonDataset {
  @scala.inline
  def apply(dataset: String): AnonDataset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataset]
  }
}

