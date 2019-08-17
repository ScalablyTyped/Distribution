package typings.codepage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codepageMod {
  import typings.std.Uint8Array

  type CP$Data = String | js.Array[Double] | Uint8Array
  type CP$Index = Double | String
  type CP$String = String | js.Array[String] | Uint8Array
}
