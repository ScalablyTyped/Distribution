package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertMarkers extends js.Object {
  
  var convertMarkers: js.UndefOr[Boolean] = js.native
  
  var rootName: js.UndefOr[String] = js.native
  
  var withoutSelection: js.UndefOr[Boolean] = js.native
}
object ConvertMarkers {
  
  @scala.inline
  def apply(): ConvertMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertMarkers]
  }
  
  @scala.inline
  implicit class ConvertMarkersOps[Self <: ConvertMarkers] (val x: Self) extends AnyVal {
    
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
    def setConvertMarkers(value: Boolean): Self = this.set("convertMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertMarkers: Self = this.set("convertMarkers", js.undefined)
    
    @scala.inline
    def setRootName(value: String): Self = this.set("rootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
    
    @scala.inline
    def setWithoutSelection(value: Boolean): Self = this.set("withoutSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutSelection: Self = this.set("withoutSelection", js.undefined)
  }
}
