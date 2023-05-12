package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRetirableGrantsRequest extends StObject {
  
  /**
    * <p>Use this parameter to specify the maximum number of items to return. When this
    *     value is present, KMS does not return more than the specified number of items, but it might
    *     return fewer.</p>
    *          <p>This value is optional. If you include a value, it must be between 1
    *     and 100, inclusive. If you do not include a value, it defaults to 50.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Use this parameter in a subsequent request after you receive a response with
    *     truncated results. Set it to the value of <code>NextMarker</code> from the truncated response
    *     you just received.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The retiring principal for which to list grants. Enter a principal in your
    *       Amazon Web Services account.</p>
    *          <p>To specify the retiring principal, use the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a> of an
    *       Amazon Web Services principal. Valid principals include Amazon Web Services accounts, IAM users, IAM roles,
    *       federated users, and assumed role users. For help with the ARN syntax for a principal, see
    *         <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a> in the <i>
    *                <i>Identity and Access Management User Guide</i>
    *             </i>.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.undefined
}
object ListRetirableGrantsRequest {
  
  inline def apply(): ListRetirableGrantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRetirableGrantsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRetirableGrantsRequest] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setRetiringPrincipal(value: String): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
    
    inline def setRetiringPrincipalUndefined: Self = StObject.set(x, "RetiringPrincipal", js.undefined)
  }
}
