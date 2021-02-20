package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.cloudeventsSdk.anon.Dictx
import typings.cloudeventsSdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiverBinary03Mod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/v03/receiver_binary_0_3", JSImport.Namespace)
  @js.native
  class ^ () extends Receiver
  
  @js.native
  trait Receiver extends StObject {
    
    var Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^] = js.native
    
    var allowedContentTypes: js.Array[_] = js.native
    
    var extensionsPrefix: js.Any = js.native
    
    var parsersByEncoding: Dictx = js.native
    
    var requiredHeaders: js.Array[_] = js.native
    
    var setterByHeader: NumberDictionary[Name] = js.native
    
    var spec: typings.cloudeventsSdk.spec03Mod.^ = js.native
    
    var specversion: js.Any = js.native
  }
  object Receiver {
    
    @scala.inline
    def apply(
      Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^],
      allowedContentTypes: js.Array[_],
      extensionsPrefix: js.Any,
      parsersByEncoding: Dictx,
      requiredHeaders: js.Array[_],
      setterByHeader: NumberDictionary[Name],
      spec: typings.cloudeventsSdk.spec03Mod.^,
      specversion: js.Any
    ): Receiver = {
      val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], extensionsPrefix = extensionsPrefix.asInstanceOf[js.Any], parsersByEncoding = parsersByEncoding.asInstanceOf[js.Any], requiredHeaders = requiredHeaders.asInstanceOf[js.Any], setterByHeader = setterByHeader.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    @scala.inline
    implicit class ReceiverMutableBuilder[Self <: Receiver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedContentTypes(value: js.Array[_]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedContentTypesVarargs(value: js.Any*): Self = StObject.set(x, "allowedContentTypes", js.Array(value :_*))
      
      @scala.inline
      def setExtensionsPrefix(value: js.Any): Self = StObject.set(x, "extensionsPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsersByEncoding(value: Dictx): Self = StObject.set(x, "parsersByEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredHeaders(value: js.Array[_]): Self = StObject.set(x, "requiredHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredHeadersVarargs(value: js.Any*): Self = StObject.set(x, "requiredHeaders", js.Array(value :_*))
      
      @scala.inline
      def setSetterByHeader(value: NumberDictionary[Name]): Self = StObject.set(x, "setterByHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec03Mod.^]): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecversion(value: js.Any): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
    }
  }
}
