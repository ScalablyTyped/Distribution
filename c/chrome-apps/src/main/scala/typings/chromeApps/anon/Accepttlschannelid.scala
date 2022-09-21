package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accepttlschannelid extends StObject {
  
  /**
    * Determines if messages sent via `runtime.connect` or `runtime.sendMessage`
    * are allowed to set `runtime.MessageSender.tlsChannelId`.
    */
  var accept_tls_channel_id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of extensions or apps that are allowed to connect.
    * If left empty or unspecified, no extensions or apps can connect.
    * The wildcard '*' will allow all extensions and apps to connect.
    */
  var id: js.Array[String]
  
  /**
    * The URL patterns for web pages that are allowed to connect.
    * This does not affect content scripts.
    * If left empty or unspecified, no web pages can connect.
    */
  var matches: js.Array[String]
}
object Accepttlschannelid {
  
  inline def apply(id: js.Array[String], matches: js.Array[String]): Accepttlschannelid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepttlschannelid]
  }
  
  extension [Self <: Accepttlschannelid](x: Self) {
    
    inline def setAccept_tls_channel_id(value: Boolean): Self = StObject.set(x, "accept_tls_channel_id", value.asInstanceOf[js.Any])
    
    inline def setAccept_tls_channel_idUndefined: Self = StObject.set(x, "accept_tls_channel_id", js.undefined)
    
    inline def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
