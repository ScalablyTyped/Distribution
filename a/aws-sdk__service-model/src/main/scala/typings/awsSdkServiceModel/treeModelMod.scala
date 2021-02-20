package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import typings.awsSdkBuildTypes.treeModelMod.TreeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel", "fromApiModel")
  @js.native
  def fromApiModel(model: ApiModel): TreeModel = js.native
  
  @JSImport("@aws-sdk/service-model/build/TreeModel", "fromModelJson")
  @js.native
  def fromModelJson(modelJson: String): TreeModel = js.native
}
