package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityCollectionChangedEventArgs extends StObject {
  
  /** The entity collection the event was triggered from. */
  var collection: EntityCollection = js.native
  
  /** The IPrimitive object that the event occurred for. */
  var data: IPrimitive = js.native
}
object IEntityCollectionChangedEventArgs {
  
  @scala.inline
  def apply(collection: EntityCollection, data: IPrimitive): IEntityCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCollectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class IEntityCollectionChangedEventArgsMutableBuilder[Self <: IEntityCollectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: EntityCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IPrimitive): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
