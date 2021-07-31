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
    
    val base64Encoder: js.Any = js.native
    
    def build(
      hasOperationMemberHasPayloadInputMemberName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ js.Any
    ): String = js.native
    
    var formatMap: js.Any = js.native
    
    var serialize: js.Any = js.native
    
    var serializeBlob: js.Any = js.native
    
    var serializeFloat: js.Any = js.native
    
    var serializeInteger: js.Any = js.native
    
    var serializeList: js.Any = js.native
    
    var serializeMap: js.Any = js.native
    
    var serializeScalar: js.Any = js.native
    
    var serializeString: js.Any = js.native
    
    var serializeStructure: js.Any = js.native
    
    var serializeStructureMember: js.Any = js.native
    
    var serializeTimestamp: js.Any = js.native
    
    var toXml: js.Any = js.native
    
    val utf8Decoder: js.Any = js.native
  }
}
