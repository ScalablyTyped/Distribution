package typings.breeze

import typings.breeze.Anon_EntityErrors
import typings.breeze.Anon_EntityManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breezeNs {
  type ExecuteQueryErrorCallback = js.Function1[/* error */ Anon_EntityManager, Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ QueryResult, Unit]
  type SaveChangesErrorCallback = js.Function1[/* error */ Anon_EntityErrors, Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ SaveResult, Unit]
  type ValidatorFunction = js.Function2[/* value */ js.Any, /* context */ ValidatorFunctionContext, Unit]
}
