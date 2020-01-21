package typings.bumpRegex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* err */ java.lang.String | typings.std.Error | scala.Null, 
    /* opts */ js.UndefOr[typings.bumpRegex.mod.Result], 
    scala.Unit
  ]
}
