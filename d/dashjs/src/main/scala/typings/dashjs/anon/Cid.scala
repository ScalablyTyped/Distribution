package typings.dashjs.anon

import typings.dashjs.dashjsStrings.header
import typings.dashjs.dashjsStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid extends StObject {
  
  var cid: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var enabledKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var mode: js.UndefOr[query | header] = js.undefined
  
  var rtp: js.UndefOr[Double] = js.undefined
  
  var rtpSafetyFactor: js.UndefOr[Double] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
}
object Cid {
  
  inline def apply(): Cid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cid] (val x: Self) extends AnyVal {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledKeys(value: js.Array[String]): Self = StObject.set(x, "enabledKeys", value.asInstanceOf[js.Any])
    
    inline def setEnabledKeysUndefined: Self = StObject.set(x, "enabledKeys", js.undefined)
    
    inline def setEnabledKeysVarargs(value: String*): Self = StObject.set(x, "enabledKeys", js.Array(value*))
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMode(value: query | header): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRtp(value: Double): Self = StObject.set(x, "rtp", value.asInstanceOf[js.Any])
    
    inline def setRtpSafetyFactor(value: Double): Self = StObject.set(x, "rtpSafetyFactor", value.asInstanceOf[js.Any])
    
    inline def setRtpSafetyFactorUndefined: Self = StObject.set(x, "rtpSafetyFactor", js.undefined)
    
    inline def setRtpUndefined: Self = StObject.set(x, "rtp", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
  }
}
