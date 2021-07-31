package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScriptResponse extends StObject {
  
  /**
    * The Python script generated from the DAG.
    */
  var PythonScript: js.UndefOr[typings.awsSdk.glueMod.PythonScript] = js.undefined
  
  /**
    * The Scala code generated from the DAG.
    */
  var ScalaCode: js.UndefOr[typings.awsSdk.glueMod.ScalaCode] = js.undefined
}
object CreateScriptResponse {
  
  @scala.inline
  def apply(): CreateScriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptResponse]
  }
  
  @scala.inline
  implicit class CreateScriptResponseMutableBuilder[Self <: CreateScriptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
    
    @scala.inline
    def setScalaCode(value: ScalaCode): Self = StObject.set(x, "ScalaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalaCodeUndefined: Self = StObject.set(x, "ScalaCode", js.undefined)
  }
}
