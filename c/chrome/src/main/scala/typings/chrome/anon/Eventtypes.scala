package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eventtypes extends js.Object {
  
  var event_types: js.UndefOr[js.Array[String]] = js.native
  
  var gender: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var voice_name: String = js.native
}
object Eventtypes {
  
  @scala.inline
  def apply(voice_name: String): Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventtypes]
  }
  
  @scala.inline
  implicit class EventtypesOps[Self <: Eventtypes] (val x: Self) extends AnyVal {
    
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
    def setVoice_name(value: String): Self = this.set("voice_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_typesVarargs(value: String*): Self = this.set("event_types", js.Array(value :_*))
    
    @scala.inline
    def setEvent_types(value: js.Array[String]): Self = this.set("event_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_types: Self = this.set("event_types", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
  }
}
