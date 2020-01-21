package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateFns {
  type CurriedFn1[A, R] = js.Function1[/* a */ A, R]
  type DurationAliased = typings.dateFns.Duration
  type IntervalAliased = typings.dateFns.Interval
  type LocaleAliased = typings.dateFns.Locale
}
