package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptionsWithName
  extends StObject
     with CollectionOptionsWithName
     with QueryOptions
object QueryOptionsWithName {
  
  inline def apply(collectionName: String): QueryOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithName]
  }
}
