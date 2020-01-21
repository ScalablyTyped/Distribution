package typings.conventionalRecommendedBump

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * `recommendation` is an `object` with a single property, `releaseType`.
    *
    * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
    * or `undefined` if `whatBump` does not return a valid `level` property, or
    * the `level` property is not set by `whatBump`.
    */
  type Callback = js.Function2[
    /* error */ js.Any, 
    /* recommendation */ typings.conventionalRecommendedBump.mod.Callback.Recommendation, 
    scala.Unit
  ]
  type Options = typings.conventionalRecommendedBump.mod.Options_
}
