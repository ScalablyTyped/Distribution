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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cross-domain-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PROTOCOL {
    
    @JSImport("cross-domain-utils", "PROTOCOL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils", "PROTOCOL.ABOUT")
    @js.native
    def ABOUT: aboutColon = js.native
    inline def ABOUT_=(x: aboutColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "PROTOCOL.FILE")
    @js.native
    def FILE: fileColon = js.native
    inline def FILE_=(x: fileColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "PROTOCOL.MOCK")
    @js.native
    def MOCK: mockColon = js.native
    inline def MOCK_=(x: mockColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOCK")(x.asInstanceOf[js.Any])
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
    inline def IFRAME_=(x: iframe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils", "WINDOW_TYPE.POPUP")
    @js.native
    def POPUP: popup = js.native
    inline def POPUP_=(x: popup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP")(x.asInstanceOf[js.Any])
  }
  
  inline def assertSameDomain(win: CrossDomainWindowType): SameDomainWindowType = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSameDomain")(win.asInstanceOf[js.Any]).asInstanceOf[SameDomainWindowType]
  inline def assertSameDomain(win: SameDomainWindowType): SameDomainWindowType = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSameDomain")(win.asInstanceOf[js.Any]).asInstanceOf[SameDomainWindowType]
  
  inline def canReadFromWindow(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFromWindow")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def canReadFromWindow(win: SameDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFromWindow")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def closeWindow(win: CrossDomainWindowType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")(win.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def findChildFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = (^.asInstanceOf[js.Dynamic].applyDynamic("findChildFrameByName")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def findFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFrameByName")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getActualDomain(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualDomain")().asInstanceOf[String]
  inline def getActualDomain(win: SameDomainWindowType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualDomain")(win.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAllChildFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllChildFrames")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getAllFramesInWindow(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllFramesInWindow")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getAllWindows(): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWindows")().asInstanceOf[js.Array[CrossDomainWindowType]]
  inline def getAllWindows(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWindows")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getAncestor(): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestor")().asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getAncestor(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestor")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getAncestors(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getDistanceFromTop(win: CrossDomainWindowType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceFromTop")(win.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDomain(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")().asInstanceOf[String]
  inline def getDomain(win: SameDomainWindowType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(win.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDomainFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFrameByName(win: CrossDomainWindowType, name: String): js.UndefOr[CrossDomainWindowType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFrameByName")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getFrameForWindow(win: CrossDomainWindowType): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameForWindow")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def getFrames(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrames")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getNextOpener(): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextOpener")().asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getNextOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextOpener")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getNthParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNthParent")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getNthParent(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNthParent")(win.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getNthParentFromTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNthParentFromTop")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getNthParentFromTop(win: CrossDomainWindowType, n: Double): js.UndefOr[CrossDomainWindowType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNthParentFromTop")(win.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getOpener(): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpener")().asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getOpener(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpener")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getParent(): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")().asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getParent(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getParents(win: CrossDomainWindowType): js.Array[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[CrossDomainWindowType]]
  
  inline def getTop(): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  inline def getTop(win: CrossDomainWindowType): js.UndefOr[CrossDomainWindowType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")(win.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CrossDomainWindowType]]
  
  inline def getUltimateTop(): CrossDomainWindowType = ^.asInstanceOf[js.Dynamic].applyDynamic("getUltimateTop")().asInstanceOf[CrossDomainWindowType]
  inline def getUltimateTop(win: CrossDomainWindowType): CrossDomainWindowType = ^.asInstanceOf[js.Dynamic].applyDynamic("getUltimateTop")(win.asInstanceOf[js.Any]).asInstanceOf[CrossDomainWindowType]
  
  inline def getUserAgent(win: SameDomainWindowType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")(win.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAboutProtocol(win: SameDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAboutProtocol")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isActuallySameDomain(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActuallySameDomain")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAncestor(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAncestorParent(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAncestorParent")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBlankDomain(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlankDomain")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isCurrentDomain(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileProtocol(win: SameDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileProtocol")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFrameWindowClosed(frame: HTMLIFrameElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrameWindowClosed")(frame.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFullpage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullpage")().asInstanceOf[Boolean]
  inline def isFullpage(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullpage")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIframe(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIframe")().asInstanceOf[Boolean]
  inline def isIframe(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIframe")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMockDomain(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMockDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOpener(parent: CrossDomainWindowType, child: CrossDomainWindowType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOpener")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isParent(win: CrossDomainWindowType, frame: CrossDomainWindowType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParent")(win.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPopup(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPopup")().asInstanceOf[Boolean]
  inline def isPopup(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPopup")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameDomain(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameDomain")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSameDomain(win: SameDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameDomain")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSameTopWindow(win1: CrossDomainWindowType, win2: CrossDomainWindowType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameTopWindow")(win1.asInstanceOf[js.Any], win2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTop(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTop")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWindow(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindow")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWindowClosed(win: CrossDomainWindowType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowClosed")(win.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWindowClosed(win: CrossDomainWindowType, allowMock: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWindowClosed")(win.asInstanceOf[js.Any], allowMock.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linkFrameWindow(frame: HTMLIFrameElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("linkFrameWindow")(frame.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def matchDomain(pattern: DomainMatcher, origin: DomainMatcher): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchDomain")(pattern.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeMockUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeMockUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, js.Any]): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("onCloseWindow")(win.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def onCloseWindow(win: CrossDomainWindowType, callback: js.Function1[/* repeated */ js.Any, js.Any], delay: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("onCloseWindow")(win.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    delay: Double,
    maxtime: Double
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("onCloseWindow")(win.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], maxtime.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def onCloseWindow(
    win: CrossDomainWindowType,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    delay: Unit,
    maxtime: Double
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("onCloseWindow")(win.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], maxtime.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  
  inline def stringifyDomainPattern(pattern: DomainMatcher): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyDomainPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
}
