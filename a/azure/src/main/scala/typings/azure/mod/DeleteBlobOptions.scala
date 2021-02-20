package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBlobOptions extends GetBlobPropertiesOptions {
  
  var deleteSnapshots: js.UndefOr[String] = js.native
}
object DeleteBlobOptions {
  
  @scala.inline
  def apply(): DeleteBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBlobOptions]
  }
  
  @scala.inline
  implicit class DeleteBlobOptionsMutableBuilder[Self <: DeleteBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteSnapshots(value: String): Self = StObject.set(x, "deleteSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSnapshotsUndefined: Self = StObject.set(x, "deleteSnapshots", js.undefined)
  }
}
