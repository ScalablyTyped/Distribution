package typings.cypress.Cypress

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularDevServerProjectConfig extends StObject {
  
  var buildOptions: Record[String, Any]
  
  var root: String
  
  var sourceRoot: String
}
object AngularDevServerProjectConfig {
  
  inline def apply(buildOptions: Record[String, Any], root: String, sourceRoot: String): AngularDevServerProjectConfig = {
    val __obj = js.Dynamic.literal(buildOptions = buildOptions.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularDevServerProjectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngularDevServerProjectConfig] (val x: Self) extends AnyVal {
    
    inline def setBuildOptions(value: Record[String, Any]): Self = StObject.set(x, "buildOptions", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
  }
}
