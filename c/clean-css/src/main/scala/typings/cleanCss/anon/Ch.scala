package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ch extends js.Object {
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

object Ch {
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
  ): Ch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ch)) __obj.updateDynamic("ch")(ch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pc)) __obj.updateDynamic("pc")(pc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pt)) __obj.updateDynamic("pt")(pt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rem)) __obj.updateDynamic("rem")(rem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vh)) __obj.updateDynamic("vh")(vh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vm)) __obj.updateDynamic("vm")(vm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vmax)) __obj.updateDynamic("vmax")(vmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vmin)) __obj.updateDynamic("vmin")(vmin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
}

