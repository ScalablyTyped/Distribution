package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystemConfigurationManager extends StObject {
  
  /**
    * The name of the configuration manager, which is Chef.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The versions of the configuration manager that are supported by an operating system.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object OperatingSystemConfigurationManager {
  
  @scala.inline
  def apply(): OperatingSystemConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemConfigurationManager]
  }
  
  @scala.inline
  implicit class OperatingSystemConfigurationManagerMutableBuilder[Self <: OperatingSystemConfigurationManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
