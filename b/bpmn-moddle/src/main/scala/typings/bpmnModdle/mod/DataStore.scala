package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStore
  extends StObject
     with ItemAwareElement {
  
  var capacity: Double
  
  var isUnlimited: Boolean
  
  var name: String
}
object DataStore {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    capacity: Double,
    dataState: DataState,
    id: String,
    isUnlimited: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String
  ): DataStore = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isUnlimited = isUnlimited.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStore]
  }
  
  @scala.inline
  implicit class DataStoreMutableBuilder[Self <: DataStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnlimited(value: Boolean): Self = StObject.set(x, "isUnlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
