package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptionsWithID extends StObject {
  
  var collectionID: String
}
object CollectionOptionsWithID {
  
  inline def apply(collectionID: String): CollectionOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionOptionsWithID] (val x: Self) extends AnyVal {
    
    inline def setCollectionID(value: String): Self = StObject.set(x, "collectionID", value.asInstanceOf[js.Any])
  }
}
