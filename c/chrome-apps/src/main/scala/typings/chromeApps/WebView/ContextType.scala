package typings.chromeApps.WebView

import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.editable_
import typings.chromeApps.chromeAppsStrings.frame_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.link_
import typings.chromeApps.chromeAppsStrings.page_
import typings.chromeApps.chromeAppsStrings.selection_
import typings.chromeApps.chromeAppsStrings.video_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.all__
  - typings.chromeApps.chromeAppsStrings.page_
  - typings.chromeApps.chromeAppsStrings.frame_
  - typings.chromeApps.chromeAppsStrings.selection_
  - typings.chromeApps.chromeAppsStrings.link_
  - typings.chromeApps.chromeAppsStrings.editable_
  - typings.chromeApps.chromeAppsStrings.image_
  - typings.chromeApps.chromeAppsStrings.video_
  - typings.chromeApps.chromeAppsStrings.audio_
*/
trait ContextType extends StObject
object ContextType {
  
  @scala.inline
  def all: all__ = "all".asInstanceOf[all__]
  
  @scala.inline
  def audio: audio_ = "audio".asInstanceOf[audio_]
  
  @scala.inline
  def editable: editable_ = "editable".asInstanceOf[editable_]
  
  @scala.inline
  def frame: frame_ = "frame".asInstanceOf[frame_]
  
  @scala.inline
  def image: image_ = "image".asInstanceOf[image_]
  
  @scala.inline
  def link: link_ = "link".asInstanceOf[link_]
  
  @scala.inline
  def page: page_ = "page".asInstanceOf[page_]
  
  @scala.inline
  def selection: selection_ = "selection".asInstanceOf[selection_]
  
  @scala.inline
  def video: video_ = "video".asInstanceOf[video_]
}
