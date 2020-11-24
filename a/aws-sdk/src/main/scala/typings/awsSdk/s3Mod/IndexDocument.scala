package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexDocument extends js.Object {
  
  /**
    * A suffix that is appended to a request that is for a directory on the website endpoint (for example,if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.
    */
  var Suffix: typings.awsSdk.s3Mod.Suffix = js.native
}
object IndexDocument {
  
  @scala.inline
  def apply(Suffix: Suffix): IndexDocument = {
    val __obj = js.Dynamic.literal(Suffix = Suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocument]
  }
  
  @scala.inline
  implicit class IndexDocumentOps[Self <: IndexDocument] (val x: Self) extends AnyVal {
    
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
    def setSuffix(value: Suffix): Self = this.set("Suffix", value.asInstanceOf[js.Any])
  }
}
