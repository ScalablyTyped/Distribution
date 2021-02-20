package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.smokeTestModelMod.SmokeTestModel
import typings.awsSdkBuildTypes.treeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/service-model", "fromApiModel")
  @js.native
  def fromApiModel(model: ApiModel): TreeModel = js.native
  
  @JSImport("@aws-sdk/service-model", "fromModelJson")
  @js.native
  def fromModelJson(modelJson: String): TreeModel = js.native
  
  @JSImport("@aws-sdk/service-model", "fromSmokeTestModelJson")
  @js.native
  def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = js.native
  
  @JSImport("@aws-sdk/service-model", "isApiModel")
  @js.native
  def isApiModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean = js.native
  
  @JSImport("@aws-sdk/service-model", "isServiceMetadata")
  @js.native
  def isServiceMetadata(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata * / any */ Boolean = js.native
  
  @JSImport("@aws-sdk/service-model", "isSmokeTestModel")
  @js.native
  def isSmokeTestModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = js.native
  
  @JSImport("@aws-sdk/service-model", "isSupportedProtocol")
  @js.native
  def isSupportedProtocol(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedProtocol * / any */ Boolean = js.native
  
  @JSImport("@aws-sdk/service-model", "isSupportedSignatureVersion")
  @js.native
  def isSupportedSignatureVersion(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion * / any */ Boolean = js.native
}
