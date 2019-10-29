package typings.broccoliDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object broccoliDashNodeDashApiMod {
  type InputNode = Node | String
  type Node = SourceNode | TransformNode
  type SourceNode = NodeCommon[SourceNodeInfo]
  type TransformNode = NodeCommon[TransformNodeInfo]
}
