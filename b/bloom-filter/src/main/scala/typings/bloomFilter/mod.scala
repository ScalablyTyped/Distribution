package typings.bloomFilter

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bloom-filter", JSImport.Namespace)
  @js.native
  class ^ protected () extends Filter {
    def this(options: FilterOptions) = this()
  }
  
  @JSImport("bloom-filter", "MurmurHash3")
  @js.native
  def MurmurHash3(seed: Double, data: Buffer): Double = js.native
  
  /* static member */
  @JSImport("bloom-filter", "create")
  @js.native
  def create(elements: Double, falsePositiveRate: Double): Filter = js.native
  @JSImport("bloom-filter", "create")
  @js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: js.UndefOr[scala.Nothing], nFlags: Double): Filter = js.native
  @JSImport("bloom-filter", "create")
  @js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double): Filter = js.native
  @JSImport("bloom-filter", "create")
  @js.native
  def create(elements: Double, falsePositiveRate: Double, nTweak: Double, nFlags: Double): Filter = js.native
  
  @js.native
  trait Filter extends StObject {
    
    var BLOOM_UPDATE_ALL: Double = js.native
    
    var BLOOM_UPDATE_NONE: Double = js.native
    
    var BLOOM_UPDATE_P2PUBKEY_ONLY: Double = js.native
    
    var LN2: Double = js.native
    
    var LN2SQUARED: Double = js.native
    
    var MAX_BLOOM_FILTER_SIZE: Double = js.native
    
    var MAX_HASH_FUNCS: Double = js.native
    
    var MIN_HASH_FUNCS: Double = js.native
    
    def clear(): Unit = js.native
    
    def contains(data: Buffer): Boolean = js.native
    
    def hash(nHashNum: Double, vDataToHash: Buffer): Double = js.native
    
    def insert(data: Buffer): Unit = js.native
    
    def inspect(): String = js.native
    
    def toObject(): FilterOptions = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(
      BLOOM_UPDATE_ALL: Double,
      BLOOM_UPDATE_NONE: Double,
      BLOOM_UPDATE_P2PUBKEY_ONLY: Double,
      LN2: Double,
      LN2SQUARED: Double,
      MAX_BLOOM_FILTER_SIZE: Double,
      MAX_HASH_FUNCS: Double,
      MIN_HASH_FUNCS: Double,
      clear: () => Unit,
      contains: Buffer => Boolean,
      hash: (Double, Buffer) => Double,
      insert: Buffer => Unit,
      inspect: () => String,
      toObject: () => FilterOptions
    ): Filter = {
      val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL.asInstanceOf[js.Any], BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE.asInstanceOf[js.Any], BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LN2SQUARED = LN2SQUARED.asInstanceOf[js.Any], MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE.asInstanceOf[js.Any], MAX_HASH_FUNCS = MAX_HASH_FUNCS.asInstanceOf[js.Any], MIN_HASH_FUNCS = MIN_HASH_FUNCS.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), hash = js.Any.fromFunction2(hash), insert = js.Any.fromFunction1(insert), inspect = js.Any.fromFunction0(inspect), toObject = js.Any.fromFunction0(toObject))
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBLOOM_UPDATE_ALL(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_ALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLOOM_UPDATE_NONE(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLOOM_UPDATE_P2PUBKEY_ONLY(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_P2PUBKEY_ONLY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContains(value: Buffer => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHash(value: (Double, Buffer) => Double): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsert(value: Buffer => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLN2(value: Double): Self = StObject.set(x, "LN2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLN2SQUARED(value: Double): Self = StObject.set(x, "LN2SQUARED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_BLOOM_FILTER_SIZE(value: Double): Self = StObject.set(x, "MAX_BLOOM_FILTER_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_HASH_FUNCS(value: Double): Self = StObject.set(x, "MAX_HASH_FUNCS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_HASH_FUNCS(value: Double): Self = StObject.set(x, "MIN_HASH_FUNCS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToObject(value: () => FilterOptions): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FilterOptions extends StObject {
    
    var nFlags: js.UndefOr[Double] = js.native
    
    var nHashFuncs: Double = js.native
    
    var nTweak: js.UndefOr[Double] = js.native
    
    var vData: Buffer = js.native
  }
  object FilterOptions {
    
    @scala.inline
    def apply(nHashFuncs: Double, vData: Buffer): FilterOptions = {
      val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptions]
    }
    
    @scala.inline
    implicit class FilterOptionsMutableBuilder[Self <: FilterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNFlags(value: Double): Self = StObject.set(x, "nFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFlagsUndefined: Self = StObject.set(x, "nFlags", js.undefined)
      
      @scala.inline
      def setNHashFuncs(value: Double): Self = StObject.set(x, "nHashFuncs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNTweak(value: Double): Self = StObject.set(x, "nTweak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNTweakUndefined: Self = StObject.set(x, "nTweak", js.undefined)
      
      @scala.inline
      def setVData(value: Buffer): Self = StObject.set(x, "vData", value.asInstanceOf[js.Any])
    }
  }
}
