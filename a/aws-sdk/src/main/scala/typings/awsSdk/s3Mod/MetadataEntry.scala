package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataEntry extends StObject {
  
  /**
    * Name of the Object.
    */
  var Name: js.UndefOr[MetadataKey] = js.native
  
  /**
    * Value of the Object.
    */
  var Value: js.UndefOr[MetadataValue] = js.native
}
object MetadataEntry {
  
  @scala.inline
  def apply(): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataEntry]
  }
  
  @scala.inline
  implicit class MetadataEntryMutableBuilder[Self <: MetadataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MetadataKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: MetadataValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
