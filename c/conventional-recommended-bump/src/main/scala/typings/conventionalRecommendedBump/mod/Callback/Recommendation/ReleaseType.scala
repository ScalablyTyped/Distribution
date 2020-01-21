package typings.conventionalRecommendedBump.mod.Callback.Recommendation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major
  - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor
  - typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major = this.cast("major")
  @scala.inline
  def minor: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typings.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch = this.cast("patch")
}

