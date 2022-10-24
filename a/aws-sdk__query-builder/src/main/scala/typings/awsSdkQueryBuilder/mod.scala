package typings.awsSdkQueryBuilder

import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer * / any */ @JSImport("@aws-sdk/query-builder", "QueryBuilder")
  @js.native
  open class QueryBuilder protected () extends StObject {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    def this(base64Encoder: Encoder, utf8Decoder: Decoder, protocol: String) = this()
    
    /* private */ val base64Encoder: Any = js.native
    
    def build(
      param0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ Any
    ): String = js.native
    
    /* private */ var capitalizeFirstChar: Any = js.native
    
    /* private */ val isEC2Query: Any = js.native
    
    /* private */ var serialize: Any = js.native
    
    /* private */ var serializeBlob: Any = js.native
    
    /* private */ var serializeList: Any = js.native
    
    /* private */ var serializeMap: Any = js.native
    
    /* private */ var serializeMapEntry: Any = js.native
    
    /* private */ var serializeStructure: Any = js.native
    
    /* private */ var serializeTimestamp: Any = js.native
    
    /* private */ val utf8Decoder: Any = js.native
  }
}
