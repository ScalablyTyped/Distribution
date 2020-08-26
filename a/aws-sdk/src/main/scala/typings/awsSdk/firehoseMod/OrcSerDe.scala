package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrcSerDe extends js.Object {
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var BlockSizeBytes: js.UndefOr[typings.awsSdk.firehoseMod.BlockSizeBytes] = js.native
  /**
    * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is null.
    */
  var BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace] = js.native
  /**
    * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is 0, and the maximum is 1.
    */
  var BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.native
  /**
    * The compression code to use over data blocks. The default is SNAPPY.
    */
  var Compression: js.UndefOr[OrcCompression] = js.native
  /**
    * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
    */
  var DictionaryKeyThreshold: js.UndefOr[Proportion] = js.native
  /**
    * Set this to true to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is false.
    */
  var EnablePadding: js.UndefOr[BooleanObject] = js.native
  /**
    * The version of the file to write. The possible values are V0_11 and V0_12. The default is V0_12.
    */
  var FormatVersion: js.UndefOr[OrcFormatVersion] = js.native
  /**
    * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is 0.05, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when OrcSerDe$EnablePadding is false.
    */
  var PaddingTolerance: js.UndefOr[Proportion] = js.native
  /**
    * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
    */
  var RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.native
  /**
    * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
    */
  var StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.native
}

object OrcSerDe {
  @scala.inline
  def apply(): OrcSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrcSerDe]
  }
  @scala.inline
  implicit class OrcSerDeOps[Self <: OrcSerDe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockSizeBytes(value: BlockSizeBytes): Self = this.set("BlockSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSizeBytes: Self = this.set("BlockSizeBytes", js.undefined)
    @scala.inline
    def setBloomFilterColumnsVarargs(value: NonEmptyStringWithoutWhitespace*): Self = this.set("BloomFilterColumns", js.Array(value :_*))
    @scala.inline
    def setBloomFilterColumns(value: ListOfNonEmptyStringsWithoutWhitespace): Self = this.set("BloomFilterColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBloomFilterColumns: Self = this.set("BloomFilterColumns", js.undefined)
    @scala.inline
    def setBloomFilterFalsePositiveProbability(value: Proportion): Self = this.set("BloomFilterFalsePositiveProbability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBloomFilterFalsePositiveProbability: Self = this.set("BloomFilterFalsePositiveProbability", js.undefined)
    @scala.inline
    def setCompression(value: OrcCompression): Self = this.set("Compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("Compression", js.undefined)
    @scala.inline
    def setDictionaryKeyThreshold(value: Proportion): Self = this.set("DictionaryKeyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionaryKeyThreshold: Self = this.set("DictionaryKeyThreshold", js.undefined)
    @scala.inline
    def setEnablePadding(value: BooleanObject): Self = this.set("EnablePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePadding: Self = this.set("EnablePadding", js.undefined)
    @scala.inline
    def setFormatVersion(value: OrcFormatVersion): Self = this.set("FormatVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatVersion: Self = this.set("FormatVersion", js.undefined)
    @scala.inline
    def setPaddingTolerance(value: Proportion): Self = this.set("PaddingTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTolerance: Self = this.set("PaddingTolerance", js.undefined)
    @scala.inline
    def setRowIndexStride(value: OrcRowIndexStride): Self = this.set("RowIndexStride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndexStride: Self = this.set("RowIndexStride", js.undefined)
    @scala.inline
    def setStripeSizeBytes(value: OrcStripeSizeBytes): Self = this.set("StripeSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeSizeBytes: Self = this.set("StripeSizeBytes", js.undefined)
  }
  
}

