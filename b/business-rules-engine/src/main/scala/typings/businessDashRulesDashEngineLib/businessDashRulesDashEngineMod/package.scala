package typings
package businessDashRulesDashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object businessDashRulesDashEngineMod {
  type IAsyncValidate = js.Function1[/* args */ IError, qLib.qMod.Promise[js.Any]]
  type IErrorCustomMessage = js.Function2[/* config */ js.Any, /* args */ js.Any, java.lang.String]
  type IOptional = js.Function0[scala.Boolean]
  type IValidate = js.Function1[/* args */ IError, scala.Unit]
}
