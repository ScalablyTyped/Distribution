package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSetSortingOptions[TModel /* <: backboneLib.backboneMod.Model */] extends js.Object {
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var side: js.UndefOr[java.lang.String] = js.undefined
  var sortValue: js.UndefOr[
    js.Function2[/* model */ TModel, /* sortKey */ java.lang.String, _ | java.lang.String]
  ] = js.undefined
}

