package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.cloudeventsSdk.anon.Dictx
import typings.cloudeventsSdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverBinary1Mod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/v1/receiver_binary_1", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Receiver {
    
    /* CompleteClass */
    var Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^] = js.native
    
    /* CompleteClass */
    var allowedContentTypes: js.Array[Any] = js.native
    
    /* CompleteClass */
    var extensionsPrefix: Any = js.native
    
    /* CompleteClass */
    var parserByType: NumberDictionary[Any] = js.native
    
    /* CompleteClass */
    var parsersByEncoding: Dictx = js.native
    
    /* CompleteClass */
    var requiredHeaders: js.Array[Any] = js.native
    
    /* CompleteClass */
    var setterByHeader: NumberDictionary[Name] = js.native
    
    /* CompleteClass */
    var spec: typings.cloudeventsSdk.spec1Mod.^ = js.native
    
    /* CompleteClass */
    var specversion: Any = js.native
  }
  
  trait Receiver extends StObject {
    
    var Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^]
    
    var allowedContentTypes: js.Array[Any]
    
    var extensionsPrefix: Any
    
    var parserByType: NumberDictionary[Any]
    
    var parsersByEncoding: Dictx
    
    var requiredHeaders: js.Array[Any]
    
    var setterByHeader: NumberDictionary[Name]
    
    var spec: typings.cloudeventsSdk.spec1Mod.^
    
    var specversion: Any
  }
  object Receiver {
    
    inline def apply(
      Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^],
      allowedContentTypes: js.Array[Any],
      extensionsPrefix: Any,
      parserByType: NumberDictionary[Any],
      parsersByEncoding: Dictx,
      requiredHeaders: js.Array[Any],
      setterByHeader: NumberDictionary[Name],
      spec: typings.cloudeventsSdk.spec1Mod.^,
      specversion: Any
    ): Receiver = {
      val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], extensionsPrefix = extensionsPrefix.asInstanceOf[js.Any], parserByType = parserByType.asInstanceOf[js.Any], parsersByEncoding = parsersByEncoding.asInstanceOf[js.Any], requiredHeaders = requiredHeaders.asInstanceOf[js.Any], setterByHeader = setterByHeader.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    extension [Self <: Receiver](x: Self) {
      
      inline def setAllowedContentTypes(value: js.Array[Any]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedContentTypesVarargs(value: Any*): Self = StObject.set(x, "allowedContentTypes", js.Array(value*))
      
      inline def setExtensionsPrefix(value: Any): Self = StObject.set(x, "extensionsPrefix", value.asInstanceOf[js.Any])
      
      inline def setParserByType(value: NumberDictionary[Any]): Self = StObject.set(x, "parserByType", value.asInstanceOf[js.Any])
      
      inline def setParsersByEncoding(value: Dictx): Self = StObject.set(x, "parsersByEncoding", value.asInstanceOf[js.Any])
      
      inline def setRequiredHeaders(value: js.Array[Any]): Self = StObject.set(x, "requiredHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequiredHeadersVarargs(value: Any*): Self = StObject.set(x, "requiredHeaders", js.Array(value*))
      
      inline def setSetterByHeader(value: NumberDictionary[Name]): Self = StObject.set(x, "setterByHeader", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec1Mod.^]): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
      
      inline def setSpecversion(value: Any): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
    }
  }
}
