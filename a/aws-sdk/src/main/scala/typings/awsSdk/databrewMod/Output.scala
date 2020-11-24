package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * The compression algorithm used to compress the output text of the job.
    */
  var CompressionFormat: js.UndefOr[typings.awsSdk.databrewMod.CompressionFormat] = js.native
  
  /**
    * The data format of the output of the job.
    */
  var Format: js.UndefOr[OutputFormat] = js.native
  
  /**
    * The location in Amazon S3 where the job writes its output.
    */
  var Location: S3Location = js.native
  
  /**
    * A value that, if true, means that any data in the location specified for output is overwritten with new output.
    */
  var Overwrite: js.UndefOr[OverwriteOutput] = js.native
  
  /**
    * The names of one or more partition columns for the output of the job.
    */
  var PartitionColumns: js.UndefOr[ColumnNameList] = js.native
}
object Output {
  
  @scala.inline
  def apply(Location: S3Location): Output = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: S3Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormat(value: CompressionFormat): Self = this.set("CompressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionFormat: Self = this.set("CompressionFormat", js.undefined)
    
    @scala.inline
    def setFormat(value: OutputFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setOverwrite(value: OverwriteOutput): Self = this.set("Overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("Overwrite", js.undefined)
    
    @scala.inline
    def setPartitionColumnsVarargs(value: ColumnName*): Self = this.set("PartitionColumns", js.Array(value :_*))
    
    @scala.inline
    def setPartitionColumns(value: ColumnNameList): Self = this.set("PartitionColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionColumns: Self = this.set("PartitionColumns", js.undefined)
  }
}
