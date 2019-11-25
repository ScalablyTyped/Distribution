package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreHashKeyRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HashKeyRange extends js.Object {
  /**
    * <p>The ending hash key of the hash key range.</p>
    */
  var EndingHashKey: String
  /**
    * <p>The starting hash key of the hash key range.</p>
    */
  var StartingHashKey: String
}

object _HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: String, StartingHashKey: String): _HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_HashKeyRange]
  }
}

