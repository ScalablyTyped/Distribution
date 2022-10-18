package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.buildApiModelMod.ApiModel
import typings.awsSdkBuildTypes.buildSmokeTestModelMod.SmokeTestModel
import typings.awsSdkBuildTypes.buildTreeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/service-model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromApiModel(model: ApiModel): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromApiModel")(model.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
  
  inline def fromModelJson(modelJson: String): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
  
  inline def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSmokeTestModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[SmokeTestModel]
  
  inline def isApiModel(model: Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApiModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/build-types.@aws-sdk/build-types/build/ApiModel.ApiModel */ Boolean]
  
  inline def isServiceMetadata(arg: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServiceMetadata")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata * / any */ Boolean]
  
  inline def isSmokeTestModel(model: Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmokeTestModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean]
  
  inline def isSupportedProtocol(arg: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedProtocol * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedProtocol")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedProtocol * / any */ Boolean]
  
  inline def isSupportedSignatureVersion(arg: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedSignatureVersion")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedSignatureVersion * / any */ Boolean]
}
