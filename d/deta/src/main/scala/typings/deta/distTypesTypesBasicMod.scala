package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.deta.distTypesTypesActionMod.Action
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesBasicMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ArrayType = std.Array<deta.deta/dist/types/types/basic.ArrayType | deta.deta/dist/types/types/basic.ObjectType | deta.deta/dist/types/types/basic.BasicType | deta.deta/dist/types/types/basic.NullType | deta.deta/dist/types/types/basic.UndefinedType>
  }}}
  to avoid circular code involving: 
  - deta.deta/dist/types/types/basic.ArrayType
  */
  @js.native
  trait ArrayType
    extends StObject
       with Array[ArrayType | ObjectType | BasicType | NullType | UndefinedType]
  
  type BasicType = String | Double | Boolean
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CompositeType = deta.deta/dist/types/types/basic.ArrayType | deta.deta/dist/types/types/basic.ObjectType
  }}}
  to avoid circular code involving: 
  - deta.deta/dist/types/types/basic.ArrayType
  - deta.deta/dist/types/types/basic.CompositeType
  */
  type CompositeType = Any | ObjectType
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DetaType = deta.deta/dist/types/types/basic.ArrayType | deta.deta/dist/types/types/basic.ObjectType | deta.deta/dist/types/types/basic.BasicType
  }}}
  to avoid circular code involving: 
  - deta.deta/dist/types/types/basic.ArrayType
  - deta.deta/dist/types/types/basic.DetaType
  */
  type DetaType = Any | ObjectType | BasicType
  
  type NullType = Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ObjectType = {[key: string] : deta.deta/dist/types/types/basic.ObjectType | deta.deta/dist/types/types/basic.ArrayType | deta.deta/dist/types/types/basic.BasicType | deta.deta/dist/types/types/basic.NullType | deta.deta/dist/types/types/basic.UndefinedType | deta.deta/dist/types/types/action.Action}
  }}}
  to avoid circular code involving: 
  - deta.deta/dist/types/types/base/response.GetResponse
  - deta.deta/dist/types/types/base/response.PutResponse
  - deta.deta/dist/types/types/basic.ArrayType
  - deta.deta/dist/types/types/basic.CompositeType
  - deta.deta/dist/types/types/basic.DetaType
  - deta.deta/dist/types/types/basic.ObjectType
  */
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
