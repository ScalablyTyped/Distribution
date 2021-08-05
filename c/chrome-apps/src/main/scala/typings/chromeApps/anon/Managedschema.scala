package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Managedschema extends StObject {
  
  /**
    * The storage.managed_schema property indicates a file within the app that contains the policy schema.
    * @see ManagedSchema for schema content typings
    * @see[Docs and Schema Format]{@link https://developer.chrome.com/apps/manifest/storage}
    */
  var managed_schema: String
}
object Managedschema {
  
  inline def apply(managed_schema: String): Managedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Managedschema]
  }
  
  extension [Self <: Managedschema](x: Self) {
    
    inline def setManaged_schema(value: String): Self = StObject.set(x, "managed_schema", value.asInstanceOf[js.Any])
  }
}
