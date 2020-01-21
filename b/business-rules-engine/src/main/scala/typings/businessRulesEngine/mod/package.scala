package typings.businessRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IAsyncValidate = js.Function1[/* args */ typings.businessRulesEngine.mod.IError, typings.q.mod.Promise[js.Any]]
  type IErrorCustomMessage = js.Function2[/* config */ js.Any, /* args */ js.Any, java.lang.String]
  type IOptional = js.Function0[scala.Boolean]
  type IValidate = js.Function1[/* args */ typings.businessRulesEngine.mod.IError, scala.Unit]
}
