package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertQueryBuilder
  extends StObject
     with QueryBuilder
     with InsertableQueryBuilder
     with TtlableQueryBuilder
object InsertQueryBuilder {
  
  inline def apply(
    bindings: () => js.Array[js.Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    ifNotExists: () => InsertQueryBuilder,
    into: String => InsertQueryBuilder,
    stream: StreamParams => Unit,
    usingTTL: Double => InsertQueryBuilder,
    usingTimestamp: Double => InsertQueryBuilder
  ): InsertQueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = js.Any.fromFunction0(bindings), cql = js.Any.fromFunction0(cql), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), ifNotExists = js.Any.fromFunction0(ifNotExists), into = js.Any.fromFunction1(into), stream = js.Any.fromFunction1(stream), usingTTL = js.Any.fromFunction1(usingTTL), usingTimestamp = js.Any.fromFunction1(usingTimestamp))
    __obj.asInstanceOf[InsertQueryBuilder]
  }
}
