package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentRequires extends js.Object {
  /**
    * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
    */
  var Name: DocumentARN = js.native
  /**
    * The document version required by the current document.
    */
  var Version: js.UndefOr[DocumentVersion] = js.native
}

object DocumentRequires {
  @scala.inline
  def apply(Name: DocumentARN): DocumentRequires = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRequires]
  }
  @scala.inline
  implicit class DocumentRequiresOps[Self <: DocumentRequires] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: DocumentVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

