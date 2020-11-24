package typings.classTransformer

import typings.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typings.classTransformer.transformationTypeEnumMod.TransformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/metadata/TransformMetadata", JSImport.Namespace)
@js.native
object transformMetadataMod extends js.Object {
  
  @js.native
  class TransformMetadata protected () extends js.Object {
    def this(
      target: js.Function,
      propertyName: String,
      transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _],
      options: TransformOptions
    ) = this()
    
    var options: TransformOptions = js.native
    
    var propertyName: String = js.native
    
    var target: js.Function = js.native
    
    def transformFn(value: js.Any, obj: js.Any, transformationType: TransformationType): js.Any = js.native
  }
}
