package typings.broccoliNodeApi

import typings.broccoliNodeApi.mod.Node
import typings.broccoliNodeApi.mod.NodeInfo
import typings.broccoliNodeApi.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broccoliNodeApiStrings {
  
  @scala.inline
  def __broccoliFeatures__ : __broccoliFeatures__ = "__broccoliFeatures__".asInstanceOf[__broccoliFeatures__]
  
  @scala.inline
  def __broccoliGetInfo__ : __broccoliGetInfo__ = "__broccoliGetInfo__".asInstanceOf[__broccoliGetInfo__]
  
  @scala.inline
  def getCallbackObject: getCallbackObject = "getCallbackObject".asInstanceOf[getCallbackObject]
  
  @scala.inline
  def inputNodes: inputNodes = "inputNodes".asInstanceOf[inputNodes]
  
  @scala.inline
  def needsCache: needsCache = "needsCache".asInstanceOf[needsCache]
  
  @scala.inline
  def persistentOutput: persistentOutput = "persistentOutput".asInstanceOf[persistentOutput]
  
  @scala.inline
  def setup: setup = "setup".asInstanceOf[setup]
  
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  
  @scala.inline
  def sourceDirectory: sourceDirectory = "sourceDirectory".asInstanceOf[sourceDirectory]
  
  @scala.inline
  def trackInputChanges: trackInputChanges = "trackInputChanges".asInstanceOf[trackInputChanges]
  
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
  
  @scala.inline
  def volatile: volatile = "volatile".asInstanceOf[volatile]
  
  @scala.inline
  def watched: watched = "watched".asInstanceOf[watched]
  
  @js.native
  sealed trait __broccoliFeatures__ extends Node
  
  @js.native
  sealed trait __broccoliGetInfo__ extends Node
  
  @js.native
  sealed trait getCallbackObject extends NodeInfo
  
  @js.native
  sealed trait inputNodes extends NodeInfo
  
  @js.native
  sealed trait needsCache extends NodeInfo
  
  @js.native
  sealed trait persistentOutput extends NodeInfo
  
  @js.native
  sealed trait setup extends NodeInfo
  
  @js.native
  sealed trait source extends NodeType
  
  @js.native
  sealed trait sourceDirectory extends NodeInfo
  
  @js.native
  sealed trait trackInputChanges extends NodeInfo
  
  @js.native
  sealed trait transform extends NodeType
  
  @js.native
  sealed trait volatile extends NodeInfo
  
  @js.native
  sealed trait watched extends NodeInfo
}
