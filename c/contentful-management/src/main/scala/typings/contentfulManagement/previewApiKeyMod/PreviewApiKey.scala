package typings.contentfulManagement.previewApiKeyMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewApiKey
  extends PreviewApiKeyProps
     with DefaultElements[PreviewApiKeyProps]
object PreviewApiKey {
  
  @scala.inline
  def apply(description: String, name: String, sys: MetaSysProps, toPlainObject: () => PreviewApiKeyProps): PreviewApiKey = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[PreviewApiKey]
  }
}
