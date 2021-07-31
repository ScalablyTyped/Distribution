package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlobPropertiesOptions
  extends StObject
     with LeaseAccessConditionsOptions {
  
  var snapshotId: js.UndefOr[String] = js.undefined
}
object GetBlobPropertiesOptions {
  
  @scala.inline
  def apply(): GetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlobPropertiesOptions]
  }
  
  @scala.inline
  implicit class GetBlobPropertiesOptionsMutableBuilder[Self <: GetBlobPropertiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
