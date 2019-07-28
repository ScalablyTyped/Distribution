package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextExecution extends js.Object {
  def nextExecution(): Double
}

object Anon_NextExecution {
  @scala.inline
  def apply(nextExecution: () => Double): Anon_NextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = js.Any.fromFunction0(nextExecution))
  
    __obj.asInstanceOf[Anon_NextExecution]
  }
}

