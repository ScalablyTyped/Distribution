package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectReference extends StObject {
  
  /**
    * A path selector supports easy selection of an object by the parent/child links leading to it from the directory root. Use the link names from each parent/child link to construct the path. Path selectors start with a slash (/) and link names are separated by slashes. For more information about paths, see Access Objects. You can identify an object in one of the following ways:    $ObjectIdentifier - An object identifier is an opaque string provided by Amazon Cloud Directory. When creating objects, the system will provide you with the identifier of the created object. An object’s identifier is immutable and no two objects will ever share the same object identifier    /some/path - Identifies the object based on path    #SomeBatchReference - Identifies the object in a batch call  
    */
  var Selector: js.UndefOr[SelectorObjectReference] = js.undefined
}
object ObjectReference {
  
  @scala.inline
  def apply(): ObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectReference]
  }
  
  @scala.inline
  implicit class ObjectReferenceMutableBuilder[Self <: ObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: SelectorObjectReference): Self = StObject.set(x, "Selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "Selector", js.undefined)
  }
}
