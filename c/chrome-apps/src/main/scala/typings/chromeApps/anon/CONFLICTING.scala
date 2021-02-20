package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.synced_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONFLICTING extends StObject {
  
  var CONFLICTING: conflicting_ = js.native
  
  var PENDING: pending_ = js.native
  
  var SYNCED: synced_ = js.native
}
object CONFLICTING {
  
  @scala.inline
  def apply(CONFLICTING: conflicting_, PENDING: pending_, SYNCED: synced_): CONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONFLICTING]
  }
  
  @scala.inline
  implicit class CONFLICTINGMutableBuilder[Self <: CONFLICTING] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONFLICTING(value: conflicting_): Self = StObject.set(x, "CONFLICTING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPENDING(value: pending_): Self = StObject.set(x, "PENDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYNCED(value: synced_): Self = StObject.set(x, "SYNCED", value.asInstanceOf[js.Any])
  }
}
