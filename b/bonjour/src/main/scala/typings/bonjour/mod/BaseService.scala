package typings.bonjour.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseService extends js.Object {
  
  var fqdn: String = js.native
  
  var host: String = js.native
  
  var name: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var subtypes: js.Array[String] = js.native
  
  var txt: StringDictionary[String] = js.native
  
  var `type`: String = js.native
}
object BaseService {
  
  @scala.inline
  def apply(
    fqdn: String,
    host: String,
    name: String,
    port: Double,
    protocol: String,
    subtypes: js.Array[String],
    txt: StringDictionary[String],
    `type`: String
  ): BaseService = {
    val __obj = js.Dynamic.literal(fqdn = fqdn.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], subtypes = subtypes.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseService]
  }
  
  @scala.inline
  implicit class BaseServiceOps[Self <: BaseService] (val x: Self) extends AnyVal {
    
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
    def setFqdn(value: String): Self = this.set("fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypesVarargs(value: String*): Self = this.set("subtypes", js.Array(value :_*))
    
    @scala.inline
    def setSubtypes(value: js.Array[String]): Self = this.set("subtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxt(value: StringDictionary[String]): Self = this.set("txt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
