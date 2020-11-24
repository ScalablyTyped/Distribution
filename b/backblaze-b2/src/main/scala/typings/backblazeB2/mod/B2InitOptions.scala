package typings.backblazeB2.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait B2InitOptions extends js.Object {
  
  var applicationKey: String = js.native
  
  var applicationKeyId: String = js.native
  
  var axios: js.UndefOr[Record[String, _]] = js.native
  
  var retry: js.UndefOr[Record[String, _]] = js.native
}
object B2InitOptions {
  
  @scala.inline
  def apply(applicationKey: String, applicationKeyId: String): B2InitOptions = {
    val __obj = js.Dynamic.literal(applicationKey = applicationKey.asInstanceOf[js.Any], applicationKeyId = applicationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[B2InitOptions]
  }
  
  @scala.inline
  implicit class B2InitOptionsOps[Self <: B2InitOptions] (val x: Self) extends AnyVal {
    
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
    def setApplicationKey(value: String): Self = this.set("applicationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationKeyId(value: String): Self = this.set("applicationKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxios(value: Record[String, _]): Self = this.set("axios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxios: Self = this.set("axios", js.undefined)
    
    @scala.inline
    def setRetry(value: Record[String, _]): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
}
