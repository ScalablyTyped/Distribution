package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acceptstlschannelid extends StObject {
  
  var accepts_tls_channel_id: js.UndefOr[Boolean] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var matches: js.UndefOr[js.Array[String]] = js.undefined
}
object Acceptstlschannelid {
  
  inline def apply(): Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acceptstlschannelid]
  }
  
  extension [Self <: Acceptstlschannelid](x: Self) {
    
    inline def setAccepts_tls_channel_id(value: Boolean): Self = StObject.set(x, "accepts_tls_channel_id", value.asInstanceOf[js.Any])
    
    inline def setAccepts_tls_channel_idUndefined: Self = StObject.set(x, "accepts_tls_channel_id", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
