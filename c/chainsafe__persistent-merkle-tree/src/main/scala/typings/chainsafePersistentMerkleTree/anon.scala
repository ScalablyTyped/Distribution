package typings.chainsafePersistentMerkleTree

import typings.chainsafePersistentMerkleTree.libGindexMod.Gindex
import typings.chainsafePersistentMerkleTree.libGindexMod.GindexBitstring
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BitIndex extends StObject {
    
    var bitIndex: Double
    
    var leafIndex: Double
  }
  object BitIndex {
    
    inline def apply(bitIndex: Double, leafIndex: Double): BitIndex = {
      val __obj = js.Dynamic.literal(bitIndex = bitIndex.asInstanceOf[js.Any], leafIndex = leafIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitIndex] (val x: Self) extends AnyVal {
      
      inline def setBitIndex(value: Double): Self = StObject.set(x, "bitIndex", value.asInstanceOf[js.Any])
      
      inline def setLeafIndex(value: Double): Self = StObject.set(x, "leafIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Branch extends StObject {
    
    var branch: Set[Gindex]
    
    var path: Set[Gindex]
  }
  object Branch {
    
    inline def apply(branch: Set[Gindex], path: Set[Gindex]): Branch = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: Set[Gindex]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Set[Gindex]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var branch: Set[GindexBitstring]
    
    var path: Set[GindexBitstring]
  }
  object Path {
    
    inline def apply(branch: Set[GindexBitstring], path: Set[GindexBitstring]): Path = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: Set[GindexBitstring]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Set[GindexBitstring]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
