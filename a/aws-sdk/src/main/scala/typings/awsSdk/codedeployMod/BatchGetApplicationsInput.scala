package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetApplicationsInput extends StObject {
  
  /**
    * A list of application names separated by spaces. The maximum number of application names you can specify is 100.
    */
  var applicationNames: ApplicationsList
}
object BatchGetApplicationsInput {
  
  inline def apply(applicationNames: ApplicationsList): BatchGetApplicationsInput = {
    val __obj = js.Dynamic.literal(applicationNames = applicationNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationsInput]
  }
  
  extension [Self <: BatchGetApplicationsInput](x: Self) {
    
    inline def setApplicationNames(value: ApplicationsList): Self = StObject.set(x, "applicationNames", value.asInstanceOf[js.Any])
    
    inline def setApplicationNamesVarargs(value: ApplicationName*): Self = StObject.set(x, "applicationNames", js.Array(value*))
  }
}
