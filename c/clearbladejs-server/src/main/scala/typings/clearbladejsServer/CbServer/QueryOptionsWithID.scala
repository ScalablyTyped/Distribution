package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptionsWithID
  extends StObject
     with CollectionOptionsWithID
     with QueryOptions
object QueryOptionsWithID {
  
  inline def apply(collectionID: String): QueryOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithID]
  }
}
