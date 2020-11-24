package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListData extends js.Object {
  
  var bulletChar: js.UndefOr[String] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var tight: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ListData {
  
  @scala.inline
  def apply(): ListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListData]
  }
  
  @scala.inline
  implicit class ListDataOps[Self <: ListData] (val x: Self) extends AnyVal {
    
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
    def setBulletChar(value: String): Self = this.set("bulletChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletChar: Self = this.set("bulletChar", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setTight(value: Boolean): Self = this.set("tight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTight: Self = this.set("tight", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
