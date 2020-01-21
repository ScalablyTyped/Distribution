package typings.cordovaPluginNetworkInformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cordovaPluginNetworkInformationStrings {
  @js.native
  sealed trait offline extends js.Object
  
  @js.native
  sealed trait online extends js.Object
  
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
}

