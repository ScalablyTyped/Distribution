package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropPrimaryIndexOptions extends StObject {
  
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.undefined
}
object DropPrimaryIndexOptions {
  
  inline def apply(): DropPrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropPrimaryIndexOptions]
  }
  
  extension [Self <: DropPrimaryIndexOptions](x: Self) {
    
    inline def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
