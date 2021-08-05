package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.treeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromApiModel(model: ApiModel): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromApiModel")(model.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
  
  inline def fromModelJson(modelJson: String): TreeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[TreeModel]
}
