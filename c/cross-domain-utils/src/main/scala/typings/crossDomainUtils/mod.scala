package typings.crossDomainUtils

import typings.crossDomainUtils.anon.Cancel
import typings.crossDomainUtils.crossDomainUtilsStrings.Asterisk
import typings.crossDomainUtils.crossDomainUtilsStrings.aboutColon
import typings.crossDomainUtils.crossDomainUtilsStrings.fileColon
import typings.crossDomainUtils.crossDomainUtilsStrings.iframe
import typings.crossDomainUtils.crossDomainUtilsStrings.mockColon
import typings.crossDomainUtils.crossDomainUtilsStrings.popup
import typings.crossDomainUtils.typesMod.CrossDomainWindowType
import typings.crossDomainUtils.typesMod.DomainMatcher
import typings.crossDomainUtils.typesMod.SameDomainWindowType
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object PROTOCOL {
    
    @JSImport("cross-domain-utils", "PROTOCOL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils", "PROTOCOL.ABOUT")
    @js.native
    def ABOUT: aboutColon = js.native
    @scala.inline
    def ABOUT_=(x: aboutColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "PROTOCOL.FILE")
    @js.native
    def FILE: fileColon = js.native
    @scala.inline
    def FILE_=(x: fileColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "PROTOCOL.MOCK")
    @js.native
    def MOCK: mockColon = js.native
    @scala.inline
    def MOCK_=(x: mockColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOCK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cross-domain-utils", "TYPES")
  @js.native
  val TYPES: /* true */ Boolean = js.native
  
  @JSImport("cross-domain-utils", "WILDCARD")
  @js.native
  val WILDCARD: Asterisk = js.native
  
  object WINDOW_TYPE {
    
    @JSImport("cross-domain-utils", "WINDOW_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils", "WINDOW_TYPE.IFRAME")
    @js.native
    def IFRAME: iframe = js.native
    @scala.inline
    def IFRAME_=(x: iframe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "WINDOW_TYPE.POPUP")
    @js.native
    def POPUP: popup = js.native
    @scala.inline
    def POPUP_=(x: popup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cross-domain-utils", "assertSameDomain")
  @js.native
  def assertSameDomain(win: CrossDomainWindowType): SameDomainWindowType = js.native
  @JSImport("cross-domain-utils", "assertSameDomain")
  @js.native
  def assertSameDomain(win: SameDomainWindowType): SameDomainWindowType = js.native
  
  @JSImport("cross-domain-utils", "canReadFromWindow")
  @js.native
  def canReadFromWindow(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils", "canReadFromWindow")
  @js.native
  def canReadFromWindow(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "closeWindow")
  @js.native
  def closeWindow(win: CrossDomainWindowType): Unit = js.native
  
  @JSImport("cross-domain-utils", "findChildFrameByName")
  @js.native
  def findChildFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "findFrameByName")
  @js.native
  def findFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getActualDomain")
  @js.native
  def getActualDomain(): String = js.native
  @JSImport("cross-domain-utils", "getActualDomain")
  @js.native
  def getActualDomain(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils", "getAllChildFrames")
  @js.native
  def getAllChildFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getAllFramesInWindow")
  @js.native
  def getAllFramesInWindow(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getAllWindows")
  @js.native
  def getAllWindows(): js.Array[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getAllWindows")
  @js.native
  def getAllWindows(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getAncestor")
  @js.native
  def getAncestor(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getAncestor")
  @js.native
  def getAncestor(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getAncestors")
  @js.native
  def getAncestors(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getDistanceFromTop")
  @js.native
  def getDistanceFromTop(win: CrossDomainWindowType): Double = js.native
  
  @JSImport("cross-domain-utils", "getDomain")
  @js.native
  def getDomain(): String = js.native
  @JSImport("cross-domain-utils", "getDomain")
  @js.native
  def getDomain(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils", "getDomainFromUrl")
  @js.native
  def getDomainFromUrl(url: String): String = js.native
  
  @JSImport("cross-domain-utils", "getFrameByName")
  @js.native
  def getFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getFrameForWindow")
  @js.native
  def getFrameForWindow(win: CrossDomainWindowType): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("cross-domain-utils", "getFrames")
  @js.native
  def getFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getNextOpener")
  @js.native
  def getNextOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getNextOpener")
  @js.native
  def getNextOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getNthParent")
  @js.native
  def getNthParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getNthParent")
  @js.native
  def getNthParent(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getNthParentFromTop")
  @js.native
  def getNthParentFromTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getNthParentFromTop")
  @js.native
  def getNthParentFromTop(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getOpener")
  @js.native
  def getOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getOpener")
  @js.native
  def getOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getParent")
  @js.native
  def getParent(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getParent")
  @js.native
  def getParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getParents")
  @js.native
  def getParents(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getTop")
  @js.native
  def getTop(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils", "getTop")
  @js.native
  def getTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils", "getUltimateTop")
  @js.native
  def getUltimateTop(): CrossDomainWindowType = js.native
  @JSImport("cross-domain-utils", "getUltimateTop")
  @js.native
  def getUltimateTop(win: CrossDomainWindowType): CrossDomainWindowType = js.native
  
  @JSImport("cross-domain-utils", "getUserAgent")
  @js.native
  def getUserAgent(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils", "isAboutProtocol")
  @js.native
  def isAboutProtocol(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isActuallySameDomain")
  @js.native
  def isActuallySameDomain(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isAncestor")
  @js.native
  def isAncestor(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isAncestorParent")
  @js.native
  def isAncestorParent(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isBlankDomain")
  @js.native
  def isBlankDomain(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isCurrentDomain")
  @js.native
  def isCurrentDomain(domain: String): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isFileProtocol")
  @js.native
  def isFileProtocol(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isFrameWindowClosed")
  @js.native
  def isFrameWindowClosed(frame: HTMLIFrameElement): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isFullpage")
  @js.native
  def isFullpage(): Boolean = js.native
  @JSImport("cross-domain-utils", "isFullpage")
  @js.native
  def isFullpage(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isIframe")
  @js.native
  def isIframe(): Boolean = js.native
  @JSImport("cross-domain-utils", "isIframe")
  @js.native
  def isIframe(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isMockDomain")
  @js.native
  def isMockDomain(domain: String): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isOpener")
  @js.native
  def isOpener(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isParent")
  @js.native
  def isParent(win: CrossDomainWindowType, frame: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isPopup")
  @js.native
  def isPopup(): Boolean = js.native
  @JSImport("cross-domain-utils", "isPopup")
  @js.native
  def isPopup(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isSameDomain")
  @js.native
  def isSameDomain(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils", "isSameDomain")
  @js.native
  def isSameDomain(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isSameTopWindow")
  @js.native
  def isSameTopWindow(win1: CrossDomainWindowType, win2: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isTop")
  @js.native
  def isTop(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isWindow")
  @js.native
  def isWindow(obj: js.Any): Boolean = js.native
  
  @JSImport("cross-domain-utils", "isWindowClosed")
  @js.native
  def isWindowClosed(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils", "isWindowClosed")
  @js.native
  def isWindowClosed(win: CrossDomainWindowType, allowMock: Boolean): Boolean = js.native
  
  @JSImport("cross-domain-utils", "linkFrameWindow")
  @js.native
  def linkFrameWindow(frame: HTMLIFrameElement): Unit = js.native
  
  @JSImport("cross-domain-utils", "matchDomain")
  @js.native
  def matchDomain(pattern: DomainMatcher, origin: DomainMatcher): Boolean = js.native
  
  @JSImport("cross-domain-utils", "normalizeMockUrl")
  @js.native
  def normalizeMockUrl(url: String): String = js.native
  
  @JSImport("cross-domain-utils", "onCloseWindow")
  @js.native
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _]): Cancel = js.native
  @JSImport("cross-domain-utils", "onCloseWindow")
  @js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: js.UndefOr[scala.Nothing],
    maxtime: Double
  ): Cancel = js.native
  @JSImport("cross-domain-utils", "onCloseWindow")
  @js.native
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _], delay: Double): Cancel = js.native
  @JSImport("cross-domain-utils", "onCloseWindow")
  @js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: Double,
    maxtime: Double
  ): Cancel = js.native
  
  @JSImport("cross-domain-utils", "stringifyDomainPattern")
  @js.native
  def stringifyDomainPattern(pattern: DomainMatcher): String = js.native
}
