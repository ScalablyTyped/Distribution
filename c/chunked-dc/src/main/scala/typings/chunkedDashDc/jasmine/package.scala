package typings.chunkedDashDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  import org.scalablytyped.runtime.StringDictionary

  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean]
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]
  type StringPrettyPrinter = PrettyPrinter
}
