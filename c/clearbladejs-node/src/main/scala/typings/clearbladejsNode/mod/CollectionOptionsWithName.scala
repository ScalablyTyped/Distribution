package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptionsWithName extends StObject {
  
  var collectionName: String
}
object CollectionOptionsWithName {
  
  @scala.inline
  def apply(collectionName: String): CollectionOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithName]
  }
  
  @scala.inline
  implicit class CollectionOptionsWithNameMutableBuilder[Self <: CollectionOptionsWithName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
  }
}
