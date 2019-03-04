package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandResult extends js.Object {
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): scala.Unit
}

object DefineCommandResult {
  @scala.inline
  def apply(defineEventStreamsToLoad: js.Function1[defineEventStreamsToLoadHandler, scala.Unit]): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = defineEventStreamsToLoad)
  
    __obj.asInstanceOf[DefineCommandResult]
  }
}

