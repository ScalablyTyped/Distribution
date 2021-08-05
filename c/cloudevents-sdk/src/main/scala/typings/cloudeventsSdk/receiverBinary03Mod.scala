package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.cloudeventsSdk.anon.Dictx
import typings.cloudeventsSdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverBinary03Mod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/v03/receiver_binary_0_3", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Receiver {
    
    /* CompleteClass */
    var Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^] = js.native
    
    /* CompleteClass */
    var allowedContentTypes: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var extensionsPrefix: js.Any = js.native
    
    /* CompleteClass */
    var parsersByEncoding: Dictx = js.native
    
    /* CompleteClass */
    var requiredHeaders: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var setterByHeader: NumberDictionary[Name] = js.native
    
    /* CompleteClass */
    var spec: typings.cloudeventsSdk.spec03Mod.^ = js.native
    
    /* CompleteClass */
    var specversion: js.Any = js.native
  }
  
  trait Receiver extends StObject {
    
    var Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^]
    
    var allowedContentTypes: js.Array[js.Any]
    
    var extensionsPrefix: js.Any
    
    var parsersByEncoding: Dictx
    
    var requiredHeaders: js.Array[js.Any]
    
    var setterByHeader: NumberDictionary[Name]
    
    var spec: typings.cloudeventsSdk.spec03Mod.^
    
    var specversion: js.Any
  }
  object Receiver {
    
    inline def apply(
      Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^],
      allowedContentTypes: js.Array[js.Any],
      extensionsPrefix: js.Any,
      parsersByEncoding: Dictx,
      requiredHeaders: js.Array[js.Any],
      setterByHeader: NumberDictionary[Name],
      spec: typings.cloudeventsSdk.spec03Mod.^,
      specversion: js.Any
    ): Receiver = {
      val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], extensionsPrefix = extensionsPrefix.asInstanceOf[js.Any], parsersByEncoding = parsersByEncoding.asInstanceOf[js.Any], requiredHeaders = requiredHeaders.asInstanceOf[js.Any], setterByHeader = setterByHeader.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    extension [Self <: Receiver](x: Self) {
      
      inline def setAllowedContentTypes(value: js.Array[js.Any]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedContentTypesVarargs(value: js.Any*): Self = StObject.set(x, "allowedContentTypes", js.Array(value :_*))
      
      inline def setExtensionsPrefix(value: js.Any): Self = StObject.set(x, "extensionsPrefix", value.asInstanceOf[js.Any])
      
      inline def setParsersByEncoding(value: Dictx): Self = StObject.set(x, "parsersByEncoding", value.asInstanceOf[js.Any])
      
      inline def setRequiredHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "requiredHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequiredHeadersVarargs(value: js.Any*): Self = StObject.set(x, "requiredHeaders", js.Array(value :_*))
      
      inline def setSetterByHeader(value: NumberDictionary[Name]): Self = StObject.set(x, "setterByHeader", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec03Mod.^]): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
      
      inline def setSpecversion(value: js.Any): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
    }
  }
}
