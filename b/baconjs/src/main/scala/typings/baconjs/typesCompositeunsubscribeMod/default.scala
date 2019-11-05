package typings.baconjs.typesCompositeunsubscribeMod

import typings.baconjs.typesTypesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/compositeunsubscribe", JSImport.Default)
@js.native
class default () extends CompositeUnsubscribe {
  def this(ss: js.Array[Subscription]) = this()
  /* CompleteClass */
  override var starting: js.Array[Subscription] = js.native
  /* CompleteClass */
  override var subscriptions: js.Array[Unsub] = js.native
  /* CompleteClass */
  override var unsubscribed: Boolean = js.native
  /* CompleteClass */
  override def add(subscription: Subscription): Unit = js.native
  /* CompleteClass */
  override def count(): Double = js.native
  /* CompleteClass */
  override def empty(): Boolean = js.native
  /* CompleteClass */
  override def remove(unsub: Unsub): Unit = js.native
  /* CompleteClass */
  override def unsubscribe(): Unit = js.native
}

