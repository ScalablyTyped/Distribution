package typings.awsSdk.documentClientMod.DocumentClient

import typings.awsSdk.awsSdkStrings.String_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSet extends DynamoDbSet {
  var `type`: String_ = js.native
  var values: js.Array[java.lang.String] = js.native
}

object StringSet {
  @scala.inline
  def apply(`type`: String_, values: js.Array[java.lang.String]): StringSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSet]
  }
}

