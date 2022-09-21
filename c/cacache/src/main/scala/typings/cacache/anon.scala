package typings.cacache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: String
    
    var digest: String
    
    var options: js.Array[Any]
    
    var source: String
  }
  object Algorithm {
    
    inline def apply(algorithm: String, digest: String, options: js.Array[Any], source: String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined cacache.cacache.CacheObject & {  size :number} */
  trait CacheObjectsizenumber extends StObject {
    
    /** Subresource Integrity hash for the content this entry refers to. */
    var integrity: String
    
    /** Key the entry was looked up under. Matches the key argument. */
    var key: String
    
    /** User-assigned metadata associated with the entry/content. */
    var metadata: js.UndefOr[Any] = js.undefined
    
    /** Filesystem path where content is stored, joined with cache argument. */
    var path: String
    
    var size: Double
    
    /** Timestamp the entry was first added on. */
    var time: Double
  }
  object CacheObjectsizenumber {
    
    inline def apply(integrity: String, key: String, path: String, size: Double, time: Double): CacheObjectsizenumber = {
      val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheObjectsizenumber]
    }
    
    extension [Self <: CacheObjectsizenumber](x: Self) {
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
