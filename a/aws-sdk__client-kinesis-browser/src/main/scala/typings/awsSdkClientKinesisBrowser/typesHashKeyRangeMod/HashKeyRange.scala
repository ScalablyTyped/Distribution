package typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashKeyRange extends js.Object {
  /**
    * <p>The ending hash key of the hash key range.</p>
    */
  var EndingHashKey: String
  /**
    * <p>The starting hash key of the hash key range.</p>
    */
  var StartingHashKey: String
}

object HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: String, StartingHashKey: String): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashKeyRange]
  }
}

