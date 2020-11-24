package typings.dataUrls.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataURL extends js.Object {
  
  var body: Buffer = js.native
  
  var mimeType: typings.whatwgMimetype.mod.^ = js.native
}
object DataURL {
  
  @scala.inline
  def apply(body: Buffer, mimeType: typings.whatwgMimetype.mod.^): DataURL = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataURL]
  }
  
  @scala.inline
  implicit class DataURLOps[Self <: DataURL] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: typings.whatwgMimetype.mod.^): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
}
