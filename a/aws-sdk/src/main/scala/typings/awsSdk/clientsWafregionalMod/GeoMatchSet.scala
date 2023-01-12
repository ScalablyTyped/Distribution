package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchSet extends StObject {
  
  /**
    * An array of GeoMatchConstraint objects, which contain the country that you want AWS WAF to search for.
    */
  var GeoMatchConstraints: typings.awsSdk.clientsWafregionalMod.GeoMatchConstraints
  
  /**
    * The GeoMatchSetId for an GeoMatchSet. You use GeoMatchSetId to get information about a GeoMatchSet (see GeoMatchSet), update a GeoMatchSet (see UpdateGeoMatchSet), insert a GeoMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a GeoMatchSet from AWS WAF (see DeleteGeoMatchSet).  GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
  
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object GeoMatchSet {
  
  inline def apply(GeoMatchConstraints: GeoMatchConstraints, GeoMatchSetId: ResourceId): GeoMatchSet = {
    val __obj = js.Dynamic.literal(GeoMatchConstraints = GeoMatchConstraints.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoMatchSet] (val x: Self) extends AnyVal {
    
    inline def setGeoMatchConstraints(value: GeoMatchConstraints): Self = StObject.set(x, "GeoMatchConstraints", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchConstraintsVarargs(value: GeoMatchConstraint*): Self = StObject.set(x, "GeoMatchConstraints", js.Array(value*))
    
    inline def setGeoMatchSetId(value: ResourceId): Self = StObject.set(x, "GeoMatchSetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
