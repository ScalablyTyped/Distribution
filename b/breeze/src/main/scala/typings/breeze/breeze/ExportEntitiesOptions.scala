package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportEntitiesOptions extends StObject {
  
  var asString: Boolean
  
  // default true
  var includeMetadata: Boolean
}
object ExportEntitiesOptions {
  
  @scala.inline
  def apply(asString: Boolean, includeMetadata: Boolean): ExportEntitiesOptions = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEntitiesOptions]
  }
  
  @scala.inline
  implicit class ExportEntitiesOptionsMutableBuilder[Self <: ExportEntitiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMetadata(value: Boolean): Self = StObject.set(x, "includeMetadata", value.asInstanceOf[js.Any])
  }
}
