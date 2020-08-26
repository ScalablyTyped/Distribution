package typings.cleanCss.mod

import typings.cleanCss.anon.AdjacentSpace
import typings.cleanCss.anon.BackgroundClipMerging
import typings.cleanCss.anon.Ch
import typings.cleanCss.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained configuration for compatibility option
  */
@js.native
trait CompatibilityOptions extends js.Object {
  /**
    * A hash of compatibility options related to color
    */
  var colors: js.UndefOr[Opacity] = js.native
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[BackgroundClipMerging] = js.native
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[AdjacentSpace] = js.native
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[Ch] = js.native
}

object CompatibilityOptions {
  @scala.inline
  def apply(): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibilityOptions]
  }
  @scala.inline
  implicit class CompatibilityOptionsOps[Self <: CompatibilityOptions] (val x: Self) extends AnyVal {
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
    def setColors(value: Opacity): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setProperties(value: BackgroundClipMerging): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSelectors(value: AdjacentSpace): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    @scala.inline
    def setUnits(value: Ch): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}

