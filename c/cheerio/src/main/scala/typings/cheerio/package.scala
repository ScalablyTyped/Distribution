package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cheerio {
  type AttrFunction = js.Function3[
    /* el */ typings.cheerio.CheerioElement, 
    /* i */ scala.Double, 
    /* currentValue */ java.lang.String, 
    js.Any
  ]
}
