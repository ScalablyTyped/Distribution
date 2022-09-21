package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The URI describing the additional information
    */
  var additionalInfoUri: String
  
  /**
    * Display text providing more information about the document URI
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object Description {
  
  inline def apply(additionalInfoUri: String): Description = {
    val __obj = js.Dynamic.literal(additionalInfoUri = additionalInfoUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
