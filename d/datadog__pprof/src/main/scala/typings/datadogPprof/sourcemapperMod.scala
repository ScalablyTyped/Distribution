package typings.datadogPprof

import typings.sourceMap.mod.RawSourceMap
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcemapperMod {
  
  @JSImport("@datadog/pprof/out/src/sourcemapper/sourcemapper", "SourceMapper")
  @js.native
  /**
    * @param {Array.<string>} sourceMapPaths An array of paths to .map source map
    *  files that should be processed.  The paths should be relative to the
    *  current process's current working directory
    * @param {Logger} logger A logger that reports errors that occurred while
    *  processing the given source map files
    * @constructor
    */
  open class SourceMapper () extends StObject {
    
    /**
      * Used to get the information about the transpiled file from a given input
      * source file provided there isn't any ambiguity with associating the input
      * path to exactly one output transpiled file.
      *
      * @param inputPath The (possibly relative) path to the original source file.
      * @return The `MapInfoCompiled` object that describes the transpiled file
      *  associated with the specified input path.  `null` is returned if either
      *  zero files are associated with the input path or if more than one file
      *  could possibly be associated with the given input path.
      */
    /* private */ var getMappingInfo: Any = js.native
    
    /**
      * Used to determine if the source file specified by the given path has
      * a .map file and an output file associated with it.
      *
      * If there is no such mapping, it could be because the input file is not
      * the input to a transpilation process or it is the input to a transpilation
      * process but its corresponding .map file was not given to the constructor
      * of this mapper.
      *
      * @param {string} inputPath The path to an input file that could
      *  possibly be the input to a transpilation process.  The path should be
      *  relative to the process's current working directory.
      */
    def hasMappingInfo(inputPath: String): Boolean = js.native
    
    var infoMap: Map[String, MapInfoCompiled] = js.native
    
    /**
      * @param {string} inputPath The path to an input file that could possibly
      *  be the input to a transpilation process.  The path should be relative to
      *  the process's current working directory
      * @param {number} The line number in the input file where the line number is
      *   zero-based.
      * @param {number} (Optional) The column number in the line of the file
      *   specified where the column number is zero-based.
      * @return {Object} The object returned has a "file" attribute for the
      *   path of the output file associated with the given input file (where the
      *   path is relative to the process's current working directory),
      *   a "line" attribute of the line number in the output file associated with
      *   the given line number for the input file, and an optional "column" number
      *   of the column number of the output file associated with the given file
      *   and line information.
      *
      *   If the given input file does not have mapping information associated
      *   with it then the input location is returned.
      */
    def mappingInfo(location: GeneratedLocation): SourceLocation = js.native
  }
  /* static members */
  object SourceMapper {
    
    @JSImport("@datadog/pprof/out/src/sourcemapper/sourcemapper", "SourceMapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(searchDirs: js.Array[String]): js.Promise[SourceMapper] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(searchDirs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SourceMapper]]
  }
  
  trait GeneratedLocation extends StObject {
    
    var column: Double
    
    var file: String
    
    var line: Double
    
    var name: js.UndefOr[String] = js.undefined
  }
  object GeneratedLocation {
    
    inline def apply(column: Double, file: String, line: Double): GeneratedLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedLocation]
    }
    
    extension [Self <: GeneratedLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait MapInfoCompiled extends StObject {
    
    var mapConsumer: RawSourceMap
    
    var mapFileDir: String
  }
  object MapInfoCompiled {
    
    inline def apply(mapConsumer: RawSourceMap, mapFileDir: String): MapInfoCompiled = {
      val __obj = js.Dynamic.literal(mapConsumer = mapConsumer.asInstanceOf[js.Any], mapFileDir = mapFileDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapInfoCompiled]
    }
    
    extension [Self <: MapInfoCompiled](x: Self) {
      
      inline def setMapConsumer(value: RawSourceMap): Self = StObject.set(x, "mapConsumer", value.asInstanceOf[js.Any])
      
      inline def setMapFileDir(value: String): Self = StObject.set(x, "mapFileDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceLocation extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object SourceLocation {
    
    inline def apply(): SourceLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceLocation]
    }
    
    extension [Self <: SourceLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
