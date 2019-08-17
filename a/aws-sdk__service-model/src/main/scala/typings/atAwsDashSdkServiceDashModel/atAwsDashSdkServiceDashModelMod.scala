package typings.atAwsDashSdkServiceDashModel

import typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.ApiModel
import typings.atAwsDashSdkBuildDashTypes.buildSmokeTestModelMod.SmokeTestModel
import typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod.TreeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/service-model", JSImport.Namespace)
@js.native
object atAwsDashSdkServiceDashModelMod extends js.Object {
  def fromApiModel(model: ApiModel): TreeModel = js.native
  def fromModelJson(modelJson: String): TreeModel = js.native
  def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = js.native
  def isApiModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean = js.native
  def isServiceMetadata(arg: js.Any): /* is @aws-sdk/types.@aws-sdk/types/build/protocol.ServiceMetadata */ Boolean = js.native
  def isSmokeTestModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = js.native
  def isSupportedProtocol(arg: js.Any): /* is @aws-sdk/types.@aws-sdk/types/build/protocol.SupportedProtocol */ Boolean = js.native
  def isSupportedSignatureVersion(arg: js.Any): /* is @aws-sdk/types.@aws-sdk/types/build/protocol.SupportedSignatureVersion */ Boolean = js.native
}

