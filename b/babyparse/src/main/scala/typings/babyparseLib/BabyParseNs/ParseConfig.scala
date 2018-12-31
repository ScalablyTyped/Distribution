package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
                // default: false
  var comments: js.UndefOr[scala.Boolean] = js.undefined
    // default: undefined
  var complete: js.UndefOr[js.Function1[/* results */ ParseResult, scala.Unit]] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
              // default: false
  var download: js.UndefOr[scala.Boolean] = js.undefined
                // default: false
  var dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined
                // default: 0
  var encoding: js.UndefOr[java.lang.String] = js.undefined
        // default: false
  var fastMode: js.UndefOr[scala.Boolean] = js.undefined
                // default: ""
  var header: js.UndefOr[scala.Boolean] = js.undefined
              // default: ""
  var newline: js.UndefOr[java.lang.String] = js.undefined
         // default: false
  var preview: js.UndefOr[scala.Double] = js.undefined
              // default: false
  var skipEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
              // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
               // default: ""
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

