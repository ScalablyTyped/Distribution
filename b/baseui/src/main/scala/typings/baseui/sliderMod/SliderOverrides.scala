package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOverrides extends js.Object {
  
  var InnerThumb: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var InnerTrack: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var Mark: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var Thumb: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var ThumbValue: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var Tick: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var TickBar: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  
  var Track: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
}
object SliderOverrides {
  
  @scala.inline
  def apply(): SliderOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOverrides]
  }
  
  @scala.inline
  implicit class SliderOverridesOps[Self <: SliderOverrides] (val x: Self) extends AnyVal {
    
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
    def setInnerThumb(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("InnerThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerThumb: Self = this.set("InnerThumb", js.undefined)
    
    @scala.inline
    def setInnerTrack(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("InnerTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerTrack: Self = this.set("InnerTrack", js.undefined)
    
    @scala.inline
    def setMark(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("Mark", js.undefined)
    
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setThumb(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("Thumb", js.undefined)
    
    @scala.inline
    def setThumbValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("ThumbValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbValue: Self = this.set("ThumbValue", js.undefined)
    
    @scala.inline
    def setTick(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("Tick", js.undefined)
    
    @scala.inline
    def setTickBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("TickBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickBar: Self = this.set("TickBar", js.undefined)
    
    @scala.inline
    def setTrack(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("Track", js.undefined)
  }
}
