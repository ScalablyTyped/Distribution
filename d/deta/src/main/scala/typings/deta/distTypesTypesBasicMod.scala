package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.deta.distTypesTypesActionMod.Action
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesBasicMod {
  
  @js.native
  trait ArrayType
    extends StObject
       with Array[ArrayType | ObjectType | BasicType | NullType | UndefinedType]
  
  type BasicType = String | Double | Boolean
  
  type CompositeType = Any | ObjectType
  
  type DetaType = Any | ObjectType | BasicType
  
  type NullType = Null
  
  trait ObjectType
    extends StObject
       with /* key */ StringDictionary[ObjectType | ArrayType | BasicType | NullType | UndefinedType | Action]
  object ObjectType {
    
    inline def apply(): ObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectType]
    }
  }
  
  type UndefinedType = Unit
}
