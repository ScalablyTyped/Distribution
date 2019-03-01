package typings
package cordovaDashUniversalDashLinksDashPluginLib.universalLinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var path: java.lang.String
  var scheme: java.lang.String
  var url: java.lang.String
}

object EventData {
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    path: java.lang.String,
    scheme: java.lang.String,
    url: java.lang.String
  ): EventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EventData]
  }
}

