package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFacet extends StObject {
  
  /**
    * The name of the facet.
    */
  var FacetName: js.UndefOr[typings.awsSdk.clouddirectoryMod.FacetName] = js.undefined
  
  /**
    * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object SchemaFacet {
  
  @scala.inline
  def apply(): SchemaFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacet]
  }
  
  @scala.inline
  implicit class SchemaFacetMutableBuilder[Self <: SchemaFacet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetName(value: FacetName): Self = StObject.set(x, "FacetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetNameUndefined: Self = StObject.set(x, "FacetName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
