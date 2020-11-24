package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyspaceableQueryBuilder extends js.Object {
  
  def withDurableWrites(durableWrites: Boolean): this.type = js.native
  
  def withNetworkTopologyStrategy(strategy: MappedDict[Double]): this.type = js.native
  
  def withSimpleStrategy(replicas: Double): this.type = js.native
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
  
  @scala.inline
  implicit class KeyspaceableQueryBuilderOps[Self <: KeyspaceableQueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWithDurableWrites(value: Boolean => KeyspaceableQueryBuilder): Self = this.set("withDurableWrites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithNetworkTopologyStrategy(value: MappedDict[Double] => KeyspaceableQueryBuilder): Self = this.set("withNetworkTopologyStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithSimpleStrategy(value: Double => KeyspaceableQueryBuilder): Self = this.set("withSimpleStrategy", js.Any.fromFunction1(value))
  }
}
