package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionOptionsWithID extends StObject {
  
  var collectionID: String = js.native
}
object CollectionOptionsWithID {
  
  @scala.inline
  def apply(collectionID: String): CollectionOptionsWithID = {
    val __obj = js.Dynamic.literal(collectionID = collectionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithID]
  }
  
  @scala.inline
  implicit class CollectionOptionsWithIDMutableBuilder[Self <: CollectionOptionsWithID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionID(value: String): Self = StObject.set(x, "collectionID", value.asInstanceOf[js.Any])
  }
}
