package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object {
  /**
    * <p>Name of the tag.</p>
    */
  var Key: String
  /**
    * <p>Value of the tag.</p>
    */
  var Value: String
}

object _Tag {
  @scala.inline
  def apply(Key: String, Value: String): _Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[_Tag]
  }
}

