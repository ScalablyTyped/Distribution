package typings
package cassanknexLib.cassanknexMod

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
    withDurableWrites: scala.Boolean => KeyspaceableQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[scala.Double] => KeyspaceableQueryBuilder,
    withSimpleStrategy: scala.Double => KeyspaceableQueryBuilder
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal(withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
  
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
}

