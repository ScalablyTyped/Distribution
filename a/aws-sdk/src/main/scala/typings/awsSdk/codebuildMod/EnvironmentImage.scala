package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentImage extends StObject {
  
  /**
    * The description of the Docker image.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Docker image.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of environment image versions.
    */
  var versions: js.UndefOr[ImageVersions] = js.undefined
}
object EnvironmentImage {
  
  inline def apply(): EnvironmentImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentImage]
  }
  
  extension [Self <: EnvironmentImage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersions(value: ImageVersions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
