package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.treeModelMod.NormalizedModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel/normalizeModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def normalizeModel(model: ApiModel): NormalizedModel = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModel")(model.asInstanceOf[js.Any]).asInstanceOf[NormalizedModel]
}
