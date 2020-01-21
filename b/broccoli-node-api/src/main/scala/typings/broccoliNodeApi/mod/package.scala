package typings.broccoliNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InputNode = typings.broccoliNodeApi.mod.Node | java.lang.String
  type Node = typings.broccoliNodeApi.mod.SourceNode | typings.broccoliNodeApi.mod.TransformNode
  type SourceNode = typings.broccoliNodeApi.mod.NodeCommon[typings.broccoliNodeApi.mod.SourceNodeInfo]
  type TransformNode = typings.broccoliNodeApi.mod.NodeCommon[typings.broccoliNodeApi.mod.TransformNodeInfo]
}
