package typings.broccoliDashNodeDashApi

import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object broccoliDashNodeDashApiStrings {
  @js.native
  sealed trait source extends NodeType
  
  @js.native
  sealed trait transform extends NodeType
  
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
}

