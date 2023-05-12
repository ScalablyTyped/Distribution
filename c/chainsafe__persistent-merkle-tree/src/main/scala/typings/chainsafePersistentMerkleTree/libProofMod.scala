package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libNodeMod.Node
import typings.chainsafePersistentMerkleTree.libProofMod.ProofType.compactMulti
import typings.chainsafePersistentMerkleTree.libProofMod.ProofType.multi
import typings.chainsafePersistentMerkleTree.libProofMod.ProofType.single
import typings.chainsafePersistentMerkleTree.libProofMod.ProofType.treeOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProofMod {
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ProofType extends StObject
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof", "ProofType")
  @js.native
  object ProofType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProofType & String] = js.native
    
    @js.native
    sealed trait compactMulti
      extends StObject
         with ProofType
    /* "compactMulti" */ val compactMulti: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.compactMulti & String = js.native
    
    @js.native
    sealed trait multi
      extends StObject
         with ProofType
    /* "multi" */ val multi: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.multi & String = js.native
    
    @js.native
    sealed trait single
      extends StObject
         with ProofType
    /* "single" */ val single: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.single & String = js.native
    
    @js.native
    sealed trait treeOffset
      extends StObject
         with ProofType
    /* "treeOffset" */ val treeOffset: typings.chainsafePersistentMerkleTree.libProofMod.ProofType.treeOffset & String = js.native
  }
  
  @JSImport("@chainsafe/persistent-merkle-tree/lib/proof", "ProofTypeSerialized")
  @js.native
  val ProofTypeSerialized: js.Array[ProofType] = js.native
  
  inline def computeDescriptor(indices: js.Array[Gindex]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDescriptor")(indices.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createNodeFromProof(proof: Proof): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def createProof(rootNode: Node, input: ProofInput): Proof = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(rootNode.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Proof]
  
  inline def descriptorToBitlist(descriptor: js.typedarray.Uint8Array): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptorToBitlist")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
  
  inline def deserializeProof(data: js.typedarray.Uint8Array): Proof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProof")(data.asInstanceOf[js.Any]).asInstanceOf[Proof]
  
  inline def serializeProof(proof: Proof): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProof")(proof.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  trait CompactMultiProof
    extends StObject
       with Proof {
    
    var descriptor: js.typedarray.Uint8Array
    
    var leaves: js.Array[js.typedarray.Uint8Array]
    
    var `type`: compactMulti
  }
  object CompactMultiProof {
    
    inline def apply(
      descriptor: js.typedarray.Uint8Array,
      leaves: js.Array[js.typedarray.Uint8Array],
      `type`: compactMulti
    ): CompactMultiProof = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactMultiProof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompactMultiProof] (val x: Self) extends AnyVal {
      
      inline def setDescriptor(value: js.typedarray.Uint8Array): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setLeaves(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      inline def setLeavesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "leaves", js.Array(value*))
      
      inline def setType(value: compactMulti): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompactMultiProofInput
    extends StObject
       with ProofInput {
    
    var descriptor: js.typedarray.Uint8Array
    
    var `type`: compactMulti
  }
  object CompactMultiProofInput {
    
    inline def apply(descriptor: js.typedarray.Uint8Array, `type`: compactMulti): CompactMultiProofInput = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactMultiProofInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompactMultiProofInput] (val x: Self) extends AnyVal {
      
      inline def setDescriptor(value: js.typedarray.Uint8Array): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setType(value: compactMulti): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiProof
    extends StObject
       with Proof {
    
    var gindices: js.Array[Gindex]
    
    var leaves: js.Array[js.typedarray.Uint8Array]
    
    var `type`: multi
    
    var witnesses: js.Array[js.typedarray.Uint8Array]
  }
  object MultiProof {
    
    inline def apply(
      gindices: js.Array[Gindex],
      leaves: js.Array[js.typedarray.Uint8Array],
      `type`: multi,
      witnesses: js.Array[js.typedarray.Uint8Array]
    ): MultiProof = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], witnesses = witnesses.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiProof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiProof] (val x: Self) extends AnyVal {
      
      inline def setGindices(value: js.Array[Gindex]): Self = StObject.set(x, "gindices", value.asInstanceOf[js.Any])
      
      inline def setGindicesVarargs(value: Gindex*): Self = StObject.set(x, "gindices", js.Array(value*))
      
      inline def setLeaves(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      inline def setLeavesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "leaves", js.Array(value*))
      
      inline def setType(value: multi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWitnesses(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "witnesses", value.asInstanceOf[js.Any])
      
      inline def setWitnessesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "witnesses", js.Array(value*))
    }
  }
  
  trait MultiProofInput
    extends StObject
       with ProofInput {
    
    var gindices: js.Array[Gindex]
    
    var `type`: multi
  }
  object MultiProofInput {
    
    inline def apply(gindices: js.Array[Gindex], `type`: multi): MultiProofInput = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiProofInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiProofInput] (val x: Self) extends AnyVal {
      
      inline def setGindices(value: js.Array[Gindex]): Self = StObject.set(x, "gindices", value.asInstanceOf[js.Any])
      
      inline def setGindicesVarargs(value: Gindex*): Self = StObject.set(x, "gindices", js.Array(value*))
      
      inline def setType(value: multi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chainsafePersistentMerkleTree.libProofMod.SingleProof
    - typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProof
    - typings.chainsafePersistentMerkleTree.libProofMod.MultiProof
    - typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProof
  */
  trait Proof extends StObject
  object Proof {
    
    inline def CompactMultiProof(
      descriptor: js.typedarray.Uint8Array,
      leaves: js.Array[js.typedarray.Uint8Array],
      `type`: compactMulti
    ): typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProof = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProof]
    }
    
    inline def MultiProof(
      gindices: js.Array[Gindex],
      leaves: js.Array[js.typedarray.Uint8Array],
      `type`: multi,
      witnesses: js.Array[js.typedarray.Uint8Array]
    ): typings.chainsafePersistentMerkleTree.libProofMod.MultiProof = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], witnesses = witnesses.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.MultiProof]
    }
    
    inline def SingleProof(
      gindex: Gindex,
      leaf: js.typedarray.Uint8Array,
      `type`: single,
      witnesses: js.Array[js.typedarray.Uint8Array]
    ): typings.chainsafePersistentMerkleTree.libProofMod.SingleProof = {
      val __obj = js.Dynamic.literal(gindex = gindex.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], witnesses = witnesses.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.SingleProof]
    }
    
    inline def TreeOffsetProof(leaves: js.Array[js.typedarray.Uint8Array], offsets: js.Array[Double], `type`: treeOffset): typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProof = {
      val __obj = js.Dynamic.literal(leaves = leaves.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProof]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chainsafePersistentMerkleTree.libProofMod.SingleProofInput
    - typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProofInput
    - typings.chainsafePersistentMerkleTree.libProofMod.MultiProofInput
    - typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProofInput
  */
  trait ProofInput extends StObject
  object ProofInput {
    
    inline def CompactMultiProofInput(descriptor: js.typedarray.Uint8Array, `type`: compactMulti): typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProofInput = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.CompactMultiProofInput]
    }
    
    inline def MultiProofInput(gindices: js.Array[Gindex], `type`: multi): typings.chainsafePersistentMerkleTree.libProofMod.MultiProofInput = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.MultiProofInput]
    }
    
    inline def SingleProofInput(gindex: Gindex, `type`: single): typings.chainsafePersistentMerkleTree.libProofMod.SingleProofInput = {
      val __obj = js.Dynamic.literal(gindex = gindex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.SingleProofInput]
    }
    
    inline def TreeOffsetProofInput(gindices: js.Array[Gindex], `type`: treeOffset): typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProofInput = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chainsafePersistentMerkleTree.libProofMod.TreeOffsetProofInput]
    }
  }
  
  trait SingleProof
    extends StObject
       with Proof {
    
    var gindex: Gindex
    
    var leaf: js.typedarray.Uint8Array
    
    var `type`: single
    
    var witnesses: js.Array[js.typedarray.Uint8Array]
  }
  object SingleProof {
    
    inline def apply(
      gindex: Gindex,
      leaf: js.typedarray.Uint8Array,
      `type`: single,
      witnesses: js.Array[js.typedarray.Uint8Array]
    ): SingleProof = {
      val __obj = js.Dynamic.literal(gindex = gindex.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], witnesses = witnesses.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleProof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleProof] (val x: Self) extends AnyVal {
      
      inline def setGindex(value: Gindex): Self = StObject.set(x, "gindex", value.asInstanceOf[js.Any])
      
      inline def setLeaf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      inline def setType(value: single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWitnesses(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "witnesses", value.asInstanceOf[js.Any])
      
      inline def setWitnessesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "witnesses", js.Array(value*))
    }
  }
  
  trait SingleProofInput
    extends StObject
       with ProofInput {
    
    var gindex: Gindex
    
    var `type`: single
  }
  object SingleProofInput {
    
    inline def apply(gindex: Gindex, `type`: single): SingleProofInput = {
      val __obj = js.Dynamic.literal(gindex = gindex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleProofInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleProofInput] (val x: Self) extends AnyVal {
      
      inline def setGindex(value: Gindex): Self = StObject.set(x, "gindex", value.asInstanceOf[js.Any])
      
      inline def setType(value: single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeOffsetProof
    extends StObject
       with Proof {
    
    var leaves: js.Array[js.typedarray.Uint8Array]
    
    var offsets: js.Array[Double]
    
    var `type`: treeOffset
  }
  object TreeOffsetProof {
    
    inline def apply(leaves: js.Array[js.typedarray.Uint8Array], offsets: js.Array[Double], `type`: treeOffset): TreeOffsetProof = {
      val __obj = js.Dynamic.literal(leaves = leaves.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeOffsetProof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeOffsetProof] (val x: Self) extends AnyVal {
      
      inline def setLeaves(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
      
      inline def setLeavesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "leaves", js.Array(value*))
      
      inline def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value*))
      
      inline def setType(value: treeOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeOffsetProofInput
    extends StObject
       with ProofInput {
    
    var gindices: js.Array[Gindex]
    
    var `type`: treeOffset
  }
  object TreeOffsetProofInput {
    
    inline def apply(gindices: js.Array[Gindex], `type`: treeOffset): TreeOffsetProofInput = {
      val __obj = js.Dynamic.literal(gindices = gindices.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeOffsetProofInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeOffsetProofInput] (val x: Self) extends AnyVal {
      
      inline def setGindices(value: js.Array[Gindex]): Self = StObject.set(x, "gindices", value.asInstanceOf[js.Any])
      
      inline def setGindicesVarargs(value: Gindex*): Self = StObject.set(x, "gindices", js.Array(value*))
      
      inline def setType(value: treeOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
