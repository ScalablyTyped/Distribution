package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  /**
    * Set formatter for the label on each donut piece.
    */
  var format: js.UndefOr[
    js.Function3[
      /* value */ scala.Double, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Show or hide label on each donut piece.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set threshold to show/hide labels.
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

