package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bull", JSImport.Namespace)
@js.native
class ^[T] protected () extends Queue[T] {
  def this(queueName: java.lang.String) = this()
  def this(queueName: java.lang.String, opts: QueueOptions) = this()
  def this(queueName: java.lang.String, url: java.lang.String) = this()
  def this(queueName: java.lang.String, url: java.lang.String, opts: QueueOptions) = this()
}

@JSImport("bull", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* tslint:disable:no-unnecessary-generics unified-signatures */
  def apply[T](queueName: java.lang.String): Queue[T] = js.native
  def apply[T](queueName: java.lang.String, opts: QueueOptions): Queue[T] = js.native
  def apply[T](queueName: java.lang.String, url: java.lang.String): Queue[T] = js.native
  def apply[T](queueName: java.lang.String, url: java.lang.String, opts: QueueOptions): Queue[T] = js.native
}

