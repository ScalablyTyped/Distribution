package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCliTokenRequest extends StObject {
  
  /**
    * The name of the Amazon MWAA environment. For example, MyMWAAEnvironment.
    */
  var Name: EnvironmentName
}
object CreateCliTokenRequest {
  
  inline def apply(Name: EnvironmentName): CreateCliTokenRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCliTokenRequest]
  }
  
  extension [Self <: CreateCliTokenRequest](x: Self) {
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
