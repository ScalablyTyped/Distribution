package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCommon[T /* <: NodeInfo */] extends js.Object {
  /**
    The node's feature set, indicating the API version
    */
  var __broccoliFeatures__ : FeatureSet = js.native
  /**
    A function to be called by the Builder, taking the Builder's feature set as
    an argument and returning a `NodeInfo` object
    */
  def __broccoliGetInfo__(builderFeatures: FeatureSet): T = js.native
}

object NodeCommon {
  @scala.inline
  def apply[/* <: typings.broccoliNodeApi.mod.NodeInfo */ T](__broccoliFeatures__ : FeatureSet, __broccoliGetInfo__ : FeatureSet => T): NodeCommon[T] = {
    val __obj = js.Dynamic.literal(__broccoliFeatures__ = __broccoliFeatures__.asInstanceOf[js.Any], __broccoliGetInfo__ = js.Any.fromFunction1(__broccoliGetInfo__))
    __obj.asInstanceOf[NodeCommon[T]]
  }
  @scala.inline
  implicit class NodeCommonOps[Self <: NodeCommon[_], /* <: typings.broccoliNodeApi.mod.NodeInfo */ T] (val x: Self with NodeCommon[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__broccoliFeatures__(value: FeatureSet): Self = this.set("__broccoliFeatures__", value.asInstanceOf[js.Any])
    @scala.inline
    def set__broccoliGetInfo__(value: FeatureSet => T): Self = this.set("__broccoliGetInfo__", js.Any.fromFunction1(value))
  }
  
}

