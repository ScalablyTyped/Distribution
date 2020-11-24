package typings.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaPluginInappbrowserStrings {
  
  @scala.inline
  def customscheme: customscheme = "customscheme".asInstanceOf[customscheme]
  
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  
  @scala.inline
  def loaderror: loaderror = "loaderror".asInstanceOf[loaderror]
  
  @scala.inline
  def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @scala.inline
  def loadstop: loadstop = "loadstop".asInstanceOf[loadstop]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait customscheme extends channel
  
  @js.native
  sealed trait exit extends channel
  
  @js.native
  sealed trait loaderror extends channel
  
  @js.native
  sealed trait loadstart extends channel
  
  @js.native
  sealed trait loadstop extends channel
  
  @js.native
  sealed trait message extends channel
}
