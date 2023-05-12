package typings.awsSdkLibDynamodb

import typings.awsSdkUtilDynamodb.distTypesMarshallMod.marshallOptions
import typings.awsSdkUtilDynamodb.distTypesUnmarshallMod.unmarshallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsUtilsMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/commands/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def marshallInput(obj: Any, keyNodes: js.Array[KeyNode]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("marshallInput")(obj.asInstanceOf[js.Any], keyNodes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def marshallInput(obj: Any, keyNodes: js.Array[KeyNode], options: marshallOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("marshallInput")(obj.asInstanceOf[js.Any], keyNodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unmarshallOutput(obj: Any, keyNodes: js.Array[KeyNode]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshallOutput")(obj.asInstanceOf[js.Any], keyNodes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unmarshallOutput(obj: Any, keyNodes: js.Array[KeyNode], options: unmarshallOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshallOutput")(obj.asInstanceOf[js.Any], keyNodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait AllNodes extends StObject {
    
    var children: js.UndefOr[js.Array[KeyNode] | AllNodes] = js.undefined
  }
  object AllNodes {
    
    inline def apply(): AllNodes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllNodes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllNodes] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[KeyNode] | AllNodes): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: KeyNode*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait KeyNode extends StObject {
    
    var children: js.UndefOr[js.Array[KeyNode] | AllNodes] = js.undefined
    
    var key: String
  }
  object KeyNode {
    
    inline def apply(key: String): KeyNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[KeyNode] | AllNodes): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: KeyNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
