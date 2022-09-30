package typings.chance.Chance

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.chance.chanceBooleans.`false`
  - scala.Null
  - scala.Unit
  - typings.chance.chanceInts.`0`
  - scala.Double
  - typings.chance.chanceStrings._empty
*/
type FalsyType = js.UndefOr[_FalsyType | Null | Double]

type MixinDescriptor = StringDictionary[js.Function1[/* repeated */ Any, Any]]

type NameOptions = FullNameOptions & FirstNameOptions & LastNameOptions & PrefixOptions

// A more rigorous approach might be to produce
// the correct options interfaces for each method
type Options = StringDictionary[Any]

type Seed = Double | String
