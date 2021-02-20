package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.smokeTestModelMod.SmokeTestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smokeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/SmokeModel", "fromSmokeTestModelJson")
  @js.native
  def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = js.native
  
  @JSImport("@aws-sdk/service-model/build/SmokeModel", "isSmokeTestModel")
  @js.native
  def isSmokeTestModel(model: js.Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = js.native
}
