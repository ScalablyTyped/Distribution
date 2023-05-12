package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToLiveSpecification extends StObject {
  
  /**
    * <p>The name of the TTL attribute used to store the expiration time for items in the
    *             table.</p>
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Indicates whether TTL is to be enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object TimeToLiveSpecification {
  
  inline def apply(): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
