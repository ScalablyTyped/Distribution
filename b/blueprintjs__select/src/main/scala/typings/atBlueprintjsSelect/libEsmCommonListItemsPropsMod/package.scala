package typings.atBlueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonListItemsPropsMod {
  type ItemsEqualComparator[T] = js.Function2[/* itemA */ T, /* itemB */ T, Boolean]
  type ItemsEqualProp[T] = ItemsEqualComparator[T] | String
}
