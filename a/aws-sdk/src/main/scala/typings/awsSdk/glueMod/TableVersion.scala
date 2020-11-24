package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableVersion extends js.Object {
  
  /**
    * The table in question.
    */
  var Table: js.UndefOr[typings.awsSdk.glueMod.Table] = js.native
  
  /**
    * The ID value that identifies this table version. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.native
}
object TableVersion {
  
  @scala.inline
  def apply(): TableVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableVersion]
  }
  
  @scala.inline
  implicit class TableVersionOps[Self <: TableVersion] (val x: Self) extends AnyVal {
    
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
    def setTable(value: Table): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    
    @scala.inline
    def setVersionId(value: VersionString): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
