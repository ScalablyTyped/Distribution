package typings.awsSdk

import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesGlacierMod {
  
  @JSImport("aws-sdk/lib/services/glacier", "GlacierCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class GlacierCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
    
    def computeChecksums(data: String): GlacierComputeChecksumsOutput = js.native
    /**
      * Computes the SHA-256 linear and tree hash checksums for a given
      * block of Buffer data. Pass the tree hash of the computed checksums
      * as the checksum input to the {completeMultipartUpload} when performing
      * a multi-part upload.
      */
    def computeChecksums(data: Buffer): GlacierComputeChecksumsOutput = js.native
  }
  
  trait GlacierComputeChecksumsOutput extends StObject {
    
    var linearHash: String
    
    var treeHash: String
  }
  object GlacierComputeChecksumsOutput {
    
    inline def apply(linearHash: String, treeHash: String): GlacierComputeChecksumsOutput = {
      val __obj = js.Dynamic.literal(linearHash = linearHash.asInstanceOf[js.Any], treeHash = treeHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlacierComputeChecksumsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlacierComputeChecksumsOutput] (val x: Self) extends AnyVal {
      
      inline def setLinearHash(value: String): Self = StObject.set(x, "linearHash", value.asInstanceOf[js.Any])
      
      inline def setTreeHash(value: String): Self = StObject.set(x, "treeHash", value.asInstanceOf[js.Any])
    }
  }
}
