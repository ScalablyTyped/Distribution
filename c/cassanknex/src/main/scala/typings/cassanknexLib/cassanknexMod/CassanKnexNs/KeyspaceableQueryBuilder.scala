package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyspaceableQueryBuilder extends js.Object {
  def withDurableWrites(durableWrites: scala.Boolean): this.type
  def withNetworkTopologyStrategy(strategy: MappedDict[scala.Double]): this.type
  def withSimpleStrategy(replicas: scala.Double): this.type
}

object KeyspaceableQueryBuilder {
  @scala.inline
  def apply(
    withDurableWrites: js.Function1[scala.Boolean, KeyspaceableQueryBuilder],
    withNetworkTopologyStrategy: js.Function1[MappedDict[scala.Double], KeyspaceableQueryBuilder],
    withSimpleStrategy: js.Function1[scala.Double, KeyspaceableQueryBuilder]
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal(withDurableWrites = withDurableWrites, withNetworkTopologyStrategy = withNetworkTopologyStrategy, withSimpleStrategy = withSimpleStrategy)
  
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
}

