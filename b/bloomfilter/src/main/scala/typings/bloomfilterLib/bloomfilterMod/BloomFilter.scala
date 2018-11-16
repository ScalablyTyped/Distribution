package typings
package bloomfilterLib.bloomfilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bloomfilter", "BloomFilter")
@js.native
class BloomFilter protected () extends js.Object {
  /**
       * Create a new empty bloom filter of size m with hashes k or
       * provide buckets as a number[] or Int32Array to deserialize a bloom filter
       * @param mOrBucketsArray number of bits (will be rounded up to nearest 32), or buckets
       * to deserialize into a filled bloomfilter
       * @param k number of hashes
       */
  def this(m: js.Array[scala.Double], k: scala.Double) = this()
  /**
       * Create a new empty bloom filter of size m with hashes k or
       * provide buckets as a number[] or Int32Array to deserialize a bloom filter
       * @param mOrBucketsArray number of bits (will be rounded up to nearest 32), or buckets
       * to deserialize into a filled bloomfilter
       * @param k number of hashes
       */
  def this(m: scala.Double, k: scala.Double) = this()
  /**
       * Create a new empty bloom filter of size m with hashes k or
       * provide buckets as a number[] or Int32Array to deserialize a bloom filter
       * @param mOrBucketsArray number of bits (will be rounded up to nearest 32), or buckets
       * to deserialize into a filled bloomfilter
       * @param k number of hashes
       */
  def this(m: stdLib.Int32Array, k: scala.Double) = this()
  var buckets: stdLib.Int32Array = js.native
  /**
       * Add a value to a bloom filter
       * @param value
       */
  def add(value: js.Any): scala.Unit = js.native
  /**
       * Test whether a value exists in a bloom filter. (False positives are
       * possible, false negatives are not.)
       */
  def test(value: js.Any): scala.Boolean = js.native
}

