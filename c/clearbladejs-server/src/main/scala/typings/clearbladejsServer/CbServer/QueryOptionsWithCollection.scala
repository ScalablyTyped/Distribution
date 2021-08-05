package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptionsWithCollection
  extends StObject
     with CollectionOptionsWithCollection
     with QueryOptions
object QueryOptionsWithCollection {
  
  inline def apply(collection: String): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
}
