package typings.awsSdkXmlBodyBuilder

import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer * / any */ @JSImport("@aws-sdk/xml-body-builder", "XmlBodyBuilder")
  @js.native
  class XmlBodyBuilder protected () extends StObject {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    
    /* private */ val base64Encoder: js.Any = js.native
    
    def build(
      hasOperationMemberHasPayloadInputMemberName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ js.Any
    ): String = js.native
    
    /* private */ var formatMap: js.Any = js.native
    
    /* private */ var serialize: js.Any = js.native
    
    /* private */ var serializeBlob: js.Any = js.native
    
    /* private */ var serializeFloat: js.Any = js.native
    
    /* private */ var serializeInteger: js.Any = js.native
    
    /* private */ var serializeList: js.Any = js.native
    
    /* private */ var serializeMap: js.Any = js.native
    
    /* private */ var serializeScalar: js.Any = js.native
    
    /* private */ var serializeString: js.Any = js.native
    
    /* private */ var serializeStructure: js.Any = js.native
    
    /* private */ var serializeStructureMember: js.Any = js.native
    
    /* private */ var serializeTimestamp: js.Any = js.native
    
    /* private */ var toXml: js.Any = js.native
    
    /* private */ val utf8Decoder: js.Any = js.native
  }
}
