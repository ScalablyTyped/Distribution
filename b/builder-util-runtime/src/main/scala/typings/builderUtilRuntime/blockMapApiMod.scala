package typings.builderUtilRuntime

import typings.builderUtilRuntime.builderUtilRuntimeStrings.`1`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMapApiMod {
  
  trait BlockMap extends StObject {
    
    var files: js.Array[BlockMapFile]
    
    var version: `1` | `2`
  }
  object BlockMap {
    
    inline def apply(files: js.Array[BlockMapFile], version: `1` | `2`): BlockMap = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMap]
    }
    
    extension [Self <: BlockMap](x: Self) {
      
      inline def setFiles(value: js.Array[BlockMapFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: BlockMapFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setVersion(value: `1` | `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlockMapFile
    extends StObject
       with FileChunks {
    
    var name: String
    
    var offset: Double
  }
  object BlockMapFile {
    
    inline def apply(checksums: js.Array[String], name: String, offset: Double, sizes: js.Array[Double]): BlockMapFile = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMapFile]
    }
    
    extension [Self <: BlockMapFile](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileChunks extends StObject {
    
    var checksums: js.Array[String]
    
    var sizes: js.Array[Double]
  }
  object FileChunks {
    
    inline def apply(checksums: js.Array[String], sizes: js.Array[Double]): FileChunks = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChunks]
    }
    
    extension [Self <: FileChunks](x: Self) {
      
      inline def setChecksums(value: js.Array[String]): Self = StObject.set(x, "checksums", value.asInstanceOf[js.Any])
      
      inline def setChecksumsVarargs(value: String*): Self = StObject.set(x, "checksums", js.Array(value :_*))
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
}
