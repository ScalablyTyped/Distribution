package typings.cypress

import typings.cypress.JQuery_.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleObjHandleObject[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData]
}

object AnonHandleObjHandleObject {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): AnonHandleObjHandleObject[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHandleObjHandleObject[TTarget, TData]]
  }
}

