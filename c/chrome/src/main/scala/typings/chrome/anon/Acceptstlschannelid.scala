package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acceptstlschannelid extends StObject {
  
  var accepts_tls_channel_id: js.UndefOr[Boolean] = js.native
  
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  var matches: js.UndefOr[js.Array[String]] = js.native
}
object Acceptstlschannelid {
  
  @scala.inline
  def apply(): Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acceptstlschannelid]
  }
  
  @scala.inline
  implicit class AcceptstlschannelidMutableBuilder[Self <: Acceptstlschannelid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepts_tls_channel_id(value: Boolean): Self = StObject.set(x, "accepts_tls_channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepts_tls_channel_idUndefined: Self = StObject.set(x, "accepts_tls_channel_id", js.undefined)
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
