package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined broccoli-node-api.broccoli-node-api.NodeInfoMap[broccoli-node-api.broccoli-node-api.NodeType] */
/* Rewritten from type alias, can be one of: 
  - typings.broccoliNodeApi.broccoliNodeApiStrings.needsCache
  - typings.broccoliNodeApi.broccoliNodeApiStrings.setup
  - typings.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject
  - typings.broccoliNodeApi.broccoliNodeApiStrings.volatile
  - typings.broccoliNodeApi.broccoliNodeApiStrings.watched
  - typings.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput
  - typings.broccoliNodeApi.broccoliNodeApiStrings.inputNodes
  - typings.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges
  - typings.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory
*/
trait NodeInfo extends js.Object

object NodeInfo {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def getCallbackObject: typings.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject = this.cast("getCallbackObject")
  @scala.inline
  def inputNodes: typings.broccoliNodeApi.broccoliNodeApiStrings.inputNodes = this.cast("inputNodes")
  @scala.inline
  def needsCache: typings.broccoliNodeApi.broccoliNodeApiStrings.needsCache = this.cast("needsCache")
  @scala.inline
  def persistentOutput: typings.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput = this.cast("persistentOutput")
  @scala.inline
  def setup: typings.broccoliNodeApi.broccoliNodeApiStrings.setup = this.cast("setup")
  @scala.inline
  def sourceDirectory: typings.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory = this.cast("sourceDirectory")
  @scala.inline
  def trackInputChanges: typings.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges = this.cast("trackInputChanges")
  @scala.inline
  def volatile: typings.broccoliNodeApi.broccoliNodeApiStrings.volatile = this.cast("volatile")
  @scala.inline
  def watched: typings.broccoliNodeApi.broccoliNodeApiStrings.watched = this.cast("watched")
}

