package typings.bonjour.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.dgramMod.RemoteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteService extends BaseService {
  
  var addresses: js.Array[String] = js.native
  
  var rawTxt: Buffer = js.native
  
  var referer: RemoteInfo = js.native
}
object RemoteService {
  
  @scala.inline
  def apply(
    addresses: js.Array[String],
    fqdn: String,
    host: String,
    name: String,
    port: Double,
    protocol: String,
    rawTxt: Buffer,
    referer: RemoteInfo,
    subtypes: js.Array[String],
    txt: StringDictionary[String],
    `type`: String
  ): RemoteService = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], fqdn = fqdn.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], rawTxt = rawTxt.asInstanceOf[js.Any], referer = referer.asInstanceOf[js.Any], subtypes = subtypes.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteService]
  }
  
  @scala.inline
  implicit class RemoteServiceOps[Self <: RemoteService] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTxt(value: Buffer): Self = this.set("rawTxt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferer(value: RemoteInfo): Self = this.set("referer", value.asInstanceOf[js.Any])
  }
}
