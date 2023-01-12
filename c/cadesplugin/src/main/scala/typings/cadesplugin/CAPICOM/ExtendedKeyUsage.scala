package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedKeyUsage extends StObject {
  
  val EKUs: typings.cadesplugin.CAPICOM.EKUs
  
  def IsCritical(): Boolean
  
  def IsPresent(): Boolean
}
object ExtendedKeyUsage {
  
  inline def apply(EKUs: EKUs, IsCritical: () => Boolean, IsPresent: () => Boolean): ExtendedKeyUsage = {
    val __obj = js.Dynamic.literal(EKUs = EKUs.asInstanceOf[js.Any], IsCritical = js.Any.fromFunction0(IsCritical), IsPresent = js.Any.fromFunction0(IsPresent))
    __obj.asInstanceOf[ExtendedKeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedKeyUsage] (val x: Self) extends AnyVal {
    
    inline def setEKUs(value: EKUs): Self = StObject.set(x, "EKUs", value.asInstanceOf[js.Any])
    
    inline def setIsCritical(value: () => Boolean): Self = StObject.set(x, "IsCritical", js.Any.fromFunction0(value))
    
    inline def setIsPresent(value: () => Boolean): Self = StObject.set(x, "IsPresent", js.Any.fromFunction0(value))
  }
}
