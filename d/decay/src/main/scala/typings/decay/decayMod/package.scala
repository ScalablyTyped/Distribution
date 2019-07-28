package typings.decay

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decayMod {
  type HackerNewsHotFunction = js.Function2[/* votes */ Double, /* date */ Date, Double]
  type RedditHotFunction = js.Function3[/* upvotes */ Double, /* downvotes */ Double, /* date */ Date, Double]
  type WilsonScoreFunction = js.Function2[/* upvotes */ Double, /* downvotes */ Double, Double]
}
