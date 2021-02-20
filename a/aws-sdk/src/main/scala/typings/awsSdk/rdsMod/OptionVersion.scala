package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionVersion extends StObject {
  
  /**
    * True if the version is the default version of the option, and otherwise false.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of the option.
    */
  var Version: js.UndefOr[String] = js.native
}
object OptionVersion {
  
  @scala.inline
  def apply(): OptionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionVersion]
  }
  
  @scala.inline
  implicit class OptionVersionMutableBuilder[Self <: OptionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
