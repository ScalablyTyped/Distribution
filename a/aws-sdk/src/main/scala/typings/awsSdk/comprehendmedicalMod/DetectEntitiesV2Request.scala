package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectEntitiesV2Request extends js.Object {
  /**
    * A UTF-8 string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString = js.native
}

object DetectEntitiesV2Request {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectEntitiesV2Request = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectEntitiesV2Request]
  }
}

