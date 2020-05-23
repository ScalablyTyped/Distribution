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
  def apply(
    BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
    BloomFilterColumns: ListOfNonEmptyStringsWithoutWhitespace = null,
    BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.undefined,
    Compression: OrcCompression = null,
    DictionaryKeyThreshold: js.UndefOr[Proportion] = js.undefined,
    EnablePadding: js.UndefOr[BooleanObject] = js.undefined,
    FormatVersion: OrcFormatVersion = null,
    PaddingTolerance: js.UndefOr[Proportion] = js.undefined,
    RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.undefined,
    StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined
  ): OrcSerDe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockSizeBytes)) __obj.updateDynamic("BlockSizeBytes")(BlockSizeBytes.get.asInstanceOf[js.Any])
    if (BloomFilterColumns != null) __obj.updateDynamic("BloomFilterColumns")(BloomFilterColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(BloomFilterFalsePositiveProbability)) __obj.updateDynamic("BloomFilterFalsePositiveProbability")(BloomFilterFalsePositiveProbability.get.asInstanceOf[js.Any])
    if (Compression != null) __obj.updateDynamic("Compression")(Compression.asInstanceOf[js.Any])
    if (!js.isUndefined(DictionaryKeyThreshold)) __obj.updateDynamic("DictionaryKeyThreshold")(DictionaryKeyThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnablePadding)) __obj.updateDynamic("EnablePadding")(EnablePadding.get.asInstanceOf[js.Any])
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(PaddingTolerance)) __obj.updateDynamic("PaddingTolerance")(PaddingTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RowIndexStride)) __obj.updateDynamic("RowIndexStride")(RowIndexStride.get.asInstanceOf[js.Any])
    if (!js.isUndefined(StripeSizeBytes)) __obj.updateDynamic("StripeSizeBytes")(StripeSizeBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrcSerDe]
  }
}

