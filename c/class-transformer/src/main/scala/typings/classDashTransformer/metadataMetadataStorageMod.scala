package typings.classDashTransformer

import typings.classDashTransformer.classDashTransformerStrings.excludeAll
import typings.classDashTransformer.classDashTransformerStrings.exposeAll
import typings.classDashTransformer.classDashTransformerStrings.none
import typings.classDashTransformer.metadataExcludeMetadataMod.ExcludeMetadata
import typings.classDashTransformer.metadataExposeMetadataMod.ExposeMetadata
import typings.classDashTransformer.metadataTransformMetadataMod.TransformMetadata
import typings.classDashTransformer.metadataTypeMetadataMod.TypeMetadata
import typings.classDashTransformer.transformOperationExecutorMod.TransformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-transformer/metadata/MetadataStorage", JSImport.Namespace)
@js.native
object metadataMetadataStorageMod extends js.Object {
  @js.native
  class MetadataStorage () extends js.Object {
    var _ancestorsMap: js.Any = js.native
    var _excludeMetadatas: js.Any = js.native
    var _exposeMetadatas: js.Any = js.native
    var _transformMetadatas: js.Any = js.native
    var _typeMetadatas: js.Any = js.native
    var findMetadata: js.Any = js.native
    var findMetadatas: js.Any = js.native
    var getAncestors: js.Any = js.native
    var getMetadata: js.Any = js.native
    def addExcludeMetadata(metadata: ExcludeMetadata): Unit = js.native
    def addExposeMetadata(metadata: ExposeMetadata): Unit = js.native
    def addTransformMetadata(metadata: TransformMetadata): Unit = js.native
    def addTypeMetadata(metadata: TypeMetadata): Unit = js.native
    def clear(): Unit = js.native
    def findExcludeMetadata(target: js.Function, propertyName: String): ExcludeMetadata = js.native
    def findExposeMetadata(target: js.Function, propertyName: String): ExposeMetadata = js.native
    def findExposeMetadataByCustomName(target: js.Function, name: String): ExposeMetadata = js.native
    def findTransformMetadatas(target: js.Function, propertyName: String, transformationType: TransformationType): js.Array[TransformMetadata] = js.native
    def findTypeMetadata(target: js.Function, propertyName: String): TypeMetadata = js.native
    def getExcludedMetadatas(target: js.Function): js.Array[ExcludeMetadata] = js.native
    def getExcludedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    def getExposedMetadatas(target: js.Function): js.Array[ExposeMetadata] = js.native
    def getExposedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    def getStrategy(target: js.Function): excludeAll | exposeAll | none = js.native
  }
  
}

