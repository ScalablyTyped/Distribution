package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTagKeyResource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The key-name for the LF-tag.
    */
  var TagKey: NameString
  
  /**
    * A list of possible values an attribute can take.
    */
  var TagValues: TagValueList
}
object LFTagKeyResource {
  
  inline def apply(TagKey: NameString, TagValues: TagValueList): LFTagKeyResource = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValues = TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFTagKeyResource]
  }
  
  extension [Self <: LFTagKeyResource](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setTagKey(value: NameString): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValues(value: TagValueList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesVarargs(value: LFTagValue*): Self = StObject.set(x, "TagValues", js.Array(value*))
  }
}
