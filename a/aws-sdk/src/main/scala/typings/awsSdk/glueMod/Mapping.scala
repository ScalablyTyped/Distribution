package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mapping extends StObject {
  
  /**
    * Only applicable to nested data structures. If you want to change the parent structure, but also one of its children, you can fill out this data strucutre. It is also Mapping, but its FromPath will be the parent's FromPath plus the FromPath from this structure. For the children part, suppose you have the structure:  { "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }  You can specify a Mapping that looks like:  { "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] } 
    */
  var Children: js.UndefOr[Mappings] = js.undefined
  
  /**
    * If true, then the column is removed.
    */
  var Dropped: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The table or column to be modified.
    */
  var FromPath: js.UndefOr[EnclosedInStringProperties] = js.undefined
  
  /**
    * The type of the data to be modified.
    */
  var FromType: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * After the apply mapping, what the name of the column should be. Can be the same as FromPath.
    */
  var ToKey: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The data type that the data is to be modified to.
    */
  var ToType: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object Mapping {
  
  inline def apply(): Mapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mapping]
  }
  
  extension [Self <: Mapping](x: Self) {
    
    inline def setChildren(value: Mappings): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    inline def setChildrenVarargs(value: Mapping*): Self = StObject.set(x, "Children", js.Array(value*))
    
    inline def setDropped(value: BoxedBoolean): Self = StObject.set(x, "Dropped", value.asInstanceOf[js.Any])
    
    inline def setDroppedUndefined: Self = StObject.set(x, "Dropped", js.undefined)
    
    inline def setFromPath(value: EnclosedInStringProperties): Self = StObject.set(x, "FromPath", value.asInstanceOf[js.Any])
    
    inline def setFromPathUndefined: Self = StObject.set(x, "FromPath", js.undefined)
    
    inline def setFromPathVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "FromPath", js.Array(value*))
    
    inline def setFromType(value: EnclosedInStringProperty): Self = StObject.set(x, "FromType", value.asInstanceOf[js.Any])
    
    inline def setFromTypeUndefined: Self = StObject.set(x, "FromType", js.undefined)
    
    inline def setToKey(value: EnclosedInStringProperty): Self = StObject.set(x, "ToKey", value.asInstanceOf[js.Any])
    
    inline def setToKeyUndefined: Self = StObject.set(x, "ToKey", js.undefined)
    
    inline def setToType(value: EnclosedInStringProperty): Self = StObject.set(x, "ToType", value.asInstanceOf[js.Any])
    
    inline def setToTypeUndefined: Self = StObject.set(x, "ToType", js.undefined)
  }
}
