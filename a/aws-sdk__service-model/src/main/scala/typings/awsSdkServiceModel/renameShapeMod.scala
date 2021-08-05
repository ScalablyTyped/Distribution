package typings.awsSdkServiceModel

import typings.awsSdkBuildTypes.apiModelMod.ApiModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameShapeMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel/renameShape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renameShape(model: ApiModel, currentName: String, newName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameShape")(model.asInstanceOf[js.Any], currentName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
