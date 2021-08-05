package typings.awsSdkQueryBuilder

import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer * / any */ @JSImport("@aws-sdk/query-builder", "QueryBuilder")
  @js.native
  class QueryBuilder protected () extends StObject {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    def this(base64Encoder: Encoder, utf8Decoder: Decoder, protocol: String) = this()
    
    /* private */ val base64Encoder: js.Any = js.native
    
    def build(
      hasOperationInput: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ js.Any
    ): String = js.native
    
    /* private */ var capitalizeFirstChar: js.Any = js.native
    
    /* private */ val isEC2Query: js.Any = js.native
    
    /* private */ var serialize: js.Any = js.native
    
    /* private */ var serializeBlob: js.Any = js.native
    
    /* private */ var serializeList: js.Any = js.native
    
    /* private */ var serializeMap: js.Any = js.native
    
    /* private */ var serializeMapEntry: js.Any = js.native
    
    /* private */ var serializeStructure: js.Any = js.native
    
    /* private */ var serializeTimestamp: js.Any = js.native
    
    /* private */ val utf8Decoder: js.Any = js.native
  }
}
