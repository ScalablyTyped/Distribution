package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): Unit
  def listen(listener: ListenerOf1[T]): Unlisten
}

object ChangeEmitterOf1 {
  @scala.inline
  def apply[T](emit: T => Unit, listen: ListenerOf1[T] => Unlisten): ChangeEmitterOf1[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[ChangeEmitterOf1[T]]
  }
}

