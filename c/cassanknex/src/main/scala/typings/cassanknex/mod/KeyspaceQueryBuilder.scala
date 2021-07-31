package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyspaceQueryBuilder
  extends StObject
     with QueryBuilder
     with KeyspaceableQueryBuilder
object KeyspaceQueryBuilder {
  
  @scala.inline
  def apply(
    bindings: () => js.Array[js.Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit,
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
