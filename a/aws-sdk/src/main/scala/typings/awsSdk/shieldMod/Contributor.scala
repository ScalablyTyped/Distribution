package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributor extends StObject {
  
  /**
    * The name of the contributor. This is dependent on the AttackPropertyIdentifier. For example, if the AttackPropertyIdentifier is SOURCE_COUNTRY, the Name could be United States.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The contribution of this contributor expressed in Protection units. For example 10,000.
    */
  var Value: js.UndefOr[Long] = js.undefined
}
object Contributor {
  
  @scala.inline
  def apply(): Contributor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contributor]
  }
  
  @scala.inline
  implicit class ContributorMutableBuilder[Self <: Contributor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: Long): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
