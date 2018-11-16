package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to store factor gradient */
@JSGlobal("BABYLON.FactorGradient")
@js.native
class FactorGradient () extends IValueGradient {
  /**
           * Gets or sets first associated factor
           */
  var factor1: scala.Double = js.native
  /**
           * Gets or sets second associated factor
           */
  var factor2: js.UndefOr[scala.Double] = js.native
  /**
           * Gets or sets the gradient value (between 0 and 1)
           */
  /* CompleteClass */
  override var gradient: scala.Double = js.native
  /**
           * Will get a number picked randomly between factor1 and factor2.
           * If factor2 is undefined then factor1 will be used
           * @returns the picked number
           */
  def getFactor(): scala.Double = js.native
}

