package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotBlockResponse extends StObject {
  
  /**
    * The data content of the block.
    */
  var BlockData: js.UndefOr[typings.awsSdk.ebsMod.BlockData] = js.undefined
  
  /**
    * The checksum generated for the block, which is Base64 encoded.
    */
  var Checksum: js.UndefOr[typings.awsSdk.ebsMod.Checksum] = js.undefined
  
  /**
    * The algorithm used to generate the checksum for the block, such as SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAlgorithm] = js.undefined
  
  /**
    * The size of the data in the block.
    */
  var DataLength: js.UndefOr[typings.awsSdk.ebsMod.DataLength] = js.undefined
}
object GetSnapshotBlockResponse {
  
  @scala.inline
  def apply(): GetSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotBlockResponse]
  }
  
  @scala.inline
  implicit class GetSnapshotBlockResponseMutableBuilder[Self <: GetSnapshotBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockData(value: BlockData): Self = StObject.set(x, "BlockData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDataUndefined: Self = StObject.set(x, "BlockData", js.undefined)
    
    @scala.inline
    def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
    
    @scala.inline
    def setDataLength(value: DataLength): Self = StObject.set(x, "DataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLengthUndefined: Self = StObject.set(x, "DataLength", js.undefined)
  }
}
