package typings.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCh extends js.Object {
  /**
    * Controls treating `ch` as a supported unit; defaults to `true`
    */
  var ch: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `in` as a supported unit; defaults to `true`
    */
  var in: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `pc` as a supported unit; defaults to `true`
    */
  var pc: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `pt` as a supported unit; defaults to `true`
    */
  var pt: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `rem` as a supported unit; defaults to `true`
    */
  var rem: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `vh` as a supported unit; defaults to `true`
    */
  var vh: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `vm` as a supported unit; defaults to `true`
    */
  var vm: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `vmax` as a supported unit; defaults to `true`
    */
  var vmax: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls treating `vmin` as a supported unit; defaults to `true`
    */
  var vmin: js.UndefOr[Boolean] = js.undefined
}

object AnonCh {
  @scala.inline
  def apply(
    ch: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    pc: js.UndefOr[Boolean] = js.undefined,
    pt: js.UndefOr[Boolean] = js.undefined,
    rem: js.UndefOr[Boolean] = js.undefined,
    vh: js.UndefOr[Boolean] = js.undefined,
    vm: js.UndefOr[Boolean] = js.undefined,
    vmax: js.UndefOr[Boolean] = js.undefined,
    vmin: js.UndefOr[Boolean] = js.undefined
  ): AnonCh = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ch)) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(pc)) __obj.updateDynamic("pc")(pc.asInstanceOf[js.Any])
    if (!js.isUndefined(pt)) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (!js.isUndefined(rem)) __obj.updateDynamic("rem")(rem.asInstanceOf[js.Any])
    if (!js.isUndefined(vh)) __obj.updateDynamic("vh")(vh.asInstanceOf[js.Any])
    if (!js.isUndefined(vm)) __obj.updateDynamic("vm")(vm.asInstanceOf[js.Any])
    if (!js.isUndefined(vmax)) __obj.updateDynamic("vmax")(vmax.asInstanceOf[js.Any])
    if (!js.isUndefined(vmin)) __obj.updateDynamic("vmin")(vmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCh]
  }
}

