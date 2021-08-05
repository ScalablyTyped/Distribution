package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationId extends StObject {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.undefined
}
object ConfigurationId {
  
  inline def apply(): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationId]
  }
  
  extension [Self <: ConfigurationId](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRevision(value: integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
  }
}
