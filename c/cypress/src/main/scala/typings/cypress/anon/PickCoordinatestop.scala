package typings.cypress.anon

import typings.cypress.JQuery._CoordinatesPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<cypress.JQuery.Coordinates, 'top'> */
trait PickCoordinatestop extends _CoordinatesPartial {
  var top: Double
}

object PickCoordinatestop {
  @scala.inline
  def apply(top: Double): PickCoordinatestop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatestop]
  }
}

