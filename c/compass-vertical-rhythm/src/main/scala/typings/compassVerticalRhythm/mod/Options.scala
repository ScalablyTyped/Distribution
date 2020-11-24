package typings.compassVerticalRhythm.mod

import typings.compassVerticalRhythm.compassVerticalRhythmStrings.Percentsign
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ch
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.dashed
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.dotted
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.double
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.em
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ex
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.groove
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.hidden
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.inset
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.none
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.outset
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.px
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.rem
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ridge
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.solid
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vh
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vmin
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var baseFontSize: js.UndefOr[String] = js.native
  
  var baseLineHeight: js.UndefOr[Double | String] = js.native
  
  var defaultRhythmBorderStyle: js.UndefOr[
    solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
  ] = js.native
  
  var defaultRhythmBorderWidth: js.UndefOr[String] = js.native
  
  var minLinePadding: js.UndefOr[String] = js.native
  
  var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.native
  
  var roundToNearestHalfLine: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBaseFontSize(value: String): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
    
    @scala.inline
    def setBaseLineHeight(value: Double | String): Self = this.set("baseLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLineHeight: Self = this.set("baseLineHeight", js.undefined)
    
    @scala.inline
    def setDefaultRhythmBorderStyle(value: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset): Self = this.set("defaultRhythmBorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRhythmBorderStyle: Self = this.set("defaultRhythmBorderStyle", js.undefined)
    
    @scala.inline
    def setDefaultRhythmBorderWidth(value: String): Self = this.set("defaultRhythmBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRhythmBorderWidth: Self = this.set("defaultRhythmBorderWidth", js.undefined)
    
    @scala.inline
    def setMinLinePadding(value: String): Self = this.set("minLinePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLinePadding: Self = this.set("minLinePadding", js.undefined)
    
    @scala.inline
    def setRhythmUnit(value: Percentsign | em | ex | ch | px | rem | vw | vh | vmin): Self = this.set("rhythmUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRhythmUnit: Self = this.set("rhythmUnit", js.undefined)
    
    @scala.inline
    def setRoundToNearestHalfLine(value: Boolean): Self = this.set("roundToNearestHalfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundToNearestHalfLine: Self = this.set("roundToNearestHalfLine", js.undefined)
  }
}
