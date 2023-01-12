package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriBuilder extends StObject {
  
  def buildUri(entityQuery: EntityQuery, metadataStore: MetadataStore): String
  
  def initialize(): Unit
  
  var name: String
}
object UriBuilder {
  
  inline def apply(buildUri: (EntityQuery, MetadataStore) => String, initialize: () => Unit, name: String): UriBuilder = {
    val __obj = js.Dynamic.literal(buildUri = js.Any.fromFunction2(buildUri), initialize = js.Any.fromFunction0(initialize), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UriBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuildUri(value: (EntityQuery, MetadataStore) => String): Self = StObject.set(x, "buildUri", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
