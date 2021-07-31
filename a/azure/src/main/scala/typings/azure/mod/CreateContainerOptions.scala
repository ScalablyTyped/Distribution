package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerOptions
  extends StObject
     with TimeoutIntervalOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  
  var publicAccessLevel: js.UndefOr[String] = js.undefined
}
object CreateContainerOptions {
  
  @scala.inline
  def apply(): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerOptions]
  }
  
  @scala.inline
  implicit class CreateContainerOptionsMutableBuilder[Self <: CreateContainerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPublicAccessLevel(value: String): Self = StObject.set(x, "publicAccessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessLevelUndefined: Self = StObject.set(x, "publicAccessLevel", js.undefined)
  }
}
