package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chromeLibStrings {
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait ask extends js.Object
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait csp_report
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait currentTab
    extends chromeLib.chromeNs.omniboxNs.OnInputEnteredDisposition
  
  @js.native
  sealed trait detect_important_content extends js.Object
  
  @js.native
  sealed trait devtools extends js.Object
  
  @js.native
  sealed trait font
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait image
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait incognito_session_only
    extends chromeLib.chromeNs.contentSettingsNs.ScopeEnum
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait loading extends js.Object
  
  @js.native
  sealed trait main_frame
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait media
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait newBackgroundTab
    extends chromeLib.chromeNs.omniboxNs.OnInputEnteredDisposition
  
  @js.native
  sealed trait newForegroundTab
    extends chromeLib.chromeNs.omniboxNs.OnInputEnteredDisposition
  
  @js.native
  sealed trait no_update
    extends chromeLib.chromeNs.runtimeNs.RequestUpdateCheckStatus
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait `object`
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait other
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait panel extends js.Object
  
  @js.native
  sealed trait ping
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait popup extends js.Object
  
  @js.native
  sealed trait regular
    extends chromeLib.chromeNs.contentSettingsNs.ScopeEnum
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait script
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait session_only extends js.Object
  
  @js.native
  sealed trait stylesheet
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait sub_frame
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait throttled
    extends chromeLib.chromeNs.runtimeNs.RequestUpdateCheckStatus
  
  @js.native
  sealed trait top extends js.Object
  
  @js.native
  sealed trait update_available
    extends chromeLib.chromeNs.runtimeNs.RequestUpdateCheckStatus
  
  @js.native
  sealed trait websocket
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @js.native
  sealed trait xmlhttprequest
    extends chromeLib.chromeNs.webRequestNs.ResourceType
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def ask: ask = "ask".asInstanceOf[ask]
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  @scala.inline
  def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def session_only: session_only = "session_only".asInstanceOf[session_only]
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
}

