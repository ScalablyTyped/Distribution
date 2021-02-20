package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorBoardAppSettings extends StObject {
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}
object TensorBoardAppSettings {
  
  @scala.inline
  def apply(): TensorBoardAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorBoardAppSettings]
  }
  
  @scala.inline
  implicit class TensorBoardAppSettingsMutableBuilder[Self <: TensorBoardAppSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
  }
}
