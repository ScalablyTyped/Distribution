package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accepttlschannelid extends StObject {
  
  /**
    * Determines if messages sent via `runtime.connect` or `runtime.sendMessage`
    * are allowed to set `runtime.MessageSender.tlsChannelId`.
    */
  var accept_tls_channel_id: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of extensions or apps that are allowed to connect.
    * If left empty or unspecified, no extensions or apps can connect.
    * The wildcard '*' will allow all extensions and apps to connect.
    */
  var id: js.Array[String] = js.native
  
  /**
    * The URL patterns for web pages that are allowed to connect.
    * This does not affect content scripts.
    * If left empty or unspecified, no web pages can connect.
    */
  var matches: js.Array[String] = js.native
}
object Accepttlschannelid {
  
  @scala.inline
  def apply(id: js.Array[String], matches: js.Array[String]): Accepttlschannelid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepttlschannelid]
  }
  
  @scala.inline
  implicit class AccepttlschannelidMutableBuilder[Self <: Accepttlschannelid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_tls_channel_id(value: Boolean): Self = StObject.set(x, "accept_tls_channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_tls_channel_idUndefined: Self = StObject.set(x, "accept_tls_channel_id", js.undefined)
    
    @scala.inline
    def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
  }
}
