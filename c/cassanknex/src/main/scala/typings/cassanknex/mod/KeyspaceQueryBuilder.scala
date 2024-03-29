package typings.cassanknex.mod

import typings.cassandraDriver.libTypesMod.types.ResultSet
import typings.cassandraDriver.libTypesMod.types.Row
import typings.cassandraDriver.mod.ValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyspaceQueryBuilder
  extends StObject
     with QueryBuilder
     with KeyspaceableQueryBuilder
object KeyspaceQueryBuilder {
  
  inline def apply(
    bindings: () => js.Array[Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    stream: StreamParams => Unit,
    withDurableWrites: Boolean => KeyspaceQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[Double] => KeyspaceQueryBuilder,
    withSimpleStrategy: Double => KeyspaceQueryBuilder
  ): KeyspaceQueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = js.Any.fromFunction0(bindings), cql = js.Any.fromFunction0(cql), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), stream = js.Any.fromFunction1(stream), withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
    __obj.asInstanceOf[KeyspaceQueryBuilder]
  }
}
