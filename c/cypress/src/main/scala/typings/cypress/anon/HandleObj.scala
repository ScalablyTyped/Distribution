package typings.cypress.anon

import typings.cypress.JQuery.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleObj[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData]
}

object HandleObj {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObj[TTarget, TData]]
  }
}

