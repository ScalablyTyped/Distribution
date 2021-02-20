package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends StObject {
  
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
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressionFormat(value: CompressionFormat): Self = StObject.set(x, "CompressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormatUndefined: Self = StObject.set(x, "CompressionFormat", js.undefined)
    
    @scala.inline
    def setFormat(value: OutputFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setLocation(value: S3Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: OverwriteOutput): Self = StObject.set(x, "Overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "Overwrite", js.undefined)
    
    @scala.inline
    def setPartitionColumns(value: ColumnNameList): Self = StObject.set(x, "PartitionColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionColumnsUndefined: Self = StObject.set(x, "PartitionColumns", js.undefined)
    
    @scala.inline
    def setPartitionColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "PartitionColumns", js.Array(value :_*))
  }
}
