package typings.cKzg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("c-kzg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("c-kzg", "BYTES_PER_BLOB")
  @js.native
  val BYTES_PER_BLOB: Double = js.native
  
  @JSImport("c-kzg", "BYTES_PER_COMMITMENT")
  @js.native
  val BYTES_PER_COMMITMENT: Double = js.native
  
  @JSImport("c-kzg", "BYTES_PER_FIELD_ELEMENT")
  @js.native
  val BYTES_PER_FIELD_ELEMENT: Double = js.native
  
  @JSImport("c-kzg", "BYTES_PER_PROOF")
  @js.native
  val BYTES_PER_PROOF: Double = js.native
  
  @JSImport("c-kzg", "FIELD_ELEMENTS_PER_BLOB")
  @js.native
  val FIELD_ELEMENTS_PER_BLOB: Double = js.native
  
  inline def blobToKzgCommitment(blob: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("blobToKzgCommitment")(blob.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def computeBlobKzgProof(blob: js.typedarray.Uint8Array, commitmentBytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBlobKzgProof")(blob.asInstanceOf[js.Any], commitmentBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def computeKzgProof(blob: js.typedarray.Uint8Array, zBytes: js.typedarray.Uint8Array): ProofResult = (^.asInstanceOf[js.Dynamic].applyDynamic("computeKzgProof")(blob.asInstanceOf[js.Any], zBytes.asInstanceOf[js.Any])).asInstanceOf[ProofResult]
  
  inline def loadTrustedSetup(filePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTrustedSetup")(filePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def verifyBlobKzgProof(
    blob: js.typedarray.Uint8Array,
    commitment: js.typedarray.Uint8Array,
    proof: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlobKzgProof")(blob.asInstanceOf[js.Any], commitment.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def verifyBlobKzgProofBatch(
    blobs: js.Array[js.typedarray.Uint8Array],
    commitments: js.Array[js.typedarray.Uint8Array],
    proofs: js.Array[js.typedarray.Uint8Array]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlobKzgProofBatch")(blobs.asInstanceOf[js.Any], commitments.asInstanceOf[js.Any], proofs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def verifyKzgProof(
    commitment: js.typedarray.Uint8Array,
    zBytes: js.typedarray.Uint8Array,
    yBytes: js.typedarray.Uint8Array,
    proof: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyKzgProof")(commitment.asInstanceOf[js.Any], zBytes.asInstanceOf[js.Any], yBytes.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Blob = js.typedarray.Uint8Array
  
  type Bytes32 = js.typedarray.Uint8Array
  
  type Bytes48 = js.typedarray.Uint8Array
  
  type KZGCommitment = js.typedarray.Uint8Array
  
  type KZGProof = js.typedarray.Uint8Array
  
  type ProofResult = js.Tuple2[js.typedarray.Uint8Array, js.typedarray.Uint8Array]
  
  trait TrustedSetupJson extends StObject {
    
    var roots_of_unity: js.Array[String]
    
    var setup_G1: js.Array[String]
    
    var setup_G1_lagrange: js.Array[String]
    
    var setup_G2: js.Array[String]
  }
  object TrustedSetupJson {
    
    inline def apply(
      roots_of_unity: js.Array[String],
      setup_G1: js.Array[String],
      setup_G1_lagrange: js.Array[String],
      setup_G2: js.Array[String]
    ): TrustedSetupJson = {
      val __obj = js.Dynamic.literal(roots_of_unity = roots_of_unity.asInstanceOf[js.Any], setup_G1 = setup_G1.asInstanceOf[js.Any], setup_G1_lagrange = setup_G1_lagrange.asInstanceOf[js.Any], setup_G2 = setup_G2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustedSetupJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrustedSetupJson] (val x: Self) extends AnyVal {
      
      inline def setRoots_of_unity(value: js.Array[String]): Self = StObject.set(x, "roots_of_unity", value.asInstanceOf[js.Any])
      
      inline def setRoots_of_unityVarargs(value: String*): Self = StObject.set(x, "roots_of_unity", js.Array(value*))
      
      inline def setSetup_G1(value: js.Array[String]): Self = StObject.set(x, "setup_G1", value.asInstanceOf[js.Any])
      
      inline def setSetup_G1Varargs(value: String*): Self = StObject.set(x, "setup_G1", js.Array(value*))
      
      inline def setSetup_G1_lagrange(value: js.Array[String]): Self = StObject.set(x, "setup_G1_lagrange", value.asInstanceOf[js.Any])
      
      inline def setSetup_G1_lagrangeVarargs(value: String*): Self = StObject.set(x, "setup_G1_lagrange", js.Array(value*))
      
      inline def setSetup_G2(value: js.Array[String]): Self = StObject.set(x, "setup_G2", value.asInstanceOf[js.Any])
      
      inline def setSetup_G2Varargs(value: String*): Self = StObject.set(x, "setup_G2", js.Array(value*))
    }
  }
}
