package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreWindow extends StObject {
  
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[TStamp] = js.native
}
object RestoreWindow {
  
  @scala.inline
  def apply(): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreWindow]
  }
  
  @scala.inline
  implicit class RestoreWindowMutableBuilder[Self <: RestoreWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarliestTime(value: TStamp): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestTimeUndefined: Self = StObject.set(x, "EarliestTime", js.undefined)
    
    @scala.inline
    def setLatestTime(value: TStamp): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestTimeUndefined: Self = StObject.set(x, "LatestTime", js.undefined)
  }
}
