package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerMetadataOptions extends GetContainerPropertiesOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.native
}
object GetContainerMetadataOptions {
  
  @scala.inline
  def apply(): GetContainerMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerMetadataOptions]
  }
  
  @scala.inline
  implicit class GetContainerMetadataOptionsMutableBuilder[Self <: GetContainerMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
