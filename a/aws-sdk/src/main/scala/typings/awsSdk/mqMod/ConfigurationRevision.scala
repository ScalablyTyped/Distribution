package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRevision extends StObject {
  
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.undefined
}
object ConfigurationRevision {
  
  inline def apply(): ConfigurationRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRevision]
  }
  
  extension [Self <: ConfigurationRevision](x: Self) {
    
    inline def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRevision(value: integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
  }
}
