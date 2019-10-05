package typings.cordovaDashUniversalDashLinksDashPlugin.universalLinks

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var hash: String
  var host: String
  var params: StringDictionary[String]
  var path: String
  var scheme: String
  var url: String
}

object EventData {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    params: StringDictionary[String],
    path: String,
    scheme: String,
    url: String
  ): EventData = {
    val __obj = js.Dynamic.literal(hash = hash, host = host, params = params, path = path, scheme = scheme, url = url)
  
    __obj.asInstanceOf[EventData]
  }
}

