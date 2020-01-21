package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentDefaultVersionDescription extends js.Object {
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.native
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.native
}

object DocumentDefaultVersionDescription {
  @scala.inline
  def apply(
    DefaultVersion: DocumentVersion = null,
    DefaultVersionName: DocumentVersionName = null,
    Name: DocumentName = null
  ): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    if (DefaultVersion != null) __obj.updateDynamic("DefaultVersion")(DefaultVersion.asInstanceOf[js.Any])
    if (DefaultVersionName != null) __obj.updateDynamic("DefaultVersionName")(DefaultVersionName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
}

