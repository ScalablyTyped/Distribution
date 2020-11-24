package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedLinkSchemaAndFacetName extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
  
  /**
    * The unique name of the typed link facet.
    */
  var TypedLinkName: typings.awsSdk.clouddirectoryMod.TypedLinkName = js.native
}
object TypedLinkSchemaAndFacetName {
  
  @scala.inline
  def apply(SchemaArn: Arn, TypedLinkName: TypedLinkName): TypedLinkSchemaAndFacetName = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any], TypedLinkName = TypedLinkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSchemaAndFacetName]
  }
  
  @scala.inline
  implicit class TypedLinkSchemaAndFacetNameOps[Self <: TypedLinkSchemaAndFacetName] (val x: Self) extends AnyVal {
    
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
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedLinkName(value: TypedLinkName): Self = this.set("TypedLinkName", value.asInstanceOf[js.Any])
  }
}
