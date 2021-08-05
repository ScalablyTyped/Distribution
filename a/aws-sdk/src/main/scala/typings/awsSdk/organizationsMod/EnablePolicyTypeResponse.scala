package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePolicyTypeResponse extends StObject {
  
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typings.awsSdk.organizationsMod.Root] = js.undefined
}
object EnablePolicyTypeResponse {
  
  inline def apply(): EnablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnablePolicyTypeResponse]
  }
  
  extension [Self <: EnablePolicyTypeResponse](x: Self) {
    
    inline def setRoot(value: Root): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
