package typings.cloudmersiveVirusApiClient.anon

import typings.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apikey extends js.Object {
  
  var Apikey: ApiInstanceAuthentications = js.native
}
object Apikey {
  
  @scala.inline
  def apply(Apikey: ApiInstanceAuthentications): Apikey = {
    val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
  
  @scala.inline
  implicit class ApikeyOps[Self <: Apikey] (val x: Self) extends AnyVal {
    
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
    def setApikey(value: ApiInstanceAuthentications): Self = this.set("Apikey", value.asInstanceOf[js.Any])
  }
}
