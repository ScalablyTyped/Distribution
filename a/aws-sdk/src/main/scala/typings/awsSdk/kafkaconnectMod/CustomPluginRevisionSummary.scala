package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginRevisionSummary extends StObject {
  
  /**
    * The format of the plugin file.
    */
  var contentType: js.UndefOr[CustomPluginContentType] = js.undefined
  
  /**
    * The time that the custom plugin was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the custom plugin.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * Details about the custom plugin file.
    */
  var fileDescription: js.UndefOr[CustomPluginFileDescription] = js.undefined
  
  /**
    * Information about the location of the custom plugin.
    */
  var location: js.UndefOr[CustomPluginLocationDescription] = js.undefined
  
  /**
    * The revision of the custom plugin.
    */
  var revision: js.UndefOr[long] = js.undefined
}
object CustomPluginRevisionSummary {
  
  inline def apply(): CustomPluginRevisionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPluginRevisionSummary]
  }
  
  extension [Self <: CustomPluginRevisionSummary](x: Self) {
    
    inline def setContentType(value: CustomPluginContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFileDescription(value: CustomPluginFileDescription): Self = StObject.set(x, "fileDescription", value.asInstanceOf[js.Any])
    
    inline def setFileDescriptionUndefined: Self = StObject.set(x, "fileDescription", js.undefined)
    
    inline def setLocation(value: CustomPluginLocationDescription): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
