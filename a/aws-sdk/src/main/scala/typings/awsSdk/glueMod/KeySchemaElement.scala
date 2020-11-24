package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySchemaElement extends js.Object {
  
  /**
    * The name of a partition key.
    */
  var Name: NameString = js.native
  
  /**
    * The type of a partition key.
    */
  var Type: ColumnTypeString = js.native
}
object KeySchemaElement {
  
  @scala.inline
  def apply(Name: NameString, Type: ColumnTypeString): KeySchemaElement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
  
  @scala.inline
  implicit class KeySchemaElementOps[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ColumnTypeString): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
