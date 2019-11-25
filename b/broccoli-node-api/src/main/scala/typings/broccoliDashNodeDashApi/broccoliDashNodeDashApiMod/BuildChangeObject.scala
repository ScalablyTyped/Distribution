package typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildChangeObject extends js.Object {
  var changedNodes: js.Array[Boolean]
}

object BuildChangeObject {
  @scala.inline
  def apply(changedNodes: js.Array[Boolean]): BuildChangeObject = {
    val __obj = js.Dynamic.literal(changedNodes = changedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildChangeObject]
  }
}

