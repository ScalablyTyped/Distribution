package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverStructured1Mod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/v1/receiver_structured_1", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Receiver {
    
    /* CompleteClass */
    var Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^] = js.native
    
    /* CompleteClass */
    var allowedContentTypes: js.Array[Any] = js.native
    
    /* CompleteClass */
    var parserByMime: NumberDictionary[Any] = js.native
    
    /* CompleteClass */
    var parserMap: Map[Any, Any] = js.native
    
    /* CompleteClass */
    var spec: typings.cloudeventsSdk.spec1Mod.^ = js.native
  }
  
  trait Receiver extends StObject {
    
    var Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^]
    
    var allowedContentTypes: js.Array[Any]
    
    var parserByMime: NumberDictionary[Any]
    
    var parserMap: Map[Any, Any]
    
    var spec: typings.cloudeventsSdk.spec1Mod.^
  }
  object Receiver {
    
    inline def apply(
      Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^],
      allowedContentTypes: js.Array[Any],
      parserByMime: NumberDictionary[Any],
      parserMap: Map[Any, Any],
      spec: typings.cloudeventsSdk.spec1Mod.^
    ): Receiver = {
      val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], parserByMime = parserByMime.asInstanceOf[js.Any], parserMap = parserMap.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    extension [Self <: Receiver](x: Self) {
      
      inline def setAllowedContentTypes(value: js.Array[Any]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedContentTypesVarargs(value: Any*): Self = StObject.set(x, "allowedContentTypes", js.Array(value*))
      
      inline def setParserByMime(value: NumberDictionary[Any]): Self = StObject.set(x, "parserByMime", value.asInstanceOf[js.Any])
      
      inline def setParserMap(value: Map[Any, Any]): Self = StObject.set(x, "parserMap", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec1Mod.^]): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    }
  }
}
