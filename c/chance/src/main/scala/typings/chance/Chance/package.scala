package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chance {
  /* Rewritten from type alias, can be one of: 
    - typings.chance.chanceBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.chance.chanceNumbers.`0`
    - scala.Double
    - typings.chance.chanceStrings._empty
  */
  type FalsyType = js.UndefOr[typings.chance.Chance._FalsyType | scala.Null | scala.Double]
  type MixinDescriptor = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  // A more rigorous approach might be to produce
  // the correct options interfaces for each method
  type Options = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Seed = scala.Double | java.lang.String
}
