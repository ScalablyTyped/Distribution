package typings.chrome

import typings.chrome.chrome.contentSettings.ScopeEnum
import typings.chrome.chrome.cookies.SameSiteStatus
import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.input.ime.AssistiveWindowButton
import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.omnibox.OnInputEnteredDisposition
import typings.chrome.chrome.runtime.RequestUpdateCheckStatus
import typings.chrome.chrome.storage.AreaName
import typings.chrome.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait IN_LOCK_SCREEN extends SessionState
  @scala.inline
  def IN_LOCK_SCREEN: IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[IN_LOCK_SCREEN]
  
  @js.native
  sealed trait IN_LOGIN_SCREEN extends SessionState
  @scala.inline
  def IN_LOGIN_SCREEN: IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[IN_LOGIN_SCREEN]
  
  @js.native
  sealed trait IN_OOBE_SCREEN extends SessionState
  @scala.inline
  def IN_OOBE_SCREEN: IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[IN_OOBE_SCREEN]
  
  @js.native
  sealed trait IN_SESSION extends SessionState
  @scala.inline
  def IN_SESSION: IN_SESSION = "IN_SESSION".asInstanceOf[IN_SESSION]
  
  @js.native
  sealed trait SIGNIN_PROFILE extends ProfileType
  @scala.inline
  def SIGNIN_PROFILE: SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[SIGNIN_PROFILE]
  
  @js.native
  sealed trait UNKNOWN extends SessionState
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait USER_PROFILE extends ProfileType
  @scala.inline
  def USER_PROFILE: USER_PROFILE = "USER_PROFILE".asInstanceOf[USER_PROFILE]
  
  @js.native
  sealed trait active extends IdleState
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait addToDictionary extends AssistiveWindowButton
  @scala.inline
  def addToDictionary: addToDictionary = "addToDictionary".asInstanceOf[addToDictionary]
  
  @js.native
  sealed trait allow extends StObject
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait app extends StObject
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait ask extends StObject
  @scala.inline
  def ask: ask = "ask".asInstanceOf[ask]
  
  @js.native
  sealed trait block extends StObject
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait bottom extends StObject
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait break extends StObject
  @scala.inline
  def break: break = "break".asInstanceOf[break]
  
  @js.native
  sealed trait buffer_overflow extends StObject
  @scala.inline
  def buffer_overflow: buffer_overflow = "buffer_overflow".asInstanceOf[buffer_overflow]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait csp_report extends ResourceType
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dark extends StObject
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait detect_important_content extends StObject
  @scala.inline
  def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @js.native
  sealed trait device_lost extends StObject
  @scala.inline
  def device_lost: device_lost = "device_lost".asInstanceOf[device_lost]
  
  @js.native
  sealed trait devtools extends StObject
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait disconnected extends StObject
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait eight extends StObject
  @scala.inline
  def eight: eight = "eight".asInstanceOf[eight]
  
  @js.native
  sealed trait even extends StObject
  @scala.inline
  def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait font extends ResourceType
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait frame_error extends StObject
  @scala.inline
  def frame_error: frame_error = "frame_error".asInstanceOf[frame_error]
  
  @js.native
  sealed trait idle extends IdleState
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image extends ResourceType
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait incognito_session_only extends ScopeEnum
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait lax extends SameSiteStatus
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait loading extends StObject
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local extends AreaName
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked extends IdleState
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait main_frame extends ResourceType
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait managed extends AreaName
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait media extends ResourceType
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait mixed extends StObject
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait no extends StObject
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait normal extends StObject
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `object` extends ResourceType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait odd extends StObject
  @scala.inline
  def odd: odd = "odd".asInstanceOf[odd]
  
  @js.native
  sealed trait off extends StObject
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait one extends StObject
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait other extends ResourceType
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait overrun extends StObject
  @scala.inline
  def overrun: overrun = "overrun".asInstanceOf[overrun]
  
  @js.native
  sealed trait panel extends StObject
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait parity_error extends StObject
  @scala.inline
  def parity_error: parity_error = "parity_error".asInstanceOf[parity_error]
  
  @js.native
  sealed trait ping extends ResourceType
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait popup extends StObject
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait regular extends ScopeEnum
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait script extends ResourceType
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait session_only extends StObject
  @scala.inline
  def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @js.native
  sealed trait seven extends StObject
  @scala.inline
  def seven: seven = "seven".asInstanceOf[seven]
  
  @js.native
  sealed trait strict extends SameSiteStatus
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet extends ResourceType
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame extends ResourceType
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait sync extends AreaName
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait system_error extends StObject
  @scala.inline
  def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait timeout extends StObject
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait top extends StObject
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait two extends StObject
  @scala.inline
  def two: two = "two".asInstanceOf[two]
  
  @js.native
  sealed trait undo extends AssistiveWindowButton
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait unspecified extends SameSiteStatus
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait websocket extends ResourceType
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
}
