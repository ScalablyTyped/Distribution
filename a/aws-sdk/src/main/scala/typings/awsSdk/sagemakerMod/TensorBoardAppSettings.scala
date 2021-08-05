package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorBoardAppSettings extends StObject {
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
}
object TensorBoardAppSettings {
  
  inline def apply(): TensorBoardAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorBoardAppSettings]
  }
  
  extension [Self <: TensorBoardAppSettings](x: Self) {
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
  }
}
