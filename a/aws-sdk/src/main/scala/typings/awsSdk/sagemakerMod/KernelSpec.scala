package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelSpec extends StObject {
  
  /**
    * The display name of the kernel.
    */
  var DisplayName: js.UndefOr[KernelDisplayName] = js.native
  
  /**
    * The name of the kernel.
    */
  var Name: KernelName = js.native
}
object KernelSpec {
  
  @scala.inline
  def apply(Name: KernelName): KernelSpec = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelSpec]
  }
  
  @scala.inline
  implicit class KernelSpecMutableBuilder[Self <: KernelSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: KernelDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setName(value: KernelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
