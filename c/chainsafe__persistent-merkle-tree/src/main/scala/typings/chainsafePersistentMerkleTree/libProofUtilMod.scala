package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.anon.Branch
import typings.chainsafePersistentMerkleTree.anon.Path
import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexBitstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofUtilMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof/util", "SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SortOrder & Double] = js.native
    
    @js.native
    sealed trait Decreasing
      extends StObject
         with SortOrder
    /* 1 */ val Decreasing: typings.chainsafePersistentMerkleTree.libProofUtilMod.SortOrder.Decreasing & Double = js.native
    
    @js.native
    sealed trait InOrder
      extends StObject
         with SortOrder
    /* 0 */ val InOrder: typings.chainsafePersistentMerkleTree.libProofUtilMod.SortOrder.InOrder & Double = js.native
    
    @js.native
    sealed trait Unsorted
      extends StObject
         with SortOrder
    /* 2 */ val Unsorted: typings.chainsafePersistentMerkleTree.libProofUtilMod.SortOrder.Unsorted & Double = js.native
  }
  
  inline def computeMultiProofBitstrings(gindices: js.Array[GindexBitstring]): js.Array[GindexBitstring] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMultiProofBitstrings")(gindices.asInstanceOf[js.Any]).asInstanceOf[js.Array[GindexBitstring]]
  inline def computeMultiProofBitstrings(gindices: js.Array[GindexBitstring], includeLeaves: Boolean): js.Array[GindexBitstring] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMultiProofBitstrings")(gindices.asInstanceOf[js.Any], includeLeaves.asInstanceOf[js.Any])).asInstanceOf[js.Array[GindexBitstring]]
  inline def computeMultiProofBitstrings(gindices: js.Array[GindexBitstring], includeLeaves: Boolean, sortOrder: SortOrder): js.Array[GindexBitstring] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMultiProofBitstrings")(gindices.asInstanceOf[js.Any], includeLeaves.asInstanceOf[js.Any], sortOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[GindexBitstring]]
  inline def computeMultiProofBitstrings(gindices: js.Array[GindexBitstring], includeLeaves: Unit, sortOrder: SortOrder): js.Array[GindexBitstring] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMultiProofBitstrings")(gindices.asInstanceOf[js.Any], includeLeaves.asInstanceOf[js.Any], sortOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[GindexBitstring]]
  
  inline def computeProofBitstrings(gindex: GindexBitstring): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("computeProofBitstrings")(gindex.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  inline def computeProofGindices(gindex: Gindex): Branch = ^.asInstanceOf[js.Dynamic].applyDynamic("computeProofGindices")(gindex.asInstanceOf[js.Any]).asInstanceOf[Branch]
  
  inline def filterParentBitstrings(gindices: js.Array[GindexBitstring]): js.Array[GindexBitstring] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterParentBitstrings")(gindices.asInstanceOf[js.Any]).asInstanceOf[js.Array[GindexBitstring]]
  
  inline def sortDecreasingBitstrings(gindices: js.Array[GindexBitstring]): js.Array[GindexBitstring] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortDecreasingBitstrings")(gindices.asInstanceOf[js.Any]).asInstanceOf[js.Array[GindexBitstring]]
  
  inline def sortInOrderBitstrings(gindices: js.Array[GindexBitstring], bitLength: Double): js.Array[GindexBitstring] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortInOrderBitstrings")(gindices.asInstanceOf[js.Any], bitLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[GindexBitstring]]
}
