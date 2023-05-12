package typings.awsSdk2Types

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk2Types.libModelMod.Scalar
    - typings.awsSdk2Types.libModelMod.Structure
    - typings.awsSdk2Types.libModelMod.List
  */
  type DocumentType = _DocumentType | Scalar
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type List = std.Array<aws-sdk2-types.aws-sdk2-types/lib/model.DocumentType>
  }}}
  to avoid circular code involving: 
  - aws-sdk2-types.aws-sdk2-types/lib/model.DocumentType
  - aws-sdk2-types.aws-sdk2-types/lib/model.List
  */
  @js.native
  trait List
    extends StObject
       with Array[DocumentType]
       with _DocumentType
  
  type Scalar = String | Double | Boolean | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Structure = {[member: string] : aws-sdk2-types.aws-sdk2-types/lib/model.DocumentType}
  }}}
  to avoid circular code involving: 
  - aws-sdk2-types.aws-sdk2-types/lib/model.DocumentType
  - aws-sdk2-types.aws-sdk2-types/lib/model.List
  - aws-sdk2-types.aws-sdk2-types/lib/model.Structure
  */
  trait Structure
    extends StObject
       with /* member */ StringDictionary[DocumentType]
       with _DocumentType
  object Structure {
    
    inline def apply(): Structure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Structure]
    }
  }
  
  trait _DocumentType extends StObject
}
