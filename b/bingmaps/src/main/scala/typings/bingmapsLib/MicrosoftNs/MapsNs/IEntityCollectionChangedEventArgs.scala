package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityCollectionChangedEventArgs extends js.Object {
  /** The entity collection the event was triggered from. */
  var collection: EntityCollection
  /** The IPrimitive object that the event occurred for. */
  var data: IPrimitive
}

object IEntityCollectionChangedEventArgs {
  @scala.inline
  def apply(collection: EntityCollection, data: IPrimitive): IEntityCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(collection = collection, data = data)
  
    __obj.asInstanceOf[IEntityCollectionChangedEventArgs]
  }
}

