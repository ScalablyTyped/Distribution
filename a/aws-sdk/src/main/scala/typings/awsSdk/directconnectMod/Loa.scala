package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loa extends js.Object {
  
  /**
    * The binary contents of the LOA-CFA document.
    */
  var loaContent: js.UndefOr[LoaContent] = js.native
  
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
}
object Loa {
  
  @scala.inline
  def apply(): Loa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loa]
  }
  
  @scala.inline
  implicit class LoaOps[Self <: Loa] (val x: Self) extends AnyVal {
    
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
    def setLoaContent(value: LoaContent): Self = this.set("loaContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaContent: Self = this.set("loaContent", js.undefined)
    
    @scala.inline
    def setLoaContentType(value: LoaContentType): Self = this.set("loaContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaContentType: Self = this.set("loaContentType", js.undefined)
  }
}
