package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bull", JSImport.Namespace)
@js.native
class namespaced[T] protected ()
  extends bullLib.bullMod.BullNs.Queue[T] {
  def this(queueName: java.lang.String) = this()
  def this(queueName: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions) = this()
  def this(queueName: java.lang.String, url: java.lang.String) = this()
  def this(queueName: java.lang.String, url: java.lang.String, opts: bullLib.bullMod.BullNs.QueueOptions) = this()
}

