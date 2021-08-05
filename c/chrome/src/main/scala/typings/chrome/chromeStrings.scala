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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait IN_LOCK_SCREEN
    extends StObject
       with SessionState
  inline def IN_LOCK_SCREEN: IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[IN_LOCK_SCREEN]
  
  @js.native
  sealed trait IN_LOGIN_SCREEN
    extends StObject
       with SessionState
  inline def IN_LOGIN_SCREEN: IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[IN_LOGIN_SCREEN]
  
  @js.native
  sealed trait IN_OOBE_SCREEN
    extends StObject
       with SessionState
  inline def IN_OOBE_SCREEN: IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[IN_OOBE_SCREEN]
  
  @js.native
  sealed trait IN_SESSION
    extends StObject
       with SessionState
  inline def IN_SESSION: IN_SESSION = "IN_SESSION".asInstanceOf[IN_SESSION]
  
  @js.native
  sealed trait SIGNIN_PROFILE
    extends StObject
       with ProfileType
  inline def SIGNIN_PROFILE: SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[SIGNIN_PROFILE]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with SessionState
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait USER_PROFILE
    extends StObject
       with ProfileType
  inline def USER_PROFILE: USER_PROFILE = "USER_PROFILE".asInstanceOf[USER_PROFILE]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait addToDictionary
    extends StObject
       with AssistiveWindowButton
  inline def addToDictionary: addToDictionary = "addToDictionary".asInstanceOf[addToDictionary]
  
  @js.native
  sealed trait allow extends StObject
  inline def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait app extends StObject
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait ask extends StObject
  inline def ask: ask = "ask".asInstanceOf[ask]
  
  @js.native
  sealed trait block extends StObject
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait break extends StObject
  inline def break: break = "break".asInstanceOf[break]
  
  @js.native
  sealed trait buffer_overflow extends StObject
  inline def buffer_overflow: buffer_overflow = "buffer_overflow".asInstanceOf[buffer_overflow]
  
  @js.native
  sealed trait complete extends StObject
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab
    extends StObject
       with OnInputEnteredDisposition
  inline def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait detect_important_content extends StObject
  inline def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @js.native
  sealed trait device_lost extends StObject
  inline def device_lost: device_lost = "device_lost".asInstanceOf[device_lost]
  
  @js.native
  sealed trait devtools extends StObject
  inline def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait disconnected extends StObject
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait eight extends StObject
  inline def eight: eight = "eight".asInstanceOf[eight]
  
  @js.native
  sealed trait even extends StObject
  inline def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait frame_error extends StObject
  inline def frame_error: frame_error = "frame_error".asInstanceOf[frame_error]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image
    extends StObject
       with ResourceType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with ScopeEnum
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait lax
    extends StObject
       with SameSiteStatus
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local
    extends StObject
       with AreaName
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked
    extends StObject
       with IdleState
  inline def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait managed
    extends StObject
       with AreaName
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait mixed extends StObject
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait newBackgroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait no extends StObject
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait no_restriction
    extends StObject
       with SameSiteStatus
  inline def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update
    extends StObject
       with RequestUpdateCheckStatus
  inline def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait odd extends StObject
  inline def odd: odd = "odd".asInstanceOf[odd]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait one extends StObject
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait other
    extends StObject
       with ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait overrun extends StObject
  inline def overrun: overrun = "overrun".asInstanceOf[overrun]
  
  @js.native
  sealed trait panel extends StObject
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait parity_error extends StObject
  inline def parity_error: parity_error = "parity_error".asInstanceOf[parity_error]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait popup extends StObject
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait regular
    extends StObject
       with ScopeEnum
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait session_only extends StObject
  inline def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @js.native
  sealed trait seven extends StObject
  inline def seven: seven = "seven".asInstanceOf[seven]
  
  @js.native
  sealed trait strict
    extends StObject
       with SameSiteStatus
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait sync
    extends StObject
       with AreaName
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait system_error extends StObject
  inline def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @js.native
  sealed trait throttled
    extends StObject
       with RequestUpdateCheckStatus
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait two extends StObject
  inline def two: two = "two".asInstanceOf[two]
  
  @js.native
  sealed trait undo
    extends StObject
       with AssistiveWindowButton
  inline def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait unspecified
    extends StObject
       with SameSiteStatus
  inline def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait update_available
    extends StObject
       with RequestUpdateCheckStatus
  inline def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
}
