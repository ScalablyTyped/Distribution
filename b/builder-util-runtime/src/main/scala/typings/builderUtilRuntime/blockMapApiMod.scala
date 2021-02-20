package typings.builderUtilRuntime

import typings.builderUtilRuntime.builderUtilRuntimeStrings.`1`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMapApiMod {
  
  @js.native
  trait BlockMap extends StObject {
    
    var files: js.Array[BlockMapFile] = js.native
    
    var version: `1` | `2` = js.native
  }
  object BlockMap {
    
    @scala.inline
    def apply(files: js.Array[BlockMapFile], version: `1` | `2`): BlockMap = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMap]
    }
    
    @scala.inline
    implicit class BlockMapMutableBuilder[Self <: BlockMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[BlockMapFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: BlockMapFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: `1` | `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BlockMapFile extends FileChunks {
    
    var name: String = js.native
    
    var offset: Double = js.native
  }
  object BlockMapFile {
    
    @scala.inline
    def apply(checksums: js.Array[String], name: String, offset: Double, sizes: js.Array[Double]): BlockMapFile = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMapFile]
    }
    
    @scala.inline
    implicit class BlockMapFileMutableBuilder[Self <: BlockMapFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileChunks extends StObject {
    
    var checksums: js.Array[String] = js.native
    
    var sizes: js.Array[Double] = js.native
  }
  object FileChunks {
    
    @scala.inline
    def apply(checksums: js.Array[String], sizes: js.Array[Double]): FileChunks = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChunks]
    }
    
    @scala.inline
    implicit class FileChunksMutableBuilder[Self <: FileChunks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecksums(value: js.Array[String]): Self = StObject.set(x, "checksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksumsVarargs(value: String*): Self = StObject.set(x, "checksums", js.Array(value :_*))
      
      @scala.inline
      def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
}
