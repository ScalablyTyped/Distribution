package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentImage extends StObject {
  
  /**
    * The description of the Docker image.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the Docker image.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of environment image versions.
    */
  var versions: js.UndefOr[ImageVersions] = js.native
}
object EnvironmentImage {
  
  @scala.inline
  def apply(): EnvironmentImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentImage]
  }
  
  @scala.inline
  implicit class EnvironmentImageMutableBuilder[Self <: EnvironmentImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersions(value: ImageVersions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
