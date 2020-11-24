package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFacet extends js.Object {
  
  /**
    * The name of the facet.
    */
  var FacetName: js.UndefOr[typings.awsSdk.clouddirectoryMod.FacetName] = js.native
  
  /**
    * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}
object SchemaFacet {
  
  @scala.inline
  def apply(): SchemaFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacet]
  }
  
  @scala.inline
  implicit class SchemaFacetOps[Self <: SchemaFacet] (val x: Self) extends AnyVal {
    
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
    def setFacetName(value: FacetName): Self = this.set("FacetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetName: Self = this.set("FacetName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
  }
}
