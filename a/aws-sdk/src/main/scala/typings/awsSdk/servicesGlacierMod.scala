package typings.awsSdk

import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesGlacierMod {
  
  @JSImport("aws-sdk/lib/services/glacier", "GlacierCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class GlacierCustomizations () extends Service {
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
    
    @scala.inline
    def apply(linearHash: String, treeHash: String): GlacierComputeChecksumsOutput = {
      val __obj = js.Dynamic.literal(linearHash = linearHash.asInstanceOf[js.Any], treeHash = treeHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlacierComputeChecksumsOutput]
    }
    
    @scala.inline
    implicit class GlacierComputeChecksumsOutputMutableBuilder[Self <: GlacierComputeChecksumsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinearHash(value: String): Self = StObject.set(x, "linearHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeHash(value: String): Self = StObject.set(x, "treeHash", value.asInstanceOf[js.Any])
    }
  }
}
