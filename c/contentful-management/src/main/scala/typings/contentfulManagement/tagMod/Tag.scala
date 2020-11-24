package typings.contentfulManagement.tagMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag
  extends TagProps
     with DefaultElements[TagProps]
     with TagApi
object Tag {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    name: String,
    sys: TagSysProps,
    toPlainObject: () => TagProps,
    update: () => js.Promise[Tag]
  ): Tag = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Tag]
  }
}
