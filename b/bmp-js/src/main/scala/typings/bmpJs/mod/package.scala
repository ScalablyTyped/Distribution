package typings.bmpJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Decode_ = js.Function1[/* bmpData */ typings.node.Buffer, typings.bmpJs.mod.BmpDecoder]
  type Encode_ = js.Function2[
    /* imgData */ typings.bmpJs.mod.ImageData, 
    /* quality */ js.UndefOr[scala.Double], 
    typings.bmpJs.mod.ImageData
  ]
}
