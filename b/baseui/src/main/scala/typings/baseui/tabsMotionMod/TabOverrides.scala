package typings.baseui.tabsMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tab
@js.native
trait TabOverrides extends js.Object {
  
  var ArtworkContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
  ] = js.native
  
  var Tab: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined,   $focusVisible :boolean | undefined}> */ js.Any
  ] = js.native
  
  var TabPanel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $pad :boolean | undefined}> */ js.Any
  ] = js.native
}
object TabOverrides {
  
  @scala.inline
  def apply(): TabOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOverrides]
  }
  
  @scala.inline
  implicit class TabOverridesOps[Self <: TabOverrides] (val x: Self) extends AnyVal {
    
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
    def setArtworkContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $orientation :ORIENTATION | undefined}> */ js.Any
    ): Self = this.set("ArtworkContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtworkContainer: Self = this.set("ArtworkContainer", js.undefined)
    
    @scala.inline
    def setTab(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $fill :FILL | undefined,   $orientation :ORIENTATION | undefined,   $focusVisible :boolean | undefined}> */ js.Any
    ): Self = this.set("Tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTab: Self = this.set("Tab", js.undefined)
    
    @scala.inline
    def setTabPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $pad :boolean | undefined}> */ js.Any
    ): Self = this.set("TabPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabPanel: Self = this.set("TabPanel", js.undefined)
  }
}
