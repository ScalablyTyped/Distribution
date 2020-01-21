package typings.broccoliNodeApi

import typings.broccoliNodeApi.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object broccoliNodeApiStrings {
  @js.native
  sealed trait source extends NodeType
  
  @js.native
  sealed trait transform extends NodeType
  
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
}

