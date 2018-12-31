package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 53
  */
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: java.lang.String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: chromeDashAppsLib.chromeNs.integer
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: java.lang.String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum DisplayPosition
    */
  var position: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_RIGHT, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_RIGHT[keyof chrome-apps.Anon_RIGHT] */ js.Any
    ]
  ]
}

