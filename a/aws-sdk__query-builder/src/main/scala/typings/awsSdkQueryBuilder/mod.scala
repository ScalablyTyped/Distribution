package typings.awsSdkQueryBuilder

import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/query-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer * / any */ @js.native
  class QueryBuilder protected () extends js.Object {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    def this(base64Encoder: Encoder, utf8Decoder: Decoder, protocol: String) = this()
    
    val base64Encoder: js.Any = js.native
    
    def build(
      hasOperationInput: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ js.Any
    ): String = js.native
    
    var capitalizeFirstChar: js.Any = js.native
    
    val isEC2Query: js.Any = js.native
    
    var serialize: js.Any = js.native
    
    var serializeBlob: js.Any = js.native
    
    var serializeList: js.Any = js.native
    
    var serializeMap: js.Any = js.native
    
    var serializeMapEntry: js.Any = js.native
    
    var serializeStructure: js.Any = js.native
    
    var serializeTimestamp: js.Any = js.native
    
    val utf8Decoder: js.Any = js.native
  }
}
