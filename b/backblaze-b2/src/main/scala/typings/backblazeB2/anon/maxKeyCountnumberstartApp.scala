package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  maxKeyCount :number,   startApplicationKeyId :string} & backblaze-b2.backblaze-b2.CommonArgs */
@js.native
trait maxKeyCountnumberstartApp extends js.Object {
  
  var axios: js.UndefOr[Record[String, _]] = js.native
  
  var axiosOverride: js.UndefOr[Record[String, _]] = js.native
  
  var maxKeyCount: Double = js.native
  
  var startApplicationKeyId: String = js.native
}
object maxKeyCountnumberstartApp {
  
  @scala.inline
  def apply(maxKeyCount: Double, startApplicationKeyId: String): maxKeyCountnumberstartApp = {
    val __obj = js.Dynamic.literal(maxKeyCount = maxKeyCount.asInstanceOf[js.Any], startApplicationKeyId = startApplicationKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[maxKeyCountnumberstartApp]
  }
  
  @scala.inline
  implicit class maxKeyCountnumberstartAppOps[Self <: maxKeyCountnumberstartApp] (val x: Self) extends AnyVal {
    
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
    def setMaxKeyCount(value: Double): Self = this.set("maxKeyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartApplicationKeyId(value: String): Self = this.set("startApplicationKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxios(value: Record[String, _]): Self = this.set("axios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxios: Self = this.set("axios", js.undefined)
    
    @scala.inline
    def setAxiosOverride(value: Record[String, _]): Self = this.set("axiosOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxiosOverride: Self = this.set("axiosOverride", js.undefined)
  }
}
