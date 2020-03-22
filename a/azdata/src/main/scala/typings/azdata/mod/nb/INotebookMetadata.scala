package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookMetadata extends js.Object {
  var kernelspec: IKernelInfo
  var language_info: js.UndefOr[ILanguageInfo] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object INotebookMetadata {
  @scala.inline
  def apply(kernelspec: IKernelInfo, language_info: ILanguageInfo = null, tags: js.Array[String] = null): INotebookMetadata = {
    val __obj = js.Dynamic.literal(kernelspec = kernelspec.asInstanceOf[js.Any])
    if (language_info != null) __obj.updateDynamic("language_info")(language_info.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
}

