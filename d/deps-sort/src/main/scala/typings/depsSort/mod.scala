package typings.depsSort

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a new through stream that should get written module-deps objects and will output sorted objects.
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(opts: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("deps-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Input objects are file objects in the module-deps shape. They must at least have these properties:
    */
  trait InputRow extends StObject {
    
    /**
      * dependencies for this file, mapping strings as used in require() to row IDs
      */
    var deps: js.Array[String]
    
    /**
      * a unique identifier for the file
      */
    var id: String
    
    /**
      * the file contents
      */
    var source: String
  }
  object InputRow {
    
    inline def apply(deps: js.Array[String], id: String, source: String): InputRow = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputRow]
    }
    
    extension [Self <: InputRow](x: Self) {
      
      inline def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * module-deps constructor options
    */
  trait Options
    extends StObject
       with /* prop */ StringDictionary[js.Any] {
    
    /**
      * Set 'row.dedupe' for files that match existing contents. Sets 'row.dedupeIndex' when 'index' is enabled.
      * When 'row.dedupe' is set, 'row.sameDeps' will be set to a boolean of whether the dependencies at the dedupe target match (true) or just the source content (false).
      */
    var dedupe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * array of names or object mapping names to true not to mangle with integer indexes when 'index' is turned on.
      * If 'expose' maps names to strings, those strings will be used to resolve the indexed references.
      */
    var expose: js.UndefOr[js.Array[String] | (StringDictionary[Boolean | String])] = js.undefined
    
    /**
      * When true, for each module-deps row, insert 'row.index' with the numeric index and
      * 'row.indexDeps' like 'row.deps' but mapping require strings to row indices
      */
    var index: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
      
      inline def setExpose(value: js.Array[String] | (StringDictionary[Boolean | String])): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      inline def setExposeVarargs(value: String*): Self = StObject.set(x, "expose", js.Array(value :_*))
      
      inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  /**
    * All the input properties, and:
    */
  trait OutputRow extends StObject {
    
    /**
      * when 'opts.dedupe' is true, contains the row ID of a file with identical contents
      */
    var dedupe: String
    
    /**
      * like 'row.dedupe', but contains the 'row.index' instead of 'row.id'
      */
    var dedupeIndex: Double
    
    /**
      * when 'opts.index' is true, the sorted numeric index of the row
      */
    var index: Double
    
    /**
      * like 'row.deps', but mapping to 'row.index' instead of 'row.id'
      */
    var indexDeps: StringDictionary[Double]
  }
  object OutputRow {
    
    inline def apply(dedupe: String, dedupeIndex: Double, index: Double, indexDeps: StringDictionary[Double]): OutputRow = {
      val __obj = js.Dynamic.literal(dedupe = dedupe.asInstanceOf[js.Any], dedupeIndex = dedupeIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexDeps = indexDeps.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputRow]
    }
    
    extension [Self <: OutputRow](x: Self) {
      
      inline def setDedupe(value: String): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeIndex(value: Double): Self = StObject.set(x, "dedupeIndex", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexDeps(value: StringDictionary[Double]): Self = StObject.set(x, "indexDeps", value.asInstanceOf[js.Any])
    }
  }
}
