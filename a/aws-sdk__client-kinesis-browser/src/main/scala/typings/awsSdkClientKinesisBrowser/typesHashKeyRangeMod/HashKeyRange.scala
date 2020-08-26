package typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashKeyRange extends js.Object {
  /**
    * <p>The ending hash key of the hash key range.</p>
    */
  var EndingHashKey: String = js.native
  /**
    * <p>The starting hash key of the hash key range.</p>
    */
  var StartingHashKey: String = js.native
}

object HashKeyRange {
  @scala.inline
  def apply(EndingHashKey: String, StartingHashKey: String): HashKeyRange = {
    val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashKeyRange]
  }
  @scala.inline
  implicit class HashKeyRangeOps[Self <: HashKeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndingHashKey(value: String): Self = this.set("EndingHashKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingHashKey(value: String): Self = this.set("StartingHashKey", value.asInstanceOf[js.Any])
  }
  
}

