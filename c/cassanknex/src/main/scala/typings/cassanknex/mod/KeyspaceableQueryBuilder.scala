package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyspaceableQueryBuilder extends StObject {
  
  def withDurableWrites(durableWrites: Boolean): this.type
  
  def withNetworkTopologyStrategy(strategy: MappedDict[Double]): this.type
  
  def withSimpleStrategy(replicas: Double): this.type
}
object KeyspaceableQueryBuilder {
  
  inline def apply(
    withDurableWrites: Boolean => KeyspaceableQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[Double] => KeyspaceableQueryBuilder,
    withSimpleStrategy: Double => KeyspaceableQueryBuilder
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal(withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyspaceableQueryBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithDurableWrites(value: Boolean => KeyspaceableQueryBuilder): Self = StObject.set(x, "withDurableWrites", js.Any.fromFunction1(value))
    
    inline def setWithNetworkTopologyStrategy(value: MappedDict[Double] => KeyspaceableQueryBuilder): Self = StObject.set(x, "withNetworkTopologyStrategy", js.Any.fromFunction1(value))
    
    inline def setWithSimpleStrategy(value: Double => KeyspaceableQueryBuilder): Self = StObject.set(x, "withSimpleStrategy", js.Any.fromFunction1(value))
  }
}
