package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accepttlschannelid extends js.Object {
  
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
  implicit class AccepttlschannelidOps[Self <: Accepttlschannelid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: js.Array[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_tls_channel_id(value: Boolean): Self = this.set("accept_tls_channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept_tls_channel_id: Self = this.set("accept_tls_channel_id", js.undefined)
  }
}
