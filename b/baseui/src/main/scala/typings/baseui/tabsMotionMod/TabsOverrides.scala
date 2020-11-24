package typings.baseui.tabsMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tabs
@js.native
trait TabsOverrides extends js.Object {
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
  ] = js.native
  
  var TabBorder: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
  ] = js.native
  
  var TabHighlight: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined,   $length :number | undefined,   $distance :number | undefined,   $animate :boolean | undefined}> */ js.Any
  ] = js.native
  
  var TabList: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined}> */ js.Any
  ] = js.native
}
object TabsOverrides {
  
  @scala.inline
  def apply(): TabsOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsOverrides]
  }
  
  @scala.inline
  implicit class TabsOverridesOps[Self <: TabsOverrides] (val x: Self) extends AnyVal {
    
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
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setTabBorder(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
    ): Self = this.set("TabBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBorder: Self = this.set("TabBorder", js.undefined)
    
    @scala.inline
    def setTabHighlight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined,   $length :number | undefined,   $distance :number | undefined,   $animate :boolean | undefined}> */ js.Any
    ): Self = this.set("TabHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabHighlight: Self = this.set("TabHighlight", js.undefined)
    
    @scala.inline
    def setTabList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined}> */ js.Any
    ): Self = this.set("TabList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabList: Self = this.set("TabList", js.undefined)
  }
}
