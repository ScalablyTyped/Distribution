package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataOptions extends TimeoutIntervalOptions {
  
  var metadata: js.UndefOr[StorageMetadata] = js.native
}
object MetadataOptions {
  
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  @scala.inline
  implicit class MetadataOptionsMutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: StorageMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
