package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePath extends StObject {
  
  /**
    * The components of the resource path.
    */
  var Components: js.UndefOr[ResourcePathComponentList] = js.undefined
}
object ResourcePath {
  
  @scala.inline
  def apply(): ResourcePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePath]
  }
  
  @scala.inline
  implicit class ResourcePathMutableBuilder[Self <: ResourcePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: ResourcePathComponentList): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "Components", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: ResourcePathComponent*): Self = StObject.set(x, "Components", js.Array(value :_*))
  }
}
