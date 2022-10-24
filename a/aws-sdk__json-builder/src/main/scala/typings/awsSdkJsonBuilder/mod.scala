package typings.awsSdkJsonBuilder

import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer * / any */ @JSImport("@aws-sdk/json-builder", "JsonBuilder")
  @js.native
  open class JsonBuilder protected () extends StObject {
    def this(base64Encoder: Encoder, utf8Decoder: Decoder) = this()
    
    /* private */ val base64Encoder: Any = js.native
    
    def build(
      param0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializerBuildOptions */ Any
    ): String = js.native
    
    /* private */ var format: Any = js.native
    
    /* private */ val utf8Decoder: Any = js.native
  }
}
