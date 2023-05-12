package typings.cucumberCucumber.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISupportCodeCoordinates
  extends StObject
     with ISupportCodeCoordinatesOrLibrary {
  
  var importPaths: js.Array[String]
  
  var requireModules: js.Array[String]
  
  var requirePaths: js.Array[String]
}
object ISupportCodeCoordinates {
  
  inline def apply(importPaths: js.Array[String], requireModules: js.Array[String], requirePaths: js.Array[String]): ISupportCodeCoordinates = {
    val __obj = js.Dynamic.literal(importPaths = importPaths.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISupportCodeCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISupportCodeCoordinates] (val x: Self) extends AnyVal {
    
    inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
    
    inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
    
    inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
    
    inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
    
    inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
    
    inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
  }
}
