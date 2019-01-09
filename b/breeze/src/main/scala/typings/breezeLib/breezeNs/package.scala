package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breezeNs {
  type ExecuteQueryErrorCallback = js.Function1[/* error */ breezeLib.Anon_EntityManager, scala.Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ QueryResult, scala.Unit]
  type SaveChangesErrorCallback = js.Function1[/* error */ breezeLib.Anon_EntityErrors, scala.Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ SaveResult, scala.Unit]
  type ValidatorFunction = js.Function2[/* value */ js.Any, /* context */ ValidatorFunctionContext, scala.Unit]
}
