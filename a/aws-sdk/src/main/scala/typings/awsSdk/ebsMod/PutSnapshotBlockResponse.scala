package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSnapshotBlockResponse extends StObject {
  
  /**
    * The SHA256 checksum generated for the block data by Amazon EBS.
    */
  var Checksum: js.UndefOr[typings.awsSdk.ebsMod.Checksum] = js.native
  
  /**
    * The algorithm used by Amazon EBS to generate the checksum.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAlgorithm] = js.native
}
object PutSnapshotBlockResponse {
  
  @scala.inline
  def apply(): PutSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSnapshotBlockResponse]
  }
  
  @scala.inline
  implicit class PutSnapshotBlockResponseMutableBuilder[Self <: PutSnapshotBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
  }
}
