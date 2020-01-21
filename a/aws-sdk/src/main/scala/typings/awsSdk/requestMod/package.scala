package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type PromiseResult[D, E] = D with (typings.awsSdk.AnonResponse[D, E])
}
