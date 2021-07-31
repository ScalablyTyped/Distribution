package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mitigation extends StObject {
  
  /**
    * The name of the mitigation taken for this attack.
    */
  var MitigationName: js.UndefOr[String] = js.undefined
}
object Mitigation {
  
  @scala.inline
  def apply(): Mitigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mitigation]
  }
  
  @scala.inline
  implicit class MitigationMutableBuilder[Self <: Mitigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMitigationName(value: String): Self = StObject.set(x, "MitigationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitigationNameUndefined: Self = StObject.set(x, "MitigationName", js.undefined)
  }
}
