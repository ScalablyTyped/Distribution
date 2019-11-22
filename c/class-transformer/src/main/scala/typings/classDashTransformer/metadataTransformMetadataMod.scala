package typings.classDashTransformer

import typings.classDashTransformer.metadataExposeExcludeOptionsMod.TransformOptions
import typings.classDashTransformer.transformOperationExecutorMod.TransformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-transformer/metadata/TransformMetadata", JSImport.Namespace)
@js.native
object metadataTransformMetadataMod extends js.Object {
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

