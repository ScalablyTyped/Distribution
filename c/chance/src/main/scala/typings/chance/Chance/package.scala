package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chance {
  type MixinDescriptor = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type NameOptions = typings.chance.Chance.FullNameOptions with typings.chance.Chance.FirstNameOptions with typings.chance.Chance.LastNameOptions with typings.chance.Chance.PrefixOptions
  // A more rigorous approach might be to produce
  // the correct options interfaces for each method
  type Options = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PrefixOptions = typings.chance.AnonAll with typings.chance.Chance.SuffixOptions
  type Seed = scala.Double | java.lang.String
  type StringOptions = typings.chance.Chance.CharacterOptions with typings.chance.AnonLength
  type UniqueOptions[T] = typings.chance.AnonArray[T] with typings.chance.Chance.Options
}
