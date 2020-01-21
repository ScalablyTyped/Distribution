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
  def apply(Name: DocumentARN, Version: DocumentVersion = null): DocumentRequires = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRequires]
  }
}

