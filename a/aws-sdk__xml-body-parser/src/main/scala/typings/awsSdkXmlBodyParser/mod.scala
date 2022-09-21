package typings.awsSdkXmlBodyParser

import typings.awsSdkTypes.utilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser * / any */ @JSImport("@aws-sdk/xml-body-parser", "XmlBodyParser")
  @js.native
  open class XmlBodyParser protected () extends StObject {
    def this(base64Decoder: Decoder) = this()
    
    /* private */ val base64Decoder: Any = js.native
    
    /* private */ var mapToXMLKey: Any = js.native
    
    def parse[OutputType](
      member: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ Any,
      input: String
    ): OutputType = js.native
    
    /* private */ var parseList: Any = js.native
    
    /* private */ var parseMap: Any = js.native
    
    /* private */ var parseStructure: Any = js.native
    
    /* private */ var parseTimeStamp: Any = js.native
    
    /* private */ var unmarshall: Any = js.native
  }
}
