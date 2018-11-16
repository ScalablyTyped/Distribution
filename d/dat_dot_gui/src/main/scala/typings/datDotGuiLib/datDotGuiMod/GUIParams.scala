package typings
package datDotGuiLib.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GUIParams extends js.Object {
  /**
       * Handles GUI's element placement for you.
       * @default true
       */
  var autoPlace: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, close/open button shows on top of the GUI.
       * @default false
       */
  var closeOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, starts closed.
       * @default false
       */
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, GUI is closed by the "h" keypress.
       * @default false
       */
  var hideable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * JSON object representing the saved state of this GUI.
       */
  var load: js.UndefOr[js.Any] = js.undefined
  /**
       * The name of this GUI.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The identifier for a set of saved values.
       */
  var preset: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The width of GUI element.
       */
  var width: js.UndefOr[scala.Double] = js.undefined
}

