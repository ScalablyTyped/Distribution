package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParquetSerDe extends js.Object {
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var BlockSizeBytes: js.UndefOr[typings.awsSdk.firehoseMod.BlockSizeBytes] = js.native
  /**
    * The compression code to use over data blocks. The possible values are UNCOMPRESSED, SNAPPY, and GZIP, with the default being SNAPPY. Use SNAPPY for higher decompression speed. Use GZIP if the compression ratio is more important than speed.
    */
  var Compression: js.UndefOr[ParquetCompression] = js.native
  /**
    * Indicates whether to enable dictionary compression.
    */
  var EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.native
  /**
    * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 0.
    */
  var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.native
  /**
    * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
    */
  var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.native
  /**
    * Indicates the version of row format to output. The possible values are V1 and V2. The default is V1.
    */
  var WriterVersion: js.UndefOr[ParquetWriterVersion] = js.native
}

object ParquetSerDe {
  @scala.inline
  def apply(
    BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined,
    Compression: ParquetCompression = null,
    EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.undefined,
    MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.undefined,
    PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.undefined,
    WriterVersion: ParquetWriterVersion = null
  ): ParquetSerDe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockSizeBytes)) __obj.updateDynamic("BlockSizeBytes")(BlockSizeBytes.get.asInstanceOf[js.Any])
    if (Compression != null) __obj.updateDynamic("Compression")(Compression.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDictionaryCompression)) __obj.updateDynamic("EnableDictionaryCompression")(EnableDictionaryCompression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxPaddingBytes)) __obj.updateDynamic("MaxPaddingBytes")(MaxPaddingBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSizeBytes)) __obj.updateDynamic("PageSizeBytes")(PageSizeBytes.get.asInstanceOf[js.Any])
    if (WriterVersion != null) __obj.updateDynamic("WriterVersion")(WriterVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParquetSerDe]
  }
}

