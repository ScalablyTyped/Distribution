package typings.crossDomainUtils

import typings.crossDomainUtils.anon.Cancel
import typings.crossDomainUtils.typesMod.CrossDomainWindowType
import typings.crossDomainUtils.typesMod.DomainMatcher
import typings.crossDomainUtils.typesMod.SameDomainWindowType
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("cross-domain-utils/utils", "assertSameDomain")
  @js.native
  def assertSameDomain(win: CrossDomainWindowType): SameDomainWindowType = js.native
  @JSImport("cross-domain-utils/utils", "assertSameDomain")
  @js.native
  def assertSameDomain(win: SameDomainWindowType): SameDomainWindowType = js.native
  
  @JSImport("cross-domain-utils/utils", "canReadFromWindow")
  @js.native
  def canReadFromWindow(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "canReadFromWindow")
  @js.native
  def canReadFromWindow(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "closeWindow")
  @js.native
  def closeWindow(win: CrossDomainWindowType): Unit = js.native
  
  @JSImport("cross-domain-utils/utils", "findChildFrameByName")
  @js.native
  def findChildFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "findFrameByName")
  @js.native
  def findFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getActualDomain")
  @js.native
  def getActualDomain(): String = js.native
  @JSImport("cross-domain-utils/utils", "getActualDomain")
  @js.native
  def getActualDomain(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils/utils", "getAllChildFrames")
  @js.native
  def getAllChildFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getAllFramesInWindow")
  @js.native
  def getAllFramesInWindow(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getAllWindows")
  @js.native
  def getAllWindows(): js.Array[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getAllWindows")
  @js.native
  def getAllWindows(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getAncestor")
  @js.native
  def getAncestor(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getAncestor")
  @js.native
  def getAncestor(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getAncestors")
  @js.native
  def getAncestors(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getDistanceFromTop")
  @js.native
  def getDistanceFromTop(win: CrossDomainWindowType): Double = js.native
  
  @JSImport("cross-domain-utils/utils", "getDomain")
  @js.native
  def getDomain(): String = js.native
  @JSImport("cross-domain-utils/utils", "getDomain")
  @js.native
  def getDomain(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils/utils", "getDomainFromUrl")
  @js.native
  def getDomainFromUrl(url: String): String = js.native
  
  @JSImport("cross-domain-utils/utils", "getFrameByName")
  @js.native
  def getFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getFrameForWindow")
  @js.native
  def getFrameForWindow(win: CrossDomainWindowType): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("cross-domain-utils/utils", "getFrames")
  @js.native
  def getFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getNextOpener")
  @js.native
  def getNextOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getNextOpener")
  @js.native
  def getNextOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getNthParent")
  @js.native
  def getNthParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getNthParent")
  @js.native
  def getNthParent(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getNthParentFromTop")
  @js.native
  def getNthParentFromTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getNthParentFromTop")
  @js.native
  def getNthParentFromTop(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getOpener")
  @js.native
  def getOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getOpener")
  @js.native
  def getOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getParent")
  @js.native
  def getParent(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getParent")
  @js.native
  def getParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getParents")
  @js.native
  def getParents(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getTop")
  @js.native
  def getTop(): js.UndefOr[CrossDomainWindowType] = js.native
  @JSImport("cross-domain-utils/utils", "getTop")
  @js.native
  def getTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  @JSImport("cross-domain-utils/utils", "getUltimateTop")
  @js.native
  def getUltimateTop(): CrossDomainWindowType = js.native
  @JSImport("cross-domain-utils/utils", "getUltimateTop")
  @js.native
  def getUltimateTop(win: CrossDomainWindowType): CrossDomainWindowType = js.native
  
  @JSImport("cross-domain-utils/utils", "getUserAgent")
  @js.native
  def getUserAgent(win: SameDomainWindowType): String = js.native
  
  @JSImport("cross-domain-utils/utils", "isAboutProtocol")
  @js.native
  def isAboutProtocol(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isActuallySameDomain")
  @js.native
  def isActuallySameDomain(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isAncestor")
  @js.native
  def isAncestor(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isAncestorParent")
  @js.native
  def isAncestorParent(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isBlankDomain")
  @js.native
  def isBlankDomain(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isCurrentDomain")
  @js.native
  def isCurrentDomain(domain: String): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isFileProtocol")
  @js.native
  def isFileProtocol(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isFrameWindowClosed")
  @js.native
  def isFrameWindowClosed(frame: HTMLIFrameElement): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isFullpage")
  @js.native
  def isFullpage(): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "isFullpage")
  @js.native
  def isFullpage(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isIframe")
  @js.native
  def isIframe(): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "isIframe")
  @js.native
  def isIframe(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isMockDomain")
  @js.native
  def isMockDomain(domain: String): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isOpener")
  @js.native
  def isOpener(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isParent")
  @js.native
  def isParent(win: CrossDomainWindowType, frame: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isPopup")
  @js.native
  def isPopup(): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "isPopup")
  @js.native
  def isPopup(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isSameDomain")
  @js.native
  def isSameDomain(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "isSameDomain")
  @js.native
  def isSameDomain(win: SameDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isSameTopWindow")
  @js.native
  def isSameTopWindow(win1: CrossDomainWindowType, win2: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isTop")
  @js.native
  def isTop(win: CrossDomainWindowType): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isWindow")
  @js.native
  def isWindow(obj: js.Any): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "isWindowClosed")
  @js.native
  def isWindowClosed(win: CrossDomainWindowType): Boolean = js.native
  @JSImport("cross-domain-utils/utils", "isWindowClosed")
  @js.native
  def isWindowClosed(win: CrossDomainWindowType, allowMock: Boolean): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "linkFrameWindow")
  @js.native
  def linkFrameWindow(frame: HTMLIFrameElement): Unit = js.native
  
  @JSImport("cross-domain-utils/utils", "matchDomain")
  @js.native
  def matchDomain(pattern: DomainMatcher, origin: DomainMatcher): Boolean = js.native
  
  @JSImport("cross-domain-utils/utils", "normalizeMockUrl")
  @js.native
  def normalizeMockUrl(url: String): String = js.native
  
  @JSImport("cross-domain-utils/utils", "onCloseWindow")
  @js.native
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _]): Cancel = js.native
  @JSImport("cross-domain-utils/utils", "onCloseWindow")
  @js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: js.UndefOr[scala.Nothing],
    maxtime: Double
  ): Cancel = js.native
  @JSImport("cross-domain-utils/utils", "onCloseWindow")
  @js.native
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _], delay: Double): Cancel = js.native
  @JSImport("cross-domain-utils/utils", "onCloseWindow")
  @js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: Double,
    maxtime: Double
  ): Cancel = js.native
  
  @JSImport("cross-domain-utils/utils", "stringifyDomainPattern")
  @js.native
  def stringifyDomainPattern(pattern: DomainMatcher): String = js.native
}
