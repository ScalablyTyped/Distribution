package typings.broccoliDashPlugin.broccoliDashPluginMod

import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.FeatureSet
import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.InputNode
import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.TransformNodeInfo
import typings.broccoliDashPlugin.distInterfacesMod.PluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends Plugin {
  def this(inputNodes: js.Array[InputNode]) = this()
  def this(inputNodes: js.Array[InputNode], options: PluginOptions) = this()
  /**
    The node's feature set, indicating the API version
    */
  /* CompleteClass */
  override var __broccoliFeatures__ : FeatureSet = js.native
  /**
    A function to be called by the Builder, taking the Builder's feature set as
    an argument and returning a `NodeInfo` object
    */
  /* CompleteClass */
  override def __broccoliGetInfo__(builderFeatures: FeatureSet): TransformNodeInfo = js.native
}

