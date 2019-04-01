package typings
package atBlueprintjsSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonPredicateMod {
  type ItemListPredicate[T] = js.Function2[/* query */ java.lang.String, /* items */ js.Array[T], js.Array[T]]
  type ItemPredicate[T] = js.Function4[
    /* query */ java.lang.String, 
    /* item */ T, 
    /* index */ js.UndefOr[scala.Double], 
    /* exactMatch */ js.UndefOr[scala.Boolean], 
    scala.Boolean
  ]
}
