package typings.couchbase.mod

import typings.couchbase.couchbaseStrings.gsi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexInfo extends StObject {
  
  /**
    * ID for the index.
    */
  var id: String
  
  /**
    * List of index keys.
    */
  var index_key: js.Array[String]
  
  /**
    * True if this is a primary index.
    */
  var is_primary: Boolean
  
  /**
    * ID for the keyspace to which the index belongs.
    */
  var keyspace_id: String
  
  /**
    * Name for the index.
    */
  var name: String
  
  /**
    * ID for the namespace to which the index belongs.
    */
  var namespace_id: String
  
  /**
    * The current state of the index.
    *
    * Values include `online` and `pending`.
    */
  var state: String
  
  /**
    * ID for the datastore to which the index belongs.
    */
  var store_id: String
  
  /**
    * The type of view, which will always be `gsi`.
    */
  var `using`: gsi
}
object IndexInfo {
  
  inline def apply(
    id: String,
    index_key: js.Array[String],
    is_primary: Boolean,
    keyspace_id: String,
    name: String,
    namespace_id: String,
    state: String,
    store_id: String
  ): IndexInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index_key = index_key.asInstanceOf[js.Any], is_primary = is_primary.asInstanceOf[js.Any], keyspace_id = keyspace_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace_id = namespace_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store_id = store_id.asInstanceOf[js.Any])
    __obj.updateDynamic("using")("gsi")
    __obj.asInstanceOf[IndexInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex_key(value: js.Array[String]): Self = StObject.set(x, "index_key", value.asInstanceOf[js.Any])
    
    inline def setIndex_keyVarargs(value: String*): Self = StObject.set(x, "index_key", js.Array(value*))
    
    inline def setIs_primary(value: Boolean): Self = StObject.set(x, "is_primary", value.asInstanceOf[js.Any])
    
    inline def setKeyspace_id(value: String): Self = StObject.set(x, "keyspace_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace_id(value: String): Self = StObject.set(x, "namespace_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStore_id(value: String): Self = StObject.set(x, "store_id", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: gsi): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
  }
}
