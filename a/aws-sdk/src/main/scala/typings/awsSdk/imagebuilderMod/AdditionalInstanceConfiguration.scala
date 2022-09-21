package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalInstanceConfiguration extends StObject {
  
  /**
    * Contains settings for the Systems Manager agent on your build instance.
    */
  var systemsManagerAgent: js.UndefOr[SystemsManagerAgent] = js.undefined
  
  /**
    * Use this property to provide commands or a command script to run when you launch your build instance. The userDataOverride property replaces any commands that Image Builder might have added to ensure that Systems Manager is installed on your Linux build instance. If you override the user data, make sure that you add commands to install Systems Manager, if it is not pre-installed on your base image.  The user data is always base 64 encoded. For example, the following commands are encoded as IyEvYmluL2Jhc2gKbWtkaXIgLXAgL3Zhci9iYi8KdG91Y2ggL3Zhci$:  #!/bin/bash  mkdir -p /var/bb/ touch /var 
    */
  var userDataOverride: js.UndefOr[UserDataOverride] = js.undefined
}
object AdditionalInstanceConfiguration {
  
  inline def apply(): AdditionalInstanceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalInstanceConfiguration]
  }
  
  extension [Self <: AdditionalInstanceConfiguration](x: Self) {
    
    inline def setSystemsManagerAgent(value: SystemsManagerAgent): Self = StObject.set(x, "systemsManagerAgent", value.asInstanceOf[js.Any])
    
    inline def setSystemsManagerAgentUndefined: Self = StObject.set(x, "systemsManagerAgent", js.undefined)
    
    inline def setUserDataOverride(value: UserDataOverride): Self = StObject.set(x, "userDataOverride", value.asInstanceOf[js.Any])
    
    inline def setUserDataOverrideUndefined: Self = StObject.set(x, "userDataOverride", js.undefined)
  }
}
