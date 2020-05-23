package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  var dataset: String
}

object Dataset {
  @scala.inline
  def apply(dataset: String): Dataset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

