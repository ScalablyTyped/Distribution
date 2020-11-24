package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLevelStatistics extends js.Object {
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't have a file name extension for a supported file or storage format.
    */
  var fileType: js.UndefOr[long] = js.native
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an unsupported storage class.
    */
  var storageClass: js.UndefOr[long] = js.native
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an unsupported storage class or don't have a file name extension for a supported file or storage format.
    */
  var total: js.UndefOr[long] = js.native
}
object ObjectLevelStatistics {
  
  @scala.inline
  def apply(): ObjectLevelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLevelStatistics]
  }
  
  @scala.inline
  implicit class ObjectLevelStatisticsOps[Self <: ObjectLevelStatistics] (val x: Self) extends AnyVal {
    
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
    def setFileType(value: long): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setStorageClass(value: long): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    
    @scala.inline
    def setTotal(value: long): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
