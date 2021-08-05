package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlanResponse extends StObject {
  
  /**
    * A Python script to perform the mapping.
    */
  var PythonScript: js.UndefOr[typings.awsSdk.glueMod.PythonScript] = js.undefined
  
  /**
    * The Scala code to perform the mapping.
    */
  var ScalaCode: js.UndefOr[typings.awsSdk.glueMod.ScalaCode] = js.undefined
}
object GetPlanResponse {
  
  inline def apply(): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlanResponse]
  }
  
  extension [Self <: GetPlanResponse](x: Self) {
    
    inline def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    inline def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
    
    inline def setScalaCode(value: ScalaCode): Self = StObject.set(x, "ScalaCode", value.asInstanceOf[js.Any])
    
    inline def setScalaCodeUndefined: Self = StObject.set(x, "ScalaCode", js.undefined)
  }
}
