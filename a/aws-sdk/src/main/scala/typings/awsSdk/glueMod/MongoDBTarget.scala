package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoDBTarget extends js.Object {
  
  /**
    * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.glueMod.ConnectionName] = js.native
  
  /**
    * The path of the Amazon DocumentDB or MongoDB target (database/collection).
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. A value of true means to scan all records, while a value of false means to sample the records. If no value is specified, the value defaults to true.
    */
  var ScanAll: js.UndefOr[NullableBoolean] = js.native
}
object MongoDBTarget {
  
  @scala.inline
  def apply(): MongoDBTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDBTarget]
  }
  
  @scala.inline
  implicit class MongoDBTargetOps[Self <: MongoDBTarget] (val x: Self) extends AnyVal {
    
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
    def setConnectionName(value: ConnectionName): Self = this.set("ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionName: Self = this.set("ConnectionName", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setScanAll(value: NullableBoolean): Self = this.set("ScanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanAll: Self = this.set("ScanAll", js.undefined)
  }
}
