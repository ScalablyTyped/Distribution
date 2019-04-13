package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandResult extends js.Object {
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): scala.Unit
}

object DefineCommandResult {
  @scala.inline
  def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => scala.Unit): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = js.Any.fromFunction1(defineEventStreamsToLoad))
  
    __obj.asInstanceOf[DefineCommandResult]
  }
}

