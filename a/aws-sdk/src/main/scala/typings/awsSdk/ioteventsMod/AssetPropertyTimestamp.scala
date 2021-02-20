package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPropertyTimestamp extends StObject {
  
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
  implicit class AssetPropertyTimestampMutableBuilder[Self <: AssetPropertyTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetInNanos(value: AssetPropertyOffsetInNanos): Self = StObject.set(x, "offsetInNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetInNanosUndefined: Self = StObject.set(x, "offsetInNanos", js.undefined)
    
    @scala.inline
    def setTimeInSeconds(value: AssetPropertyTimeInSeconds): Self = StObject.set(x, "timeInSeconds", value.asInstanceOf[js.Any])
  }
}
