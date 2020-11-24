package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.browser_action_
import typings.chromeApps.chromeAppsStrings.editable_
import typings.chromeApps.chromeAppsStrings.frame_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.launcher_
import typings.chromeApps.chromeAppsStrings.link_
import typings.chromeApps.chromeAppsStrings.page_
import typings.chromeApps.chromeAppsStrings.page_action_
import typings.chromeApps.chromeAppsStrings.selection_
import typings.chromeApps.chromeAppsStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALL extends js.Object {
  
  var ALL: all__ = js.native
  
  var AUDIO: audio_ = js.native
  
  var BROWSER_ACTION: browser_action_ = js.native
  
  var EDITABLE: editable_ = js.native
  
  var FRAME: frame_ = js.native
  
  var IMAGE: image_ = js.native
  
  var LAUNCHER: launcher_ = js.native
  
  var LINK: link_ = js.native
  
  var PAGE: page_ = js.native
  
  var PAGE_ACTION: page_action_ = js.native
  
  var SELECTION: selection_ = js.native
  
  var VIDEO: video_ = js.native
}
object ALL {
  
  @scala.inline
  def apply(
    ALL: all__,
    AUDIO: audio_,
    BROWSER_ACTION: browser_action_,
    EDITABLE: editable_,
    FRAME: frame_,
    IMAGE: image_,
    LAUNCHER: launcher_,
    LINK: link_,
    PAGE: page_,
    PAGE_ACTION: page_action_,
    SELECTION: selection_,
    VIDEO: video_
  ): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], AUDIO = AUDIO.asInstanceOf[js.Any], BROWSER_ACTION = BROWSER_ACTION.asInstanceOf[js.Any], EDITABLE = EDITABLE.asInstanceOf[js.Any], FRAME = FRAME.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LAUNCHER = LAUNCHER.asInstanceOf[js.Any], LINK = LINK.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], PAGE_ACTION = PAGE_ACTION.asInstanceOf[js.Any], SELECTION = SELECTION.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
    
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
    def setALL(value: all__): Self = this.set("ALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDIO(value: audio_): Self = this.set("AUDIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBROWSER_ACTION(value: browser_action_): Self = this.set("BROWSER_ACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDITABLE(value: editable_): Self = this.set("EDITABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRAME(value: frame_): Self = this.set("FRAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAGE(value: image_): Self = this.set("IMAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAUNCHER(value: launcher_): Self = this.set("LAUNCHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK(value: link_): Self = this.set("LINK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE(value: page_): Self = this.set("PAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGE_ACTION(value: page_action_): Self = this.set("PAGE_ACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTION(value: selection_): Self = this.set("SELECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIDEO(value: video_): Self = this.set("VIDEO", value.asInstanceOf[js.Any])
  }
}
