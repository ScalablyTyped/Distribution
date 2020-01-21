package typings.awsSdk.documentClientMod.DocumentClient

import typings.awsSdk.awsSdkStrings.Binary_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinarySet extends DynamoDbSet {
  var `type`: Binary_ = js.native
  var values: js.Array[binaryType] = js.native
}

object BinarySet {
  @scala.inline
  def apply(`type`: Binary_, values: js.Array[binaryType]): BinarySet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySet]
  }
}

