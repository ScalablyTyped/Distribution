package typings.contentfulManagement.commonTypesMod

import typings.contentfulManagement.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T, TPlain]
  extends CollectionProp[T]
     with DefaultElements[CollectionProp[TPlain]]
object Collection {
  
  @scala.inline
  def apply[T, TPlain](
    items: js.Array[T],
    limit: Double,
    skip: Double,
    sys: Type,
    toPlainObject: () => CollectionProp[TPlain],
    total: Double
  ): Collection[T, TPlain] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection[T, TPlain]]
  }
}
