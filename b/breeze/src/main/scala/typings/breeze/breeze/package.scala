package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EntityActionSymbol = typings.breeze.breeze.core.EnumSymbol

type ExecuteQueryErrorCallback = js.Function1[/* error */ typings.breeze.anon.EntityManager, scala.Unit]

type ExecuteQuerySuccessCallback = js.Function1[/* data */ typings.breeze.breeze.QueryResult, scala.Unit]

type FilterQueryOpSymbol = typings.breeze.breeze.core.EnumSymbol

type MergeStrategySymbol = typings.breeze.breeze.core.EnumSymbol

type SaveChangesErrorCallback = js.Function1[/* error */ typings.breeze.anon.EntityErrors, scala.Unit]

type SaveChangesSuccessCallback = js.Function1[/* saveResult */ typings.breeze.breeze.SaveResult, scala.Unit]

type ValidatorFunction = js.Function2[
/* value */ js.Any, 
/* context */ typings.breeze.breeze.ValidatorFunctionContext, 
scala.Unit]
