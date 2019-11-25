package typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod

import typings.node.urlMod.Url
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var `match`: RegExpMatchArray
  var parsedUrl: Url
}

object Context {
  @scala.inline
  def apply(`match`: RegExpMatchArray, parsedUrl: Url): Context = {
    val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

