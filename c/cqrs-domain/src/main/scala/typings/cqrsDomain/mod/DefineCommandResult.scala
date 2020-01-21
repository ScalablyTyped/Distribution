package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandResult extends js.Object {
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): Unit
}

object DefineCommandResult {
  @scala.inline
  def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => Unit): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = js.Any.fromFunction1(defineEventStreamsToLoad))
  
    __obj.asInstanceOf[DefineCommandResult]
  }
}

