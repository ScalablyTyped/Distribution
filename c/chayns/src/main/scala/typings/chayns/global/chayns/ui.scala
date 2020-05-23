package typings.chayns.global.chayns

import typings.chayns.ModeSwitchConfig
import typings.chayns.ModeSwitchItem
import typings.chayns.UiTooltipInitConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * chayns.ui
  */
@JSGlobal("chayns.ui")
@js.native
object ui extends js.Object {
  /**
    * Media Functions
    * chayns.ui.gallery
    */
  @js.native
  object gallery extends js.Object {
    def addUrl(id: String, url: String): Unit = js.native
    def create(id: String, urls: js.Array[String]): Unit = js.native
    def getUrls(id: String): js.Array[String] = js.native
    def removeUrl(id: String, url: String): Unit = js.native
    def setUrls(id: String, urls: js.Array[String]): Unit = js.native
  }
  
  /**
    * UI Functions
    * chayns.ui.modeSwitch
    */
  @js.native
  object modeSwitch extends js.Object {
    def add(): Unit = js.native
    def addItem(item: ModeSwitchItem): Unit = js.native
    def addItem(item: ModeSwitchItem, index: Double): Unit = js.native
    def changeMode(item: Double): Unit = js.native
    def changeMode(item: ModeSwitchItem): Unit = js.native
    def init(config: ModeSwitchConfig): Unit = js.native
    def remove(): Unit = js.native
  }
  
  /**
    * chayns.ui.slider
    */
  @js.native
  object slider extends js.Object {
    def refreshTrack(): Unit = js.native
  }
  
  /**
    * chayns.ui.tooltip
    */
  @js.native
  object tooltip extends js.Object {
    def init(config: UiTooltipInitConfig, rootElement: js.Any): js.Promise[Boolean] = js.native
  }
  
}

