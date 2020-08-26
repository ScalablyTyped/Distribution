package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type callback = js.Function2[
    /* err */ js.UndefOr[typings.braintreeWeb.coreMod.BraintreeError], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
