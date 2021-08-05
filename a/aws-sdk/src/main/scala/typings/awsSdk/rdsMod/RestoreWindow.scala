package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreWindow extends StObject {
  
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[TStamp] = js.undefined
}
object RestoreWindow {
  
  inline def apply(): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreWindow]
  }
  
  extension [Self <: RestoreWindow](x: Self) {
    
    inline def setEarliestTime(value: TStamp): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestTimeUndefined: Self = StObject.set(x, "EarliestTime", js.undefined)
    
    inline def setLatestTime(value: TStamp): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
    
    inline def setLatestTimeUndefined: Self = StObject.set(x, "LatestTime", js.undefined)
  }
}
