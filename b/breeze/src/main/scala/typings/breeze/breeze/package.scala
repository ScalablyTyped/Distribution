package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breeze {
  type ExecuteQueryErrorCallback = js.Function1[/* error */ typings.breeze.AnonEntityManager, scala.Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ typings.breeze.breeze.QueryResult, scala.Unit]
  type SaveChangesErrorCallback = js.Function1[/* error */ typings.breeze.AnonEntityErrors, scala.Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ typings.breeze.breeze.SaveResult, scala.Unit]
  type ValidatorFunction = js.Function2[
    /* value */ js.Any, 
    /* context */ typings.breeze.breeze.ValidatorFunctionContext, 
    scala.Unit
  ]
}
