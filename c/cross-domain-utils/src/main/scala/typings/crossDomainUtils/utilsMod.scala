package typings.crossDomainUtils

import typings.crossDomainUtils.anon.Cancel
import typings.crossDomainUtils.typesMod.CrossDomainWindowType
import typings.crossDomainUtils.typesMod.DomainMatcher
import typings.crossDomainUtils.typesMod.SameDomainWindowType
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-domain-utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def assertSameDomain(win: CrossDomainWindowType): SameDomainWindowType = js.native
  def assertSameDomain(win: SameDomainWindowType): SameDomainWindowType = js.native
  
  def canReadFromWindow(win: CrossDomainWindowType): Boolean = js.native
  def canReadFromWindow(win: SameDomainWindowType): Boolean = js.native
  
  def closeWindow(win: CrossDomainWindowType): Unit = js.native
  
  def findChildFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  def findFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getActualDomain(): String = js.native
  def getActualDomain(win: SameDomainWindowType): String = js.native
  
  def getAllChildFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getAllFramesInWindow(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getAllWindows(): js.Array[CrossDomainWindowType] = js.native
  def getAllWindows(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getAncestor(): js.UndefOr[CrossDomainWindowType] = js.native
  def getAncestor(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getAncestors(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getDistanceFromTop(win: CrossDomainWindowType): Double = js.native
  
  def getDomain(): String = js.native
  def getDomain(win: SameDomainWindowType): String = js.native
  
  def getDomainFromUrl(url: String): String = js.native
  
  def getFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getFrameForWindow(win: CrossDomainWindowType): js.UndefOr[HTMLElement] = js.native
  
  def getFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getNextOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  def getNextOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getNthParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  def getNthParent(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getNthParentFromTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  def getNthParentFromTop(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getOpener(): js.UndefOr[CrossDomainWindowType] = js.native
  def getOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getParent(): js.UndefOr[CrossDomainWindowType] = js.native
  def getParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getParents(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = js.native
  
  def getTop(): js.UndefOr[CrossDomainWindowType] = js.native
  def getTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = js.native
  
  def getUltimateTop(): CrossDomainWindowType = js.native
  def getUltimateTop(win: CrossDomainWindowType): CrossDomainWindowType = js.native
  
  def getUserAgent(win: SameDomainWindowType): String = js.native
  
  def isAboutProtocol(win: SameDomainWindowType): Boolean = js.native
  
  def isActuallySameDomain(win: CrossDomainWindowType): Boolean = js.native
  
  def isAncestor(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  def isAncestorParent(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  def isBlankDomain(win: CrossDomainWindowType): Boolean = js.native
  
  def isBrowser(): Boolean = js.native
  
  def isCurrentDomain(domain: String): Boolean = js.native
  
  def isFileProtocol(win: SameDomainWindowType): Boolean = js.native
  
  def isFrameWindowClosed(frame: HTMLIFrameElement): Boolean = js.native
  
  def isFullpage(): Boolean = js.native
  def isFullpage(win: CrossDomainWindowType): Boolean = js.native
  
  def isIframe(): Boolean = js.native
  def isIframe(win: CrossDomainWindowType): Boolean = js.native
  
  def isMockDomain(domain: String): Boolean = js.native
  
  def isOpener(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = js.native
  
  def isParent(win: CrossDomainWindowType, frame: CrossDomainWindowType): Boolean = js.native
  
  def isPopup(): Boolean = js.native
  def isPopup(win: CrossDomainWindowType): Boolean = js.native
  
  def isSameDomain(win: CrossDomainWindowType): Boolean = js.native
  def isSameDomain(win: SameDomainWindowType): Boolean = js.native
  
  def isSameTopWindow(win1: CrossDomainWindowType, win2: CrossDomainWindowType): Boolean = js.native
  
  def isTop(win: CrossDomainWindowType): Boolean = js.native
  
  def isWindow(obj: js.Any): Boolean = js.native
  
  def isWindowClosed(win: CrossDomainWindowType): Boolean = js.native
  def isWindowClosed(win: CrossDomainWindowType, allowMock: Boolean): Boolean = js.native
  
  def linkFrameWindow(frame: HTMLIFrameElement): Unit = js.native
  
  def matchDomain(pattern: DomainMatcher, origin: DomainMatcher): Boolean = js.native
  
  def normalizeMockUrl(url: String): String = js.native
  
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _]): Cancel = js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: js.UndefOr[scala.Nothing],
    maxtime: Double
  ): Cancel = js.native
  def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, _], delay: Double): Cancel = js.native
  def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, _],
    delay: Double,
    maxtime: Double
  ): Cancel = js.native
  
  def stringifyDomainPattern(pattern: DomainMatcher): String = js.native
}
