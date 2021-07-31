package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableVersion extends StObject {
  
  /**
    * The table in question.
    */
  var Table: js.UndefOr[typings.awsSdk.glueMod.Table] = js.undefined
  
  /**
    * The ID value that identifies this table version. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
}
object TableVersion {
  
  @scala.inline
  def apply(): TableVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableVersion]
  }
  
  @scala.inline
  implicit class TableVersionMutableBuilder[Self <: TableVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    @scala.inline
    def setVersionId(value: VersionString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
