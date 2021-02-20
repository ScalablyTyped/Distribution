package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasPathType extends StObject {
  
  /**
    * The API versions.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The path of an alias.
    */
  var path: js.UndefOr[String] = js.native
}
object AliasPathType {
  
  @scala.inline
  def apply(): AliasPathType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasPathType]
  }
  
  @scala.inline
  implicit class AliasPathTypeMutableBuilder[Self <: AliasPathType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    @scala.inline
    def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
