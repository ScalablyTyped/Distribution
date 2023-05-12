package typings.chainsafePersistentMerkleTree

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGindexMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/gindex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bitIndexBigInt(v: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitIndexBigInt")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def concatGindices(gindices: js.Array[Gindex]): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("concatGindices")(gindices.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def convertGindexToBitstring(gindex: Gindex): GindexBitstring = ^.asInstanceOf[js.Dynamic].applyDynamic("convertGindexToBitstring")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexBitstring]
  inline def convertGindexToBitstring(gindex: GindexBitstring): GindexBitstring = ^.asInstanceOf[js.Dynamic].applyDynamic("convertGindexToBitstring")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexBitstring]
  
  inline def countToDepth(count: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countToDepth")(count.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getGindexBits(gindex: Gindex): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGindexBits")(gindex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  inline def getGindexBits(gindex: GindexBitstring): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGindexBits")(gindex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  
  inline def getGindicesAtDepth(depth: Double, startIndex: Double, count: Double): js.Array[Gindex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGindicesAtDepth")(depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Gindex]]
  
  inline def gindexChild(gindex: Gindex, rightChild: Boolean): Gindex = (^.asInstanceOf[js.Dynamic].applyDynamic("gindexChild")(gindex.asInstanceOf[js.Any], rightChild.asInstanceOf[js.Any])).asInstanceOf[Gindex]
  
  inline def gindexIterator(gindex: Gindex): GindexIterator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexIterator")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexIterator_]
  inline def gindexIterator(gindex: GindexBitstring): GindexIterator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexIterator")(gindex.asInstanceOf[js.Any]).asInstanceOf[GindexIterator_]
  
  inline def gindexParent(gindex: Gindex): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexParent")(gindex.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def gindexSibling(gindex: Gindex): Gindex = ^.asInstanceOf[js.Dynamic].applyDynamic("gindexSibling")(gindex.asInstanceOf[js.Any]).asInstanceOf[Gindex]
  
  inline def iterateAtDepth(depth: Double, startIndex: js.BigInt, count: js.BigInt): js.Iterable[Gindex] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateAtDepth")(depth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Gindex]]
  
  inline def toGindex(depth: Double, index: js.BigInt): Gindex = (^.asInstanceOf[js.Dynamic].applyDynamic("toGindex")(depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Gindex]
  
  inline def toGindexBitstring(depth: Double, index: Double): GindexBitstring = (^.asInstanceOf[js.Dynamic].applyDynamic("toGindexBitstring")(depth.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[GindexBitstring]
  
  /* Rewritten from type alias, can be one of: 
    - typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`0`
    - typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`1`
  */
  trait Bit extends StObject
  object Bit {
    
    inline def `0`: typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`0` = 0.asInstanceOf[typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`0`]
    
    inline def `1`: typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`1` = 1.asInstanceOf[typings.chainsafePersistentMerkleTree.chainsafePersistentMerkleTreeInts.`1`]
  }
  
  type Gindex = js.BigInt
  
  type GindexBitstring = String
  
  @js.native
  trait GindexIterator_
    extends StObject
       with Iterable[Bit] {
    
    def remainingBitLength(): Double = js.native
  }
}
