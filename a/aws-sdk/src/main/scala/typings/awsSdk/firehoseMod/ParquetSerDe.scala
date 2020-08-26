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
  def apply(): ParquetSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParquetSerDe]
  }
  @scala.inline
  implicit class ParquetSerDeOps[Self <: ParquetSerDe] (val x: Self) extends AnyVal {
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
    def setCompression(value: ParquetCompression): Self = this.set("Compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("Compression", js.undefined)
    @scala.inline
    def setEnableDictionaryCompression(value: BooleanObject): Self = this.set("EnableDictionaryCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDictionaryCompression: Self = this.set("EnableDictionaryCompression", js.undefined)
    @scala.inline
    def setMaxPaddingBytes(value: NonNegativeIntegerObject): Self = this.set("MaxPaddingBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPaddingBytes: Self = this.set("MaxPaddingBytes", js.undefined)
    @scala.inline
    def setPageSizeBytes(value: ParquetPageSizeBytes): Self = this.set("PageSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeBytes: Self = this.set("PageSizeBytes", js.undefined)
    @scala.inline
    def setWriterVersion(value: ParquetWriterVersion): Self = this.set("WriterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriterVersion: Self = this.set("WriterVersion", js.undefined)
  }
  
}

