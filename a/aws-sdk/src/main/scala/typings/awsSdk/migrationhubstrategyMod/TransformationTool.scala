package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationTool extends StObject {
  
  /**
    *  Description of the tool. 
    */
  var description: js.UndefOr[TranformationToolDescription] = js.undefined
  
  /**
    *  Name of the tool. 
    */
  var name: js.UndefOr[TransformationToolName] = js.undefined
  
  /**
    *  URL for installing the tool. 
    */
  var tranformationToolInstallationLink: js.UndefOr[TranformationToolInstallationLink] = js.undefined
}
object TransformationTool {
  
  inline def apply(): TransformationTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformationTool]
  }
  
  extension [Self <: TransformationTool](x: Self) {
    
    inline def setDescription(value: TranformationToolDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: TransformationToolName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTranformationToolInstallationLink(value: TranformationToolInstallationLink): Self = StObject.set(x, "tranformationToolInstallationLink", value.asInstanceOf[js.Any])
    
    inline def setTranformationToolInstallationLinkUndefined: Self = StObject.set(x, "tranformationToolInstallationLink", js.undefined)
  }
}
