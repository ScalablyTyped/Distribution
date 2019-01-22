package typings
package atBlueprintjsSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonListItemsPropsMod {
  type ItemsEqualComparator[T] = js.Function2[/* itemA */ T, /* itemB */ T, scala.Boolean]
  type ItemsEqualProp[T] = ItemsEqualComparator[T] | java.lang.String
}
