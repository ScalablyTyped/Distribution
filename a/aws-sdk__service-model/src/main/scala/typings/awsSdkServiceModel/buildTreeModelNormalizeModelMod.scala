package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.buildApiModelMod.ApiModel
import typings.awsSdkBuildTypes.buildTreeModelMod.NormalizedModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTreeModelNormalizeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel/normalizeModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeModel(model: ApiModel): NormalizedModel = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModel")(model.asInstanceOf[js.Any]).asInstanceOf[NormalizedModel]
}
