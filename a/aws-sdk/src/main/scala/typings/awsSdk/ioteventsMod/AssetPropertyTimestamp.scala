package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyTimestamp extends js.Object {
  
  /**
    * The nanosecond offset converted from timeInSeconds. The valid range is between 0-999999999. You can also specify an expression.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.native
  
  /**
    * The timestamp, in seconds, in the Unix epoch format. The valid range is between 1-31556889864403199. You can also specify an expression.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds = js.native
}
object AssetPropertyTimestamp {
  
  @scala.inline
  def apply(timeInSeconds: AssetPropertyTimeInSeconds): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
  
  @scala.inline
  implicit class AssetPropertyTimestampOps[Self <: AssetPropertyTimestamp] (val x: Self) extends AnyVal {
    
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
    def setTimeInSeconds(value: AssetPropertyTimeInSeconds): Self = this.set("timeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetInNanos(value: AssetPropertyOffsetInNanos): Self = this.set("offsetInNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetInNanos: Self = this.set("offsetInNanos", js.undefined)
  }
}
