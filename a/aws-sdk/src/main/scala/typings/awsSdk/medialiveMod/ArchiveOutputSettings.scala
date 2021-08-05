package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveOutputSettings extends StObject {
  
  /**
    * Settings specific to the container type of the file.
    */
  var ContainerSettings: ArchiveContainerSettings
  
  /**
    * Output file extension. If excluded, this will be auto-selected from the container type.
    */
  var Extension: js.UndefOr[string] = js.undefined
  
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[string] = js.undefined
}
object ArchiveOutputSettings {
  
  inline def apply(ContainerSettings: ArchiveContainerSettings): ArchiveOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOutputSettings]
  }
  
  extension [Self <: ArchiveOutputSettings](x: Self) {
    
    inline def setContainerSettings(value: ArchiveContainerSettings): Self = StObject.set(x, "ContainerSettings", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: string): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
    
    inline def setNameModifier(value: string): Self = StObject.set(x, "NameModifier", value.asInstanceOf[js.Any])
    
    inline def setNameModifierUndefined: Self = StObject.set(x, "NameModifier", js.undefined)
  }
}
