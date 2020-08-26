package typings.bitcoinjsLib.ecpairMod

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPairOptions extends js.Object {
  var compressed: js.UndefOr[Boolean] = js.native
  var network: js.UndefOr[Network] = js.native
  var rng: js.UndefOr[js.Function1[/* arg0 */ Double, Buffer]] = js.native
}

object ECPairOptions {
  @scala.inline
  def apply(): ECPairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECPairOptions]
  }
  @scala.inline
  implicit class ECPairOptionsOps[Self <: ECPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressed: Self = this.set("compressed", js.undefined)
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setRng(value: /* arg0 */ Double => Buffer): Self = this.set("rng", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRng: Self = this.set("rng", js.undefined)
  }
  
}

