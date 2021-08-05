package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeConstraintSet extends StObject {
  
  /**
    * The name, if any, of the SizeConstraintSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
  
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  var SizeConstraints: typings.awsSdk.wafMod.SizeConstraints
}
object SizeConstraintSet {
  
  inline def apply(SizeConstraintSetId: ResourceId, SizeConstraints: SizeConstraints): SizeConstraintSet = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any], SizeConstraints = SizeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSet]
  }
  
  extension [Self <: SizeConstraintSet](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSizeConstraintSetId(value: ResourceId): Self = StObject.set(x, "SizeConstraintSetId", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraints(value: SizeConstraints): Self = StObject.set(x, "SizeConstraints", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintsVarargs(value: SizeConstraint*): Self = StObject.set(x, "SizeConstraints", js.Array(value :_*))
  }
}
