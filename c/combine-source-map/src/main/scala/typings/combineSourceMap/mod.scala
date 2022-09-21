package typings.combineSourceMap

import typings.combineSourceMap.anon.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("combine-source-map", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Combiner {
    def this(file: String) = this()
    def this(file: String, sourceRoot: String) = this()
    def this(file: Unit, sourceRoot: String) = this()
  }
  @JSImport("combine-source-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a source map combiner that accepts multiple files, offsets them and then combines them into one source map.
    * @param file optional name of the generated file
    * @param sourceRoot optional sourceRoot of the map to be generated
    * @return Combiner instance to which source maps can be added and later combined
    */
  inline def create(): Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Combiner]
  inline def create(file: String): Combiner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any]).asInstanceOf[Combiner]
  inline def create(file: String, sourceRoot: String): Combiner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any])).asInstanceOf[Combiner]
  inline def create(file: Unit, sourceRoot: String): Combiner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any])).asInstanceOf[Combiner]
  
  /**
    * @return src with all sourceMappingUrl comments removed
    */
  inline def removeComments(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeComments")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait Combiner extends StObject {
    
    def _addExistingMap(sourceFile: String, source: String, existingMap: Any): Combiner = js.native
    def _addExistingMap(sourceFile: String, source: String, existingMap: Any, offset: Offset): Combiner = js.native
    
    def _addGeneratedMap(sourceFile: String, source: String): Combiner = js.native
    def _addGeneratedMap(sourceFile: String, source: String, offset: Offset): Combiner = js.native
    
    /**
      * Adds map to underlying source map.
      * If source contains a source map comment that has the source of the original file inlined it will offset these
      * mappings and include them.
      * If no source map comment is found or it has no source inlined, mappings for the file will be generated and included
      * @param opts the 'sourceFile' path/name and the file's 'source' contents
      * @param offset the source file 'line' number and 'column' number offsets
      */
    def addFile(opts: Source): Combiner = js.native
    def addFile(opts: Source, offset: Offset): Combiner = js.native
    
    /**
      * output the combined source map in base64 format
      * @return base64 encoded combined source map
      */
    def base64(): String = js.native
    
    /**
      * generate a base64 encoded sourceMappingURL comment
      * @return base64 encoded sourceMappingUrl comment of the combined source map
      */
    def comment(): String = js.native
  }
  
  /** An offset line and column number */
  trait Offset extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
}
