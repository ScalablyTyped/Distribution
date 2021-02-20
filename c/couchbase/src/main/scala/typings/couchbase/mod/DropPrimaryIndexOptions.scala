package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropPrimaryIndexOptions extends StObject {
  
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.native
}
object DropPrimaryIndexOptions {
  
  @scala.inline
  def apply(): DropPrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropPrimaryIndexOptions]
  }
  
  @scala.inline
  implicit class DropPrimaryIndexOptionsMutableBuilder[Self <: DropPrimaryIndexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
