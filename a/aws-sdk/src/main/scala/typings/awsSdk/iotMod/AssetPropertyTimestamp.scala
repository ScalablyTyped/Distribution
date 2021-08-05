package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyTimestamp extends StObject {
  
  /**
    * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.undefined
  
  /**
    * A string that contains the time in seconds since epoch. Accepts substitution templates.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds
}
object AssetPropertyTimestamp {
  
  inline def apply(timeInSeconds: AssetPropertyTimeInSeconds): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
  
  extension [Self <: AssetPropertyTimestamp](x: Self) {
    
    inline def setOffsetInNanos(value: AssetPropertyOffsetInNanos): Self = StObject.set(x, "offsetInNanos", value.asInstanceOf[js.Any])
    
    inline def setOffsetInNanosUndefined: Self = StObject.set(x, "offsetInNanos", js.undefined)
    
    inline def setTimeInSeconds(value: AssetPropertyTimeInSeconds): Self = StObject.set(x, "timeInSeconds", value.asInstanceOf[js.Any])
  }
}
