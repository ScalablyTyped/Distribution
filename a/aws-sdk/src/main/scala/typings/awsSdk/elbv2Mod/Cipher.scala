package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cipher extends StObject {
  
  /**
    * The name of the cipher.
    */
  var Name: js.UndefOr[CipherName] = js.undefined
  
  /**
    * The priority of the cipher.
    */
  var Priority: js.UndefOr[CipherPriority] = js.undefined
}
object Cipher {
  
  @scala.inline
  def apply(): Cipher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherMutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CipherName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPriority(value: CipherPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
