package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemSize extends js.Object {
  
  /**
    * The time at which the size of data, returned in the Value field, was determined. The value is the integer number of seconds since 1970-01-01T00:00:00Z.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.efsMod.Timestamp] = js.native
  
  /**
    * The latest known metered size (in bytes) of data stored in the file system.
    */
  var Value: FileSystemSizeValue = js.native
  
  /**
    * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
    */
  var ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.native
  
  /**
    * The latest known metered size (in bytes) of data stored in the Standard storage class.
    */
  var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.native
}
object FileSystemSize {
  
  @scala.inline
  def apply(Value: FileSystemSizeValue): FileSystemSize = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSize]
  }
  
  @scala.inline
  implicit class FileSystemSizeOps[Self <: FileSystemSize] (val x: Self) extends AnyVal {
    
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
    def setValue(value: FileSystemSizeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
    
    @scala.inline
    def setValueInIA(value: FileSystemNullableSizeValue): Self = this.set("ValueInIA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInIA: Self = this.set("ValueInIA", js.undefined)
    
    @scala.inline
    def setValueInStandard(value: FileSystemNullableSizeValue): Self = this.set("ValueInStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInStandard: Self = this.set("ValueInStandard", js.undefined)
  }
}
