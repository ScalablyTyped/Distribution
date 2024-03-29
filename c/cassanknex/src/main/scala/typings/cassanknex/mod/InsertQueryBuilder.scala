package typings.cassanknex.mod

import typings.cassandraDriver.libTypesMod.types.ResultSet
import typings.cassandraDriver.libTypesMod.types.Row
import typings.cassandraDriver.mod.ValueCallback
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
    bindings: () => js.Array[Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Unit,
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
