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
  open class XmlBodyBuilder protected () extends StObject {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    
    /* private */ val base64Encoder: Any = js.native
    
    def build(
      hasOperationMemberHasPayloadInputMemberName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ Any
    ): String = js.native
    
    /* private */ var formatMap: Any = js.native
    
    /* private */ var serialize: Any = js.native
    
    /* private */ var serializeBlob: Any = js.native
    
    /* private */ var serializeFloat: Any = js.native
    
    /* private */ var serializeInteger: Any = js.native
    
    /* private */ var serializeList: Any = js.native
    
    /* private */ var serializeMap: Any = js.native
    
    /* private */ var serializeScalar: Any = js.native
    
    /* private */ var serializeString: Any = js.native
    
    /* private */ var serializeStructure: Any = js.native
    
    /* private */ var serializeStructureMember: Any = js.native
    
    /* private */ var serializeTimestamp: Any = js.native
    
    /* private */ var toXml: Any = js.native
    
    /* private */ val utf8Decoder: Any = js.native
  }
}
