package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: chromeDashAppsLib.chromeNs.integer
  /** Human readable name of the sink. */
  var name: java.lang.String
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CONNECTED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONNECTED[keyof chrome-apps.Anon_CONNECTED] */ js.Any
    ]
  ]
}

