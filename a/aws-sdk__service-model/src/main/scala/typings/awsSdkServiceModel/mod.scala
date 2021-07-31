package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.smokeTestModelMod.SmokeTestModel
import typings.awsSdkBuildTypes.treeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/service-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromApiModel(model: ApiModel): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromApiModel")(model.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
  
  @scala.inline
  def fromModelJson(modelJson: String): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
  
  @scala.inline
  def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSmokeTestModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[SmokeTestModel]
  
  @scala.inline
  def isApiModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApiModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean]
  
  @scala.inline
  def isServiceMetadata(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServiceMetadata")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata * / any */ Boolean]
  
  @scala.inline
  def isSmokeTestModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmokeTestModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean]
  
  @scala.inline
  def isSupportedProtocol(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedProtocol * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedProtocol")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedProtocol * / any */ Boolean]
  
  @scala.inline
  def isSupportedSignatureVersion(arg: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedSignatureVersion")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion * / any */ Boolean]
}
