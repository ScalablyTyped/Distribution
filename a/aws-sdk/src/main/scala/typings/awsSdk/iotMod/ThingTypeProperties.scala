package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeProperties extends StObject {
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined
  
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
}
object ThingTypeProperties {
  
  inline def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  extension [Self <: ThingTypeProperties](x: Self) {
    
    inline def setSearchableAttributes(value: SearchableAttributes): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    inline def setSearchableAttributesVarargs(value: AttributeName*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
    
    inline def setThingTypeDescription(value: ThingTypeDescription): Self = StObject.set(x, "thingTypeDescription", value.asInstanceOf[js.Any])
    
    inline def setThingTypeDescriptionUndefined: Self = StObject.set(x, "thingTypeDescription", js.undefined)
  }
}
