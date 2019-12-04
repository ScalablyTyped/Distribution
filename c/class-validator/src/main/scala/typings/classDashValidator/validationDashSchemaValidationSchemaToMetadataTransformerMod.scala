package typings.classDashValidator

import typings.classDashValidator.metadataValidationMetadataMod.ValidationMetadata
import typings.classDashValidator.validationDashSchemaValidationSchemaMod.ValidationSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation-schema/ValidationSchemaToMetadataTransformer", JSImport.Namespace)
@js.native
object validationDashSchemaValidationSchemaToMetadataTransformerMod extends js.Object {
  @js.native
  class ValidationSchemaToMetadataTransformer () extends js.Object {
    def transform(schema: ValidationSchema): js.Array[ValidationMetadata] = js.native
  }
  
}

