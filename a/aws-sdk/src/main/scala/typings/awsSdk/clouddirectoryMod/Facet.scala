package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Facet extends StObject {
  
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[typings.awsSdk.clouddirectoryMod.FacetStyle] = js.native
  
  /**
    * The name of the Facet.
    */
  var Name: js.UndefOr[FacetName] = js.native
  
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectType] = js.native
}
object Facet {
  
  @scala.inline
  def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  
  @scala.inline
  implicit class FacetMutableBuilder[Self <: Facet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetStyle(value: FacetStyle): Self = StObject.set(x, "FacetStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetStyleUndefined: Self = StObject.set(x, "FacetStyle", js.undefined)
    
    @scala.inline
    def setName(value: FacetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setObjectType(value: ObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "ObjectType", js.undefined)
  }
}
