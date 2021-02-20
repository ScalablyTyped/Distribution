package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePrimaryIndexOptions extends StObject {
  
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.native
  
  /**
    * If a primary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.native
}
object CreatePrimaryIndexOptions {
  
  @scala.inline
  def apply(): CreatePrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePrimaryIndexOptions]
  }
  
  @scala.inline
  implicit class CreatePrimaryIndexOptionsMutableBuilder[Self <: CreatePrimaryIndexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
