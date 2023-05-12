package typings.cucumberCucumber.anon

import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportPaths extends StObject {
  
  var cwd: String
  
  var importPaths: js.Array[String]
  
  def newId(): String
  @JSName("newId")
  var newId_Original: NewId
  
  var requireModules: js.Array[String]
  
  var requirePaths: js.Array[String]
}
object ImportPaths {
  
  inline def apply(
    cwd: String,
    importPaths: js.Array[String],
    newId: () => String,
    requireModules: js.Array[String],
    requirePaths: js.Array[String]
  ): ImportPaths = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportPaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportPaths] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
    
    inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
    
    inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
    
    inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
    
    inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
    
    inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
    
    inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
  }
}
