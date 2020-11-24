package typings.cliTable2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Head extends js.Object {
  
  var border: js.UndefOr[js.Array[String]] = js.native
  
  var head: js.UndefOr[js.Array[String]] = js.native
  
  var `padding-left`: js.UndefOr[Double] = js.native
  
  var `padding-right`: js.UndefOr[Double] = js.native
}
object Head {
  
  @scala.inline
  def apply(): Head = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Head]
  }
  
  @scala.inline
  implicit class HeadOps[Self <: Head] (val x: Self) extends AnyVal {
    
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
    def setBorderVarargs(value: String*): Self = this.set("border", js.Array(value :_*))
    
    @scala.inline
    def setBorder(value: js.Array[String]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: Double): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: Double): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
  }
}
