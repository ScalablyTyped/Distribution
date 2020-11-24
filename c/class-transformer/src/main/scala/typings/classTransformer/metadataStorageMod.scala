package typings.classTransformer

import typings.classTransformer.classTransformerStrings.excludeAll
import typings.classTransformer.classTransformerStrings.exposeAll
import typings.classTransformer.classTransformerStrings.none
import typings.classTransformer.excludeMetadataMod.ExcludeMetadata
import typings.classTransformer.exposeMetadataMod.ExposeMetadata
import typings.classTransformer.transformMetadataMod.TransformMetadata
import typings.classTransformer.transformationTypeEnumMod.TransformationType
import typings.classTransformer.typeMetadataMod.TypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/metadata/MetadataStorage", JSImport.Namespace)
@js.native
object metadataStorageMod extends js.Object {
  
  @js.native
  class MetadataStorage () extends js.Object {
    
    var _ancestorsMap: js.Any = js.native
    
    var _excludeMetadatas: js.Any = js.native
    
    var _exposeMetadatas: js.Any = js.native
    
    var _transformMetadatas: js.Any = js.native
    
    var _typeMetadatas: js.Any = js.native
    
    def addExcludeMetadata(metadata: ExcludeMetadata): Unit = js.native
    
    def addExposeMetadata(metadata: ExposeMetadata): Unit = js.native
    
    def addTransformMetadata(metadata: TransformMetadata): Unit = js.native
    
    def addTypeMetadata(metadata: TypeMetadata): Unit = js.native
    
    def clear(): Unit = js.native
    
    def findExcludeMetadata(target: js.Function, propertyName: String): ExcludeMetadata = js.native
    
    def findExposeMetadata(target: js.Function, propertyName: String): ExposeMetadata = js.native
    
    def findExposeMetadataByCustomName(target: js.Function, name: String): ExposeMetadata = js.native
    
    var findMetadata: js.Any = js.native
    
    var findMetadatas: js.Any = js.native
    
    def findTransformMetadatas(target: js.Function, propertyName: String, transformationType: TransformationType): js.Array[TransformMetadata] = js.native
    
    def findTypeMetadata(target: js.Function, propertyName: String): TypeMetadata = js.native
    
    var getAncestors: js.Any = js.native
    
    def getExcludedMetadatas(target: js.Function): js.Array[ExcludeMetadata] = js.native
    
    def getExcludedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    
    def getExposedMetadatas(target: js.Function): js.Array[ExposeMetadata] = js.native
    
    def getExposedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    
    var getMetadata: js.Any = js.native
    
    def getStrategy(target: js.Function): excludeAll | exposeAll | none = js.native
  }
}
