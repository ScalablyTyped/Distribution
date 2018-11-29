package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Nonce extends js.Object {
  var addFrame: js.Function2[
    /* err */ js.UndefOr[braintreeDashWebLib.braintreeDashWebMod.braintreeNs.BraintreeError], 
    /* iframe */ js.UndefOr[stdLib.HTMLIFrameElement], 
    scala.Unit
  ]
  var amount: scala.Double
  var nonce: java.lang.String
  var removeFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

