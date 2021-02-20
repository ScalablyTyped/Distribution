package typings.cacache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Algorithm extends StObject {
    
    var algorithm: String = js.native
    
    var digest: String = js.native
    
    var options: js.Array[_] = js.native
    
    var source: String = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(algorithm: String, digest: String, options: js.Array[_], source: String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined cacache.cacache/en.CacheObject & {  size :number} */
  @js.native
  trait CacheObjectsizenumber extends StObject {
    
    /** Subresource Integrity hash for the content this entry refers to. */
    var integrity: String = js.native
    
    /** Key the entry was looked up under. Matches the key argument. */
    var key: String = js.native
    
    /** User-assigned metadata associated with the entry/content. */
    var metadata: js.UndefOr[js.Any] = js.native
    
    /** Filesystem path where content is stored, joined with cache argument. */
    var path: String = js.native
    
    var size: Double = js.native
    
    /** Timestamp the entry was first added on. */
    var time: Double = js.native
  }
  object CacheObjectsizenumber {
    
    @scala.inline
    def apply(integrity: String, key: String, path: String, size: Double, time: Double): CacheObjectsizenumber = {
      val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheObjectsizenumber]
    }
    
    @scala.inline
    implicit class CacheObjectsizenumberMutableBuilder[Self <: CacheObjectsizenumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
