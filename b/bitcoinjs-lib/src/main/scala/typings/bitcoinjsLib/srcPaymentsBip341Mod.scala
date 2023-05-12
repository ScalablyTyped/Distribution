package typings.bitcoinjsLib

import typings.bitcoinjsLib.srcTypesMod.Tapleaf
import typings.bitcoinjsLib.srcTypesMod.Taptree
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPaymentsBip341Mod {
  
  @JSImport("bitcoinjs-lib/src/payments/bip341", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcoinjs-lib/src/payments/bip341", "LEAF_VERSION_TAPSCRIPT")
  @js.native
  val LEAF_VERSION_TAPSCRIPT: /* 192 */ Double = js.native
  
  @JSImport("bitcoinjs-lib/src/payments/bip341", "MAX_TAPTREE_DEPTH")
  @js.native
  val MAX_TAPTREE_DEPTH: /* 128 */ Double = js.native
  
  inline def findScriptPath(node: HashTree, hash: Buffer): js.UndefOr[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findScriptPath")(node.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Buffer]]]
  
  inline def rootHashFromPath(controlBlock: Buffer, leafHash: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("rootHashFromPath")(controlBlock.asInstanceOf[js.Any], leafHash.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def tapTweakHash(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("tapTweakHash")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def tapTweakHash(pubKey: Buffer, h: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("tapTweakHash")(pubKey.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def tapleafHash(leaf: Tapleaf): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("tapleafHash")(leaf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toHashTree(scriptTree: Taptree): HashTree = ^.asInstanceOf[js.Dynamic].applyDynamic("toHashTree")(scriptTree.asInstanceOf[js.Any]).asInstanceOf[HashTree]
  
  inline def tweakKey(pubKey: Buffer): TweakedPublicKey | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tweakKey")(pubKey.asInstanceOf[js.Any]).asInstanceOf[TweakedPublicKey | Null]
  inline def tweakKey(pubKey: Buffer, h: Buffer): TweakedPublicKey | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tweakKey")(pubKey.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[TweakedPublicKey | Null]
  
  trait HashBranch
    extends StObject
       with HashTree {
    
    var hash: Buffer
    
    var left: HashTree
    
    var right: HashTree
  }
  object HashBranch {
    
    inline def apply(hash: Buffer, left: HashTree, right: HashTree): HashBranch = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashBranch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashBranch] (val x: Self) extends AnyVal {
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: HashTree): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: HashTree): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashLeaf
    extends StObject
       with HashTree {
    
    var hash: Buffer
  }
  object HashLeaf {
    
    inline def apply(hash: Buffer): HashLeaf = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashLeaf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashLeaf] (val x: Self) extends AnyVal {
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bitcoinjsLib.srcPaymentsBip341Mod.HashLeaf
    - typings.bitcoinjsLib.srcPaymentsBip341Mod.HashBranch
  */
  trait HashTree extends StObject
  object HashTree {
    
    inline def HashBranch(hash: Buffer, left: HashTree, right: HashTree): typings.bitcoinjsLib.srcPaymentsBip341Mod.HashBranch = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bitcoinjsLib.srcPaymentsBip341Mod.HashBranch]
    }
    
    inline def HashLeaf(hash: Buffer): typings.bitcoinjsLib.srcPaymentsBip341Mod.HashLeaf = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bitcoinjsLib.srcPaymentsBip341Mod.HashLeaf]
    }
  }
  
  trait TweakedPublicKey extends StObject {
    
    var parity: Double
    
    var x: Buffer
  }
  object TweakedPublicKey {
    
    inline def apply(parity: Double, x: Buffer): TweakedPublicKey = {
      val __obj = js.Dynamic.literal(parity = parity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweakedPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TweakedPublicKey] (val x: Self) extends AnyVal {
      
      inline def setParity(value: Double): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setX(value: Buffer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
