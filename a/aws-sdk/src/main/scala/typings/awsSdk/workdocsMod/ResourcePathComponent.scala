package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePathComponent extends StObject {
  
  /**
    * The ID of the resource path.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  
  /**
    * The name of the resource path.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
}
object ResourcePathComponent {
  
  @scala.inline
  def apply(): ResourcePathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePathComponent]
  }
  
  @scala.inline
  implicit class ResourcePathComponentMutableBuilder[Self <: ResourcePathComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
