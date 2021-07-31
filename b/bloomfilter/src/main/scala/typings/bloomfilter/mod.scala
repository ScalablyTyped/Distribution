package typings.bloomfilter

import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bloomfilter", "BloomFilter")
  @js.native
  class BloomFilter protected () extends StObject {
    def this(m: js.Array[Double], k: Double) = this()
    /**
      * Create a new empty bloom filter of size m with hashes k or
      * provide buckets as a number[] or Int32Array to deserialize a bloom filter
      * @param mOrBucketsArray number of bits (will be rounded up to nearest 32), or buckets
      * to deserialize into a filled bloomfilter
      * @param k number of hashes
      */
    def this(m: Double, k: Double) = this()
    def this(m: Int32Array, k: Double) = this()
    
    /**
      * Add a value to a bloom filter
      * @param value
      */
    def add(value: js.Any): Unit = js.native
    
    var buckets: Int32Array = js.native
    
    /**
      * Test whether a value exists in a bloom filter. (False positives are
      * possible, false negatives are not.)
      */
    def test(value: js.Any): Boolean = js.native
  }
}
