package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.modelMod.Scalar
    - typings.awsSdk.modelMod.Structure
    - typings.awsSdk.modelMod.List
  */
  type DocumentType = _DocumentType | Scalar
  
  @js.native
  trait List
    extends StObject
       with Array[DocumentType]
       with _DocumentType
  
  type Scalar = String | Double | Boolean | Null
  
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
