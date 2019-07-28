package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyspaceableQueryBuilder extends js.Object {
  def withDurableWrites(durableWrites: Boolean): this.type
  def withNetworkTopologyStrategy(strategy: MappedDict[Double]): this.type
  def withSimpleStrategy(replicas: Double): this.type
}

object KeyspaceableQueryBuilder {
  @scala.inline
  def apply(
    withDurableWrites: Boolean => KeyspaceableQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[Double] => KeyspaceableQueryBuilder,
    withSimpleStrategy: Double => KeyspaceableQueryBuilder
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal(withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
  
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
}

