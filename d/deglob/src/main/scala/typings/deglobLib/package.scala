package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deglobLib {
  type Callback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* files */ js.Array[java.lang.String], 
    scala.Unit
  ]
}
