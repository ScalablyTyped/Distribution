package typings.businessDashRulesDashEngine

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object businessDashRulesDashEngineMod {
  type IAsyncValidate = js.Function1[/* args */ IError, Promise[js.Any]]
  type IErrorCustomMessage = js.Function2[/* config */ js.Any, /* args */ js.Any, String]
  type IOptional = js.Function0[Boolean]
  type IValidate = js.Function1[/* args */ IError, Unit]
}
