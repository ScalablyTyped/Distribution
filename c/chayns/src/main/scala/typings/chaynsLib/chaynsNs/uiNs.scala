package typings
package chaynsLib.chaynsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * chayns.ui
     */
@JSGlobal("chayns.ui")
@js.native
object uiNs extends js.Object {
  /**
           * Media Functions
           * chayns.ui.gallery
           */
  @JSName("gallery")
  @js.native
  object galleryNs extends js.Object {
    def addUrl(id: java.lang.String, url: java.lang.String): scala.Unit = js.native
    def create(id: java.lang.String, urls: js.Array[java.lang.String]): scala.Unit = js.native
    def getUrls(id: java.lang.String): js.Array[java.lang.String] = js.native
    def removeUrl(id: java.lang.String, url: java.lang.String): scala.Unit = js.native
    def setUrls(id: java.lang.String, urls: js.Array[java.lang.String]): scala.Unit = js.native
  }
  
  /**
           * UI Functions
           * chayns.ui.modeSwitch
           */
  @JSName("modeSwitch")
  @js.native
  object modeSwitchNs extends js.Object {
    def add(): scala.Unit = js.native
    def addItem(item: chaynsLib.ModeSwitchItem): scala.Unit = js.native
    def addItem(item: chaynsLib.ModeSwitchItem, index: scala.Double): scala.Unit = js.native
    def changeMode(item: chaynsLib.ModeSwitchItem): scala.Unit = js.native
    def changeMode(item: scala.Double): scala.Unit = js.native
    def init(config: chaynsLib.ModeSwitchConfig): scala.Unit = js.native
    def remove(): scala.Unit = js.native
  }
  
  /**
           * chayns.ui.slider
           */
  @JSName("slider")
  @js.native
  object sliderNs extends js.Object {
    def refreshTrack(): scala.Unit = js.native
  }
  
  /**
           * chayns.ui.tooltip
           */
  @JSName("tooltip")
  @js.native
  object tooltipNs extends js.Object {
    def init(config: chaynsLib.UiTooltipInitConfig, rootElement: js.Any): stdLib.Promise[scala.Boolean] = js.native
  }
  
}

