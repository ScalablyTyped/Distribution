package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ViewOptions[TModel /* <: Model */] extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  // TODO: quickfix, this can't be fixed easy. The collection does not need to have the same model as the parent view.
  var collection: js.UndefOr[Collection[_]] = js.undefined
   //was: Collection<TModel>;
  var el: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[EventsHash] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[TModel] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

