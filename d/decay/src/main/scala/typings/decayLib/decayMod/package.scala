package typings
package decayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decayMod {
  type HackerNewsHotFunction = js.Function2[/* votes */ scala.Double, /* date */ stdLib.Date, scala.Double]
  type RedditHotFunction = js.Function3[
    /* upvotes */ scala.Double, 
    /* downvotes */ scala.Double, 
    /* date */ stdLib.Date, 
    scala.Double
  ]
  type WilsonScoreFunction = js.Function2[/* upvotes */ scala.Double, /* downvotes */ scala.Double, scala.Double]
}
