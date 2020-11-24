package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityCollectionChangedEventArgs extends js.Object {
  
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
  implicit class IEntityCollectionChangedEventArgsOps[Self <: IEntityCollectionChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: EntityCollection): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: IPrimitive): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
